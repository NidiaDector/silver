/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segob.silverjuridico.model;

import java.io.Serializable;
/**
 *
 * @author nidia
 */

public class Marco_juridico  implements Serializable {
    
    private int id_marco_juridico;
    private int numero;
    private String advervio;
    private String titulo;
    private int tipo;
    private String ultima_reforma;
    private String publicacion_original;
    private String texto_vigente;
    private String libro_virtual;
    private String ficha;
    private String acuerdo;
    private String actas;
    private String iniciativa;
    private String dictamen;
    private String debate;
    private String votacion;
    private String decretos;

    public Marco_juridico() {
    }

    public Marco_juridico(int id_marco_juridico, int numero, String advervio, String titulo, int tipo, String ultima_reforma, String publicacion_original, String texto_vigente, String libro_virtual, String ficha, String acuerdo, String actas, String iniciativa, String dictamen, String debate, String votacion, String decretos) {
        this.id_marco_juridico = id_marco_juridico;
        this.numero = numero;
        this.advervio = advervio;
        this.titulo = titulo;
        this.tipo = tipo;
        this.ultima_reforma = ultima_reforma;
        this.publicacion_original = publicacion_original;
        this.texto_vigente = texto_vigente;
        this.libro_virtual = libro_virtual;
        this.ficha = ficha;
        this.acuerdo = acuerdo;
        this.actas = actas;
        this.iniciativa = iniciativa;
        this.dictamen = dictamen;
        this.debate = debate;
        this.votacion = votacion;
        this.decretos = decretos;
    }
    
    

    public int getId_marco_juridico() {
        return id_marco_juridico;
    }

    public void setId_marco_juridico(int id_marco_juridico) {
        this.id_marco_juridico = id_marco_juridico;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAdvervio() {
        return advervio;
    }

    public void setAdvervio(String advervio) {
        this.advervio = advervio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getUltima_reforma() {
        return ultima_reforma;
    }

    public void setUltima_reforma(String ultima_reforma) {
        this.ultima_reforma = ultima_reforma;
    }

    public String getPublicacion_original() {
        return publicacion_original;
    }

    public void setPublicacion_original(String publicacion_original) {
        this.publicacion_original = publicacion_original;
    }

    public String getTexto_vigente() {
        return texto_vigente;
    }

    public void setTexto_vigente(String texto_vigente) {
        this.texto_vigente = texto_vigente;
    }

    public String getLibro_virtual() {
        return libro_virtual;
    }

    public void setLibro_virtual(String libro_virtual) {
        this.libro_virtual = libro_virtual;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getAcuerdo() {
        return acuerdo;
    }

    public void setAcuerdo(String acuerdo) {
        this.acuerdo = acuerdo;
    }

    public String getActas() {
        return actas;
    }

    public void setActas(String actas) {
        this.actas = actas;
    }

    public String getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(String iniciativa) {
        this.iniciativa = iniciativa;
    }

    public String getDictamen() {
        return dictamen;
    }

    public void setDictamen(String dictamen) {
        this.dictamen = dictamen;
    }

    public String getDebate() {
        return debate;
    }

    public void setDebate(String debate) {
        this.debate = debate;
    }

    public String getVotacion() {
        return votacion;
    }

    public void setVotacion(String votacion) {
        this.votacion = votacion;
    }

    public String getDecretos() {
        return decretos;
    }

    public void setDecretos(String decretos) {
        this.decretos = decretos;
    }
    
    
    
    
}
