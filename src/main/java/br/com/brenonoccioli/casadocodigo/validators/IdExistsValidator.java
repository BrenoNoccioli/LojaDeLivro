package br.com.brenonoccioli.casadocodigo.validators;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;


public class IdExistsValidator implements ConstraintValidator<IdExists, Object> {
    private String domainAttribute;
    private Class<?> clazz;

    @PersistenceContext
    private EntityManager em;

    @Override
    public void initialize(IdExists object) {
        domainAttribute = object.field();
        clazz = object.domainClass();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        Query query = em.createQuery("select 1 from "+clazz.getName()+" where id =:value");
        query.setParameter("value", value);
        List<?> list = query.getResultList();
        return !list.isEmpty() || value == null;
    }
}
