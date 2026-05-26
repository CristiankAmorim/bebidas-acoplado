package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;

    }

    private void ferver() {
        System.out.println("Fervendo a água...");
        System.out.println("Água fervida");
    }

    private void coar() {
        System.out.println("Coando o café...");
        System.out.println("Café coado");
    }

    private void servir(){
        System.out.println("Servindo a bebida na xícara ");
        System.out.println("Bebida pronta para consumo ");
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
        System.out.println("Preparando café");
        ferver();
        coar();
        adicionarIngredientesABebida();
        servir();
        System.out.println("\n");
    }
}


