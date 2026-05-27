package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Cha extends Bebida {

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

