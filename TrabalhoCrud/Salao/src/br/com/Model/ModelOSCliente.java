/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Model;

import br.com.model.ModelOrdemServico;
import java.util.ArrayList;

/**
 *
 * @author LEANDRO
 */
public class ModelOSCliente {
    private ModelOrdemServico modelOrdemServico;
    private ModelCliente modelCliente;
    private ArrayList<ModelOSCliente> listaModelOSCliente;

    public ModelOrdemServico getModelOrdemServico() {
        return modelOrdemServico;
    }

    public void setModelOrdemServico(ModelOrdemServico modelOrdemServico) {
        this.modelOrdemServico = modelOrdemServico;
    }

    public ModelCliente getModelCliente() {
        return modelCliente;
    }

    public void setModelCliente(ModelCliente modelCliente) {
        this.modelCliente = modelCliente;
    }

    public ArrayList<ModelOSCliente> getListaModelOSCliente() {
        return listaModelOSCliente;
    }

    public void setListaModelOSCliente(ArrayList<ModelOSCliente> listaModelOSCliente) {
        this.listaModelOSCliente = listaModelOSCliente;
    }
    
}
