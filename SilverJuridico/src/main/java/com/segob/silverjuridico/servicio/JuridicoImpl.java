/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segob.silverjuridico.servicio;

import com.segob.silverjuridico.model.Decretos;
import com.segob.silverjuridico.model.Marco_juridico;
import com.segob.silverjuridico.model.Ultima_reforma;
import com.segob.silverjuridico.utils.HibernateUtil;
import java.util.List;
import javax.ejb.Stateless;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;

/**
 *
 * @author nidia
 */
@Stateless
public class JuridicoImpl implements Juridico {

    @Override
    public List<Marco_juridico> listaMarcoJuridico() {
        List<Marco_juridico> porcentajeAu = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String sql = String.format("select id_marco_juridico, numero, advervio from marco_juridico  ");
            porcentajeAu = (List<Marco_juridico>) session.createSQLQuery(sql)
                    .addScalar("id_marco_juridico")
                    .addScalar("numero")
                    .addScalar("advervio")
                    .setResultTransformer(Transformers.aliasToBean(Marco_juridico.class)).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.getSessionFactory().close();
        }

        return porcentajeAu;
    }

    @Override
    public List<Decretos> listaDecretos() {
        List<Decretos> decretoslist = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String sql = String.format("select id_decreto from decretos  ");
            decretoslist = (List<Decretos>) session.createSQLQuery(sql)
                    .addScalar("id_decreto")
                    .setResultTransformer(Transformers.aliasToBean(Decretos.class)).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.getSessionFactory().close();
        }

        return decretoslist;

    }

    @Override
    public List<Ultima_reforma> listaUltimaReforma() {
        List<Ultima_reforma> decretoslist = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String sql = String.format("select id_ultima_reforma from ultima_reforma  ");
            decretoslist = (List<Ultima_reforma>) session.createSQLQuery(sql)
                    .addScalar("id_ultima_reforma")
                    .setResultTransformer(Transformers.aliasToBean(Ultima_reforma.class)).list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.getSessionFactory().close();
        }

        return decretoslist;

    }
}
