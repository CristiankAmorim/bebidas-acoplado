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
    }
}
