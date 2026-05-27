package org.example.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.main.bebidas.*;
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

                case 2:
                    System.out.println("Chá");
                    Cha cha = new Cha();
                    cha.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
                    cha.adicionarIngredientesAoEstoque(Ingrediente.SACHE);
                    cha.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
                    cha.adicionarIngredientesAoEstoque(Ingrediente.CANELA);
                    try {
                        cha.preparar();
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Chocolate Quente");
                    ChocolateQuente chocolate = new ChocolateQuente();
                    chocolate.adicionarIngredientesAoEstoque(Ingrediente.LEITE);
                    chocolate.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
                    chocolate.adicionarIngredientesAoEstoque(Ingrediente.CHOCOLATE_EM_PO);
                    try {
                        chocolate.preparar();
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Suco.");
                    Suco suco = new Suco();
                    suco.adicionarIngredientesAoEstoque(Ingrediente.AGUA);
                    suco.adicionarIngredientesAoEstoque(Ingrediente.LARANJA);
                    suco.adicionarIngredientesAoEstoque(Ingrediente.ACUCAR);
                    try {
                        suco.preparar();
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }while(opcao != 5);*/
        //sc.close();
    }
}