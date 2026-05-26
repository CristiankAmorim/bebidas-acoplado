package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class ChocolateQuente {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    private void ferver() {
        System.out.println("Fervendo o leite...");
        System.out.println("Leite fervido");
    }

    private void dissolver() {
        System.out.println("Dissolvendo o chocolate em pó no leite quente...");
        System.out.println("Mexendo até obter consistência homogênea");
        System.out.println("Chocolate dissolvido");
    }

    private void servir(){
        System.out.println("Servindo a bebida na caneca ");
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
        System.out.println("Preparando chocolate quente");
        ferver();
        dissolver();
        adicionarIngredientesABebida();
        servir();
        System.out.println("\n");
    }
}
