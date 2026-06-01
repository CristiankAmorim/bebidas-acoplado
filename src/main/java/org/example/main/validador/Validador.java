package org.example.main.validador;

import org.example.main.anotacoes.IngredienteObrigatorio;
import org.example.main.bebidas.enums.Ingrediente;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Validador que usa Reflexão para inspecionar qualquer objeto do tipo Bebida.
 *
 */
public class Validador {

    /**
     * Valida se a classe que está anotada com @IngredienteObrigatorio corretamente preenchido
     * (não nulo_ no objeto recebido).
     * @param objeto qualquer instância de Bebida ou subclasses
     * @return nome do(s) ingrediente(s) obrigatório(s) que não foi adicinado.
     */
    public String validar(Object objeto) {
        String erro = "";

        // PASSO 1: obtém a metaclasse via Reflexão
        Class<?> classe = objeto.getClass();

        // PASSO 2: lê todas as repetições de @IngredienteObrigatorio da CLASSE
        IngredienteObrigatorio[] obrigatorios = classe.getAnnotationsByType(IngredienteObrigatorio.class);

        // PASSO 3: acessa a lista de ingredientes que está na superclasse Bebida
        try {
            Field campoLista = classe.getSuperclass().getDeclaredField("ingredientes");
            campoLista.setAccessible(true);
            List<Ingrediente> lista = (List<Ingrediente>) campoLista.get(objeto);

            // PASSO 4: para cada ingrediente obrigatório, verifica se está na lista
            for (IngredienteObrigatorio obrigatorio : obrigatorios) {
                if (!lista.contains(obrigatorio.ingrediente())) {
                    erro += "[ERRO] " + obrigatorio.ingrediente().getDescricao()
                            + " -> " + obrigatorio.mensagemDeErro() + "\n";
                }
            }

        } catch (NoSuchFieldException | IllegalAccessException e) {
            erro += "[REFLEXAO] Nao foi possivel acessar o estoque de ingredientes";
        }

        return erro;
    }


}
