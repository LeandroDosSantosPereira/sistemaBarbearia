/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.Model.ModelServico;
import br.com.dao.DaoServico;
import java.util.ArrayList;

/**
 *
 * @author LEANDRO
 */
public class ControllerServico {
    
    private DaoServico daoServico =  new DaoServico();
    
    public int cadastraServicoController(ModelServico pModelServicos)
    {
        return this.daoServico.cadastrarServicosDAO(pModelServicos);
    }
    
    //Deleta um servico
    public boolean deletarServicoController(int pCodigo)
    {
        return this.daoServico.deletarServicosDAO(pCodigo);
    }
    
    public boolean alterarServicoController(ModelServico pModelServico)
    {
        return this.daoServico.alterarServicosDao(pModelServico);
    }
    
    //********************RETORNA UM PRODUTO
    public ModelServico retornListaServicoController(int pCodigo)
    {
        return this.daoServico.retornarServicoDao(pCodigo);
    }
    
    //****************RETORNA LISTA**************************
    public ArrayList<ModelServico> retornaListaServicoController()
    {
        return this.daoServico.retornaListaServicoDAO();
    }
    
    //NOVO METODO
     public ModelServico retornListaServicoController(String pNOME_SERVICO)
    {
        return this.daoServico.retornarServicoDao(pNOME_SERVICO);
    }
    
}
