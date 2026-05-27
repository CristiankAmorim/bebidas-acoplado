package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Cafe extends Bebida {

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


