package br.com.dao;

import br.com.Conexoes.ConexaoMySql;
import br.com.model.ModelServicosPrestados;

import java.util.ArrayList;
/**
*
* @author Leandro
*/
public class DAOServicosPrestados extends ConexaoMySql {

    /**
    * grava ServicosPrestados
    * @param pModelServicosPrestados
    * return int
    */
    public int salvarServicosPrestadosDAO(ModelServicosPrestados pModelServicosPrestados){
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO ORDEMSERVICO_SERVICO (id_servico ,ordem_id,valor_servico,servico_quantidade) VALUES (" + pModelServicosPrestados.getIdServico() + ","+ pModelServicosPrestados.getOrdemId() + "," + pModelServicosPrestados.getValorServico() + "," + pModelServicosPrestados.getServicoQuantidade()
               
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera ServicosPrestados
    * @param pIdOrdemservicoServico
    * return ModelServicosPrestados
    */
    public ModelServicosPrestados getServicosPrestadosDAO(int pIdOrdemservicoServico){
        ModelServicosPrestados modelServicosPrestados = new ModelServicosPrestados();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_ordemservico_servico,"
                    + "id_servico,"
                    + "ordem_id,"
                    + "valor_servico,"
                    + "servico_quantidade"
                 + " FROM"
                     + " ORDEMSERVICO_SERVICO"
                 + " WHERE"
                     + " id_ordemservico_servico = '" + pIdOrdemservicoServico + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelServicosPrestados.setIdOrdemservicoServico(this.getResultSet().getInt(1));
                modelServicosPrestados.setIdServico(this.getResultSet().getInt(2));
                modelServicosPrestados.setOrdemId(this.getResultSet().getInt(3));
                modelServicosPrestados.setValorServico(this.getResultSet().getDouble(4));
                modelServicosPrestados.setServicoQuantidade(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelServicosPrestados;
    }

    /**
    * recupera uma lista de ServicosPrestados
        * return ArrayList
    */
    public ArrayList<ModelServicosPrestados> getListaServicosPrestadosDAO(){
        ArrayList<ModelServicosPrestados> listamodelServicosPrestados = new ArrayList();
        ModelServicosPrestados modelServicosPrestados = new ModelServicosPrestados();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_ordemservico_servico,"
                    + "id_servico,"
                    + "ordem_id,"
                    + "valor_servico,"
                    + "servico_quantidade"
                 + " FROM"
                     + " ORDEMSERVICO_SERVICO"
                + ";"
            );

            while(this.getResultSet().next()){
                modelServicosPrestados = new ModelServicosPrestados();
                modelServicosPrestados.setIdOrdemservicoServico(this.getResultSet().getInt(1));
                modelServicosPrestados.setIdServico(this.getResultSet().getInt(2));
                modelServicosPrestados.setOrdemId(this.getResultSet().getInt(3));
                modelServicosPrestados.setValorServico(this.getResultSet().getDouble(4));
                modelServicosPrestados.setServicoQuantidade(this.getResultSet().getInt(5));
                listamodelServicosPrestados.add(modelServicosPrestados);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelServicosPrestados;
    }

    /**
    * atualiza ServicosPrestados
    * @param pModelServicosPrestados
    * return boolean
    */
    public boolean atualizarServicosPrestadosDAO(ModelServicosPrestados pModelServicosPrestados){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE ORDEMSERVICO_SERVICO SET "
                    + "id_ordemservico_servico = '" + pModelServicosPrestados.getIdOrdemservicoServico() + "',"
                    + "id_servico = '" + pModelServicosPrestados.getIdServico() + "',"
                    + "ordem_id = '" + pModelServicosPrestados.getOrdemId() + "',"
                    + "valor_servico = '" + pModelServicosPrestados.getValorServico() + "',"
                    + "servico_quantidade = '" + pModelServicosPrestados.getServicoQuantidade() + "'"
                + " WHERE "
                    + "id_ordemservico_servico = '" + pModelServicosPrestados.getIdOrdemservicoServico() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui ServicosPrestados
    * @param pIdOrdemservicoServico
    * return boolean
    */
    public boolean excluirServicosPrestadosDAO(int pIdOrdemservicoServico){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM ORDEMSERVICO_SERVICO  WHERE  id_servico =" + pIdOrdemservicoServico 
           
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarServicosPrestadosDAO(ArrayList<ModelServicosPrestados> pListaModelServicosPrestados) {
         try {
            this.conectar();
            int cont = pListaModelServicosPrestados.size();
           
             for (int i = 0; i < cont; i++) {  
                
                  this.insertSQL(
                "INSERT INTO ORDEMSERVICO_SERVICO (id_servico,ordem_id,valor_servico,servico_quantidade) VALUES ("+ pListaModelServicosPrestados.get(i).getIdServico()+ "," + pListaModelServicosPrestados.get(i).getOrdemId() + "," + pListaModelServicosPrestados.get(i).getValorServico() + "," + pListaModelServicosPrestados.get(i).getServicoQuantidade()+");"         
            );
             }
             return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}