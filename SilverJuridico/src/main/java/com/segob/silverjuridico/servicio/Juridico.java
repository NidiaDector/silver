/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.segob.silverjuridico.servicio;

import com.segob.silverjuridico.model.Decretos;
import com.segob.silverjuridico.model.Marco_juridico;
import com.segob.silverjuridico.model.Ultima_reforma;
import java.util.List;

/**
 *
 * @author nidia
 */
public interface Juridico {
    public List<Marco_juridico> listaMarcoJuridico();
    public List<Decretos> listaDecretos();
    public List<Ultima_reforma> listaUltimaReforma();
    
}
