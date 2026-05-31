package org.example.main.anotacoes;

import org.example.main.bebidas.enums.Ingrediente;

import java.lang.annotation.*;

/**
 * Anotação para marcar um ingrediente como obrigatório para o preparo de uma bebida
 *
 * @Target(TYPE) indica que só pode ser usada em classes.
 * @Retention(RUNTIME) indica que a anotação é carregada em tempo de execução, permitindo
 *                     que a Reflexão a leia via getAnnotation();
 * @Repeatable indica que poderá ser mais de um ingrediente obrigatório, através da anotação
 *             de IngredientesObrigatorios.class
 */

@Repeatable(IngredientesObrigatorios.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IngredienteObrigatorio {
    Ingrediente ingrediente();
    String mensagemDeErro() default "Ingrediente obrigatótrio não disponível";
}
