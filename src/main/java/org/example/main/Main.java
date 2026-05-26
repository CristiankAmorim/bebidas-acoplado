package org.example.main;

import org.example.main.bebidas.Cafe;
import org.example.main.bebidas.Cha;
import org.example.main.bebidas.ChocolateQuente;
import org.example.main.bebidas.Suco;
import org.example.main.bebidas.enums.Ingrediente;

public class Main {
    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.adicionarIngrediente(Ingrediente.ACUCAR);
        cafe.adicionarIngrediente(Ingrediente.LEITE);
        cafe.preparar();

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