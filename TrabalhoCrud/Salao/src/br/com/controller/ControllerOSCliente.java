/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.Model.ModelOSCliente;
import br.com.dao.DAOOSCliente;
import java.util.ArrayList;

/**
 *
 * @author LEANDRO
 */
public class ControllerOSCliente {
    private DAOOSCliente dAOOSCliente = new DAOOSCliente();
    
    public ArrayList<ModelOSCliente> getListaOSClienteController() {
       return this.dAOOSCliente.getListaOSClienteDAO();
    }
    
    
}
