package com.ohgiraffers.mapping.section01.entity;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class SnackRepository {
    @PersistenceContext
    private EntityManager manager;

    public void save(Snack snack){ manager.persist(snack); }
}
