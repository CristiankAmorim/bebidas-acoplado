package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public abstract class Bebida {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    public final void preparar() {

        System.out.println("========== PREPARANDO " + getNome().toUpperCase() + " ==========");

        escolherIngredientes();
        if(precisaFerver()) {
            ferver();
        }

        prepararEspecifico();
        servir();

        System.out.println("=".repeat(getNome().length() + 21) + "\n");
    }

    protected boolean precisaFerver() {
        return true;
    }

    protected abstract void prepararEspecifico();

    protected abstract String getNome();

    private void ferver() {
        System.out.println("Fervendo a/o " + ingredientes.get(0));
        System.out.println(ingredientes.get(0) + " fervido(a)");
    }

    private void escolherIngredientes() {
        if(this.ingredientes.isEmpty()) {
            throw new RuntimeException("Estoque de ingredientes vazio");
        }

        System.out.println("Escolhendo ingredientes: ");
        for(Ingrediente i : ingredientes) {
            System.out.println("Ingrediente: " + i.getDescricao() + " escolhido");
        }
    }

    private void servir(){
        System.out.println("Servindo a bebida...");
        System.out.println("Bebida pronta para consumo");
    }

    public void adicionarIngredientesAoEstoque(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

}
