/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segob.silverjuridico.utils;

import java.io.Serializable;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author nidia
 */
public class HibernateUtil implements Serializable {

    private static final long serialVersionUID = 1123581321L;

    private static final Logger log = LoggerFactory.getLogger(HibernateUtil.class);
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml

            sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            log.error("Creacion Inicial de SessionFactory para Hibernate ha fallado.", ex);

            log.error(ex.getMessage(), ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
