package org.example.main.bebidas.enums;
//Definindo o conjunto fixo de constantes nomeadas.
public enum Ingrediente {
    AGUA("Água"),
    PO_DE_CAFE("Pó de café"),
    CHOCOLATE_EM_PO("Chocolate em pó"),
    LEITE("Leite"),
    ACUCAR("Açucar"),
    ABACAXI("Abacaxi"),
    LARANJA("Laranja"),
    MORANGO("Morango"),
    LIMAO("Limão"),
    UVA("Uva"),
    CANELA("Canela"),
    SACHE("Sachê");

    private final String descricao;
    Ingrediente (String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    // Objeto sobreescrito para o retorno da descrição legível.
    @Override
    public String toString(){
        return descricao;
    }

}
