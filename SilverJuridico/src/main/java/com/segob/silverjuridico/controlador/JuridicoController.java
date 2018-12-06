/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segob.silverjuridico.controlador;

import com.segob.silverjuridico.model.Decretos;
import com.segob.silverjuridico.model.Marco_juridico;
import com.segob.silverjuridico.model.Ultima_reforma;
import com.segob.silverjuridico.servicio.Juridico;
import com.segob.silverjuridico.servicio.JuridicoImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author nidia
 */
@ManagedBean(name = "juridicoCntrl")
@SessionScoped
public class JuridicoController implements Serializable {

    private static final long serialVersionUID = 1L;
    // services
    private final Juridico jur = new JuridicoImpl();

    private List<Decretos> listarDecretos = new ArrayList<>();
    private List<Marco_juridico> listarMarcoJuridico = new ArrayList<>();
    private List<Ultima_reforma> listarUltimaReforma = new ArrayList<>();

    //Getter and Setter
    public List<Decretos> getListarDecretos() {
        listarDecretos = jur.listaDecretos();
        return listarDecretos;
    }

    public List<Marco_juridico> getListarMarcoJuridico() {
        listarMarcoJuridico = jur.listaMarcoJuridico();
        return listarMarcoJuridico;
    }

    public List<Ultima_reforma> getListarUltimaReforma() {
        listarUltimaReforma = jur.listaUltimaReforma();
        return listarUltimaReforma;
    }

}
