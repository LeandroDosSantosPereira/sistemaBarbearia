package br.com.controller;

import br.com.model.ModelServicosPrestados;
import br.com.dao.DAOServicosPrestados;
import java.util.ArrayList;

/**
*
* @author Leandro
*/
public class ControllerServicosPrestados {

    private DAOServicosPrestados daoServicosPrestados = new DAOServicosPrestados();

    /**
    * grava ServicosPrestados
    * @param pModelServicosPrestados
    * return int
    */
    public int salvarServicosPrestadosController(ModelServicosPrestados pModelServicosPrestados){
        return this.daoServicosPrestados.salvarServicosPrestadosDAO(pModelServicosPrestados);
    }

    /**
    * recupera ServicosPrestados
    * @param pIdOrdemservicoServico
    * return ModelServicosPrestados
    */
    public ModelServicosPrestados getServicosPrestadosController(int pIdOrdemservicoServico){
        return this.daoServicosPrestados.getServicosPrestadosDAO(pIdOrdemservicoServico);
    }

    /**
    * recupera uma lista deServicosPrestados
    * @param pIdOrdemservicoServico
    * return ArrayList
    */
    public ArrayList<ModelServicosPrestados> getListaServicosPrestadosController(){
        return this.daoServicosPrestados.getListaServicosPrestadosDAO();
    }

    /**
    * atualiza ServicosPrestados
    * @param pModelServicosPrestados
    * return boolean
    */
    public boolean atualizarServicosPrestadosController(ModelServicosPrestados pModelServicosPrestados){
        return this.daoServicosPrestados.atualizarServicosPrestadosDAO(pModelServicosPrestados);
    }

    /**
    * exclui ServicosPrestados
    * @param pIdOrdemservicoServico
    * return boolean
    */
    public boolean excluirServicosPrestadosController(int pIdOrdemservicoServico){
        return this.daoServicosPrestados.excluirServicosPrestadosDAO(pIdOrdemservicoServico);
    }

    public boolean salvarServicosPrestadosController(ArrayList<ModelServicosPrestados> pListaModelServicosPrestados) {
        return this.daoServicosPrestados.salvarServicosPrestadosDAO(pListaModelServicosPrestados);
    }
}