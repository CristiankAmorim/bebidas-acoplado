package org.example.main.bebidas;

import org.example.main.anotacoes.IngredienteObrigatorio;
import org.example.main.bebidas.enums.Ingrediente;

/**
 * Subclasse de Bebida
 * Marca o ingrediente sachê como obrigatório para o preparo.
 */
@IngredienteObrigatorio(ingrediente = Ingrediente.SACHE)
public class Cha extends Bebida {

    //Define os passos específicos da bebida chá.
    @Override
    protected void prepararEspecifico() {
        System.out.println("Colocando o sachê na água");
        System.out.println("Mergulhando o sachê por 3 minutos ");
        System.out.println("Removendo o sacheê");
        System.out.println(getNome() + " pronto");
    }
    @Override
    protected String getNome() {
        return "Chá";
        }
    }

