package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class ChocolateQuente extends Bebida {

    @Override
    protected void prepararEspecifico() {
        System.out.println("Disolvendo o chocolate em po no leite quente");
        System.out.println("Mexendo até obter consistência homogênea");
        System.out.println(getNome() + " pronto") ;

    }
    @Override
    protected String getNome() {
        return "Chocolate Quente";
    }
}


