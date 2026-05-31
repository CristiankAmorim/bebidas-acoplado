package org.example.main.bebidas;

import org.example.main.anotacoes.IngredienteObrigatorio;
import org.example.main.bebidas.enums.Ingrediente;

/**
 * Subclasse de Bebida
 * Marca o ingrediente chocolate em pó como obrigatório para o preparo.
 */
@IngredienteObrigatorio(ingrediente = Ingrediente.CHOCOLATE_EM_PO)
public class ChocolateQuente extends Bebida {

    //Define os passos específicos da bebida chocolate quente
    @Override
    protected void prepararEspecifico() {
        System.out.println("Disolvendo o chocolate em po no leite quente");
        System.out.println("Mexendo até obter consistência homogênea");
        System.out.println(getNome() + " pronto") ;

    }
    @Override
    protected String getNome() {
        return "Chocolate Quente";
    }
}


