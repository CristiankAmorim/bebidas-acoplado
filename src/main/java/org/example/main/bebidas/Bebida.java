package org.example.main.bebidas;

import org.example.main.bebidas.enums.Ingrediente;
import org.example.main.validador.Validador;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe abstrata que o define o esqueleto do algoritmo de preparo de qualquer bebida.
 * Todas as bebidas herdam dessa classe, permitindo assim, o uso do polimosfismo.
 */
public abstract class Bebida {

    private List<Ingrediente> ingredientes = new ArrayList<>();

    /**
     * O TEMPLATE METHOD - esqueleto do algoritmo, imutável
     *
     * Define a sequência fixa de preparo de qualquer bebida.
     * Declarado como final: assim, nenhuma subclasse pode sobrescrevê-lo.
     */
    public final void preparar() {

        Validador validador = new Validador();
        String erro = validador.validar(this);

        if(!erro.isEmpty()) {
            System.out.println(erro + "\n");
        } else {
            System.out.println("========== PREPARANDO " + getNome().toUpperCase() + " ==========");

            escolherIngredientes();
            if(precisaFerver()) {
                ferver();
            }

            prepararEspecifico();
            servir();

            System.out.println("=".repeat(getNome().length() + 33) + "\n");
        }

    }

    /**
     * Hook: subclasses podem sobrescerver para indicar se a bebida precisa ser ou não fervida.
     *
     * @return valor padrão (true), a maioria precisa ferver.
     * Suco não precisa, sobrescreve como false.
     */
    protected boolean precisaFerver() {
        return true;
    }

    /**
     * Cada subclasse deve implementar um passo específico de preparo.
     * Esse metodo sempre varia entre cada bebida.
     */
    protected abstract void prepararEspecifico();

    // Retorna o nome da bebida para exibição.
    protected abstract String getNome();

    /**
     * Passo comum entre 3 bebidas
     * Agora existe somente aqui e todas as subclasse herdam
     * Evita a duplicidade
     */
    private void ferver() {
        System.out.println("Fervendo a/o " + ingredientes.get(0));
        System.out.println(ingredientes.get(0) + " fervido(a)");
    }

    /**
     * Paaso comum entre todas as bebidas
     * Antes estava presente em todas as subclases
     * Agora todas as subclasses herdam esse metodo
     */
    private void escolherIngredientes() {
        if(this.ingredientes.isEmpty()) {
            throw new RuntimeException("Estoque de ingredientes vazio");
        }

        System.out.println("Escolhendo ingredientes: ");
        for(Ingrediente i : ingredientes) {
            System.out.println("Ingrediente: " + i.getDescricao() + " escolhido");
        }
    }

    /**
     * Paaso comum entre todas as bebidas
     * Antes estava presente em todas as subclases
     * Agora todas as subclasses herdam esse metodo
     */
    private void servir(){
        System.out.println("Servindo a bebida...");
        System.out.println("Bebida pronta para consumo");
    }

    /**
     * Metodo compartilhado por todas as subclasses
     * @param ingrediente ingrediente a ser adicionado ao estoque (atributo ingredientes do tipo List)
     */
    public void adicionarIngredientesAoEstoque(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

}
