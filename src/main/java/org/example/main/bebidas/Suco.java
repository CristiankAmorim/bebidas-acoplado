package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Suco extends Bebida{

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

    @Override
    protected boolean precisaFerver() {
        return false;
    }
}
