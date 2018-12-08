package br.com.controller;

import br.com.Model.ModelCliente;
import br.com.dao.DAOCliente;
import java.util.ArrayList;

/**
*
* @author Leandro
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * grava Cliente
    * @param pModelCliente
    * return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.salvarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pNOME_CLIENTE
    * return ModelCliente
    */
    public ModelCliente getClienteController(int pID_CLIENTE){
        return this.daoCliente.getClienteDAO(pID_CLIENTE);
    }
    
    //  METODO NOVO CRIADO
      public ModelCliente getClienteController(String pNOME_CLIENTE){
        return this.daoCliente.getClienteDAO(pNOME_CLIENTE);
    }
    
    

    /**
    * recupera uma lista deCliente
    * @param pID_CLIENTE
    * return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteController(){
        return this.daoCliente.getListaClienteDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pID_CLIENTE
    * return boolean
    */
    public boolean excluirClienteController(int pID_CLIENTE){
        return this.daoCliente.excluirClienteDAO(pID_CLIENTE);
    }
}