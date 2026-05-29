package org.example.main.bebidas.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Anotação para marcar ingredientes obrigatório para fazer uma bebida.
 *
 * @Target(TYPE) -> Indica que a anotação só pode ser usada em classes.
 * @Retention(RUNTIME)  → mantida no bytecode e carregada em execução,
 *  *                     permitindo que a Reflexão a leia via getAnnotation()
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IngredienteObrigatorio {
    String descricao(); // nome do ingrediente
    String mensagemdeErro() default "Igrediente obrigatório esgotado.";
}
