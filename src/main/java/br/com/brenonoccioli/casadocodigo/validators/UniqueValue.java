package br.com.brenonoccioli.casadocodigo.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = {UniqueValueValidator.class})
public @interface UniqueValue {

    String message() default "{o campo já foi cadastrado e não pode ser duplicado}";

    Class<?>[] groups() default{ };

    Class<? extends Payload>[] payload() default{};

    String field();
    Class<?> domainClass();
}
