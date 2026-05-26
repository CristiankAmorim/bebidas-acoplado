package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Suco {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    private void bater() {
        System.out.println("Colocando a(s) fruta(s) no liquidificador...");
        System.out.println("Adicionando leite ou água...");
        System.out.println("Batendo...");
        System.out.println("Finalizado");
    }

    private void servir() {
        System.out.println("Servindo a bebida no copo...");
        System.out.println("Bebida pronta para consumo!");
    }

    private void adicionarIngredientesABebida() {
        System.out.println("Adicionando ingredientes: ");
        if(ingredientes.isEmpty())
            throw new RuntimeException("Lista de ingredientres vazia");

        for(Ingrediente i : ingredientes) {
            System.out.println("Ingrediente: " + i.getDescricao() + " adicionado");
        }
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void preparar(){
        System.out.println("Preparando suco");
        adicionarIngredientesABebida();
        bater();
        servir();
        System.out.println("\n");
    }

}
