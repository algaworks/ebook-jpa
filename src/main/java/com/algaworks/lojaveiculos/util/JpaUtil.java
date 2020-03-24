package com.algaworks.lojaveiculos.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

    private static EntityManagerFactory factory;

    static {
        factory = Persistence.createEntityManagerFactory("AlgaWorks-PU");
    }

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void close() {
        factory.close();
    }
}