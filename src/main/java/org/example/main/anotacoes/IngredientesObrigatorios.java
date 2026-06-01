package org.example.main.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação para armazenar um array de ingredientes marcados como obrigatórios para preparo da bebida.
 *
 * @Target(TYPE) indica que só pode ser usada em classes.
 * @Retention(RUNTIME) indica que a anotação é carregada em tempo de execução, permitindo
 *  *                     que a Reflexão a leia via getAnnotation();
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IngredientesObrigatorios {
    IngredienteObrigatorio[] value();
}
