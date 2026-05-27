package org.example.main;

import org.example.main.bebidas.Cafe;
import org.example.main.bebidas.Cha;
import org.example.main.bebidas.ChocolateQuente;
import org.example.main.bebidas.Suco;
import org.example.main.bebidas.enums.Ingrediente;

public class Main {
    public static void main(String[] args) {

        List<Bebida> bebidas = new ArrayList<>();

        Cafe cafe = new Cafe();
        cafe.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
        cafe.adicionarIngredientesAoEstoque(Ingrediente.PO_DE_CAFE);
        cafe.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
        bebidas.add(cafe);

        Cha cha = new Cha();
        cha.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
        cha.adicionarIngredientesAoEstoque(Ingrediente.SACHE);
        cha.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
        cha.adicionarIngredientesAoEstoque(Ingrediente.CANELA);
        bebidas.add(cha);

        ChocolateQuente chocolate = new ChocolateQuente();
        chocolate.adicionarIngredientesAoEstoque(Ingrediente.LEITE);
        chocolate.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
        chocolate.adicionarIngredientesAoEstoque(Ingrediente.CHOCOLATE_EM_PO);
        bebidas.add(chocolate);

        Suco suco = new Suco();
        suco.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
        suco.adicionarIngredientesAoEstoque(Ingrediente.LARANJA);
        suco.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
        bebidas.add(suco);

        for(Bebida bebida : bebidas) {
            try {
                bebida.preparar();
            }catch (RuntimeException e) {
                System.out.println(e.getMessage() + "\n");
            }
        }


        /*Scanner sc = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("Escolha uma bebida:");
            System.out.println("1 - Café");
            System.out.println("2 - Chá");
            System.out.println("3 - Chocolate Quente");
            System.out.println("4 - Suco");
            System.out.println("5 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Café");
                    Cafe cafe = new Cafe();
                    cafe.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
                    cafe.adicionarIngredientesAoEstoque(Ingrediente.PO_DE_CAFE);
                    cafe.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
                    try {
                        cafe.preparar();
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

        ChocolateQuente chocolate = new ChocolateQuente();
        chocolate.adicionarIngrediente(Ingrediente.LEITE);
        chocolate.adicionarIngrediente(Ingrediente.ACUCAR);
        chocolate.adicionarIngrediente(Ingrediente.CANELA);
        chocolate.preparar();


        Suco suco = new Suco();
        suco.adicionarIngrediente(Ingrediente.AGUA);
        suco.adicionarIngrediente(Ingrediente.LARANJA);
        suco.adicionarIngrediente(Ingrediente.ACUCAR);
        suco.preparar();

        Cha cha = new Cha();
        cha.adicionarIngrediente(Ingrediente.AGUA);
        cha.adicionarIngrediente(Ingrediente.SACHE);
        cha.adicionarIngrediente(Ingrediente.ACUCAR);
        cha.adicionarIngrediente(Ingrediente.CANELA);
        cha.preparar();
    }
}