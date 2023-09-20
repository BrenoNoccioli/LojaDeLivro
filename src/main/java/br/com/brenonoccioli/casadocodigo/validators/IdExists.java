package br.com.brenonoccioli.casadocodigo.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {IdExistsValidator.class})
public @interface IdExists {

    String message() default "{id não existe no banco de dados}";

    Class<?>[] groups() default{ };

    Class<? extends Payload>[] payload() default{};

    String field();
    Class<?> domainClass();
}
