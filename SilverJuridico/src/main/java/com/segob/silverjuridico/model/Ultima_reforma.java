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
public class Ultima_reforma implements Serializable {

    private int id_ultima_reforma;

    private int ley_ultima_reforma;

    private String advervio_ultima_reforma;

    private String texto_ultima_reforma;

    public Ultima_reforma() {
    }

    public Ultima_reforma(int id_ultima_reforma, int ley_ultima_reforma, String advervio_ultima_reforma, String texto_ultima_reforma) {
        this.id_ultima_reforma = id_ultima_reforma;
        this.ley_ultima_reforma = ley_ultima_reforma;
        this.advervio_ultima_reforma = advervio_ultima_reforma;
        this.texto_ultima_reforma = texto_ultima_reforma;
    }

    public int getId_ultima_reforma() {
        return id_ultima_reforma;
    }

    public void setId_ultima_reforma(int id_ultima_reforma) {
        this.id_ultima_reforma = id_ultima_reforma;
    }

    public int getLey_ultima_reforma() {
        return ley_ultima_reforma;
    }

    public void setLey_ultima_reforma(int ley_ultima_reforma) {
        this.ley_ultima_reforma = ley_ultima_reforma;
    }

    public String getAdvervio_ultima_reforma() {
        return advervio_ultima_reforma;
    }

    public void setAdvervio_ultima_reforma(String advervio_ultima_reforma) {
        this.advervio_ultima_reforma = advervio_ultima_reforma;
    }

    public String getTexto_ultima_reforma() {
        return texto_ultima_reforma;
    }

    public void setTexto_ultima_reforma(String texto_ultima_reforma) {
        this.texto_ultima_reforma = texto_ultima_reforma;
    }

}
