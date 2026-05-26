package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class Cha {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    private void ferver() {
        System.out.println("Fervendo a água");
        System.out.println("Água fervida");
    }

    private void infusionar() {
        System.out.println("Mergulhando o sachê de chá na água quente...");
        System.out.println("Aguardando infusão por 3 minutos...");
        System.out.println("Removendo o sachê");
    }

    private void servir(){
        System.out.println("Servindo a bebida na xícara");
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
        System.out.println("Preparando a água para o chá");
        ferver();
        infusionar();
        adicionarIngredientesABebida();
        servir();
        System.out.println("\n");
    }
}
