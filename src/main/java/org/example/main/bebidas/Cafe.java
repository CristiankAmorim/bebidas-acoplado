package org.example.main.bebidas;

import org.example.main.anotacoes.IngredienteObrigatorio;
import org.example.main.bebidas.enums.Ingrediente;

/**
 * Sublcasse de Bebida
 * Marca o ingrediente pó de café como obrigatório para o preparo.
 */
@IngredienteObrigatorio(ingrediente = Ingrediente.PO_DE_CAFE)
public class Cafe extends Bebida {

    //Define os passos específicos da bebida café.
    @Override
    protected void prepararEspecifico() {
        System.out.println("Adicionando o açucar");
        System.out.println("Adicionando o pó de café");
        System.out.println("Mexendo...");
        System.out.println(getNome() + " coado");
    }

    @Override
    protected String getNome() {
        return "Café";
    }
}


