package org.example.main.bebidas;

import org.example.main.anotacoes.IngredienteObrigatorio;
import org.example.main.bebidas.enums.Ingrediente;

/**
 * Sublcasse de Bebida
 * Marca o ingediente água como obrigatório para o preparo.
 */
@IngredienteObrigatorio(ingrediente = Ingrediente.AGUA)
public class Suco extends Bebida{

     //Define os passos específicos da bebida suco.
    @Override
    protected void prepararEspecifico() {
        System.out.println("Colocando a(s) fruta(s) no liquidificador...");
        System.out.println("Adicionando leite ou água...");
        System.out.println("Batendo...");
        System.out.println("Finalizado");
    }

    @Override
    protected String getNome() {
        return "Suco";
    }

    /**
     * Hook sobrescrito: suco não é necessário ferver a água
     * @return sobrescreve como false
     */
    @Override
    protected boolean precisaFerver() {
        return false;
    }
}
