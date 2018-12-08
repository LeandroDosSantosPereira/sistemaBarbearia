package br.com.controller;

import br.com.model.ModelOrdemServico;
import br.com.dao.DAOOrdemServico;
import java.util.ArrayList;

/**
*
* @author Leandro
*/
public class ControllerOrdemServico {

    private DAOOrdemServico daoOrdemServico = new DAOOrdemServico();

    /**
    * grava OrdemServico
    * @param pModelOrdemServico
    * return int
    */
    public int salvarOrdemServicoController(ModelOrdemServico pModelOrdemServico){
        return this.daoOrdemServico.salvarOrdemServicoDAO(pModelOrdemServico);
    }

    /**
    * recupera OrdemServico
    * @param pOrdemId
    * return ModelOrdemServico
    */
    public ModelOrdemServico getOrdemServicoController(int pOrdemId){
        return this.daoOrdemServico.getOrdemServicoDAO(pOrdemId);
    }

    /**
    * recupera uma lista deOrdemServico
    * @param pOrdemId
    * return ArrayList
    */
    public ArrayList<ModelOrdemServico> getListaOrdemServicoController(){
        return this.daoOrdemServico.getListaOrdemServicoDAO();
    }

    /**
    * atualiza OrdemServico
    * @param pModelOrdemServico
    * return boolean
    */
    public boolean atualizarOrdemServicoController(ModelOrdemServico pModelOrdemServico){
        return this.daoOrdemServico.atualizarOrdemServicoDAO(pModelOrdemServico);
    }

    /**
    * exclui OrdemServico
    * @param pOrdemId
    * return boolean
    */
    public boolean excluirOrdemServicoController(int pOrdemId){
        return this.daoOrdemServico.excluirOrdemServicoDAO(pOrdemId);
    }
}