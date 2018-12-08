package br.com.dao;

import br.com.Conexoes.ConexaoMySql;
import br.com.model.ModelOrdemServico;
import java.util.ArrayList;
/**
*
* @author Leandro
*/
public class DAOOrdemServico extends ConexaoMySql {

    /**
    * grava OrdemServico
    * @param pModelOrdemServico
    * return int
    */
    public int salvarOrdemServicoDAO(ModelOrdemServico pModelOrdemServico){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO ORDEM_SERVICO ("
                   // + "ordem_id,"
                    + "ordem_data,"
                    + "ordem_valor_bruto,"
                    + "ordem_valor_liquido,"
                    + "ordem_valor_desconto,"
                    + "id_cliente"
                + ") VALUES ("
                   // + "'" + pModelOrdemServico.getOrdemId() + "',"
                    + "'" + pModelOrdemServico.getOrdemData() + "',"
                    + "'" + pModelOrdemServico.getOrdemValorBruto() + "',"
                    + "'" + pModelOrdemServico.getOrdemValorLiquido() + "',"
                    + "'" + pModelOrdemServico.getOrdemValorDesconto() + "',"
                    + "'" + pModelOrdemServico.getIdCliente() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera OrdemServico
    * @param pOrdemId
    * return ModelOrdemServico
    */
    public ModelOrdemServico getOrdemServicoDAO(int pOrdemId){
        ModelOrdemServico modelOrdemServico = new ModelOrdemServico();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "ordem_id,"
                    + "ordem_data,"
                    + "ordem_valor_bruto,"
                    + "ordem_valor_liquido,"
                    + "ordem_valor_desconto,"
                    + "id_cliente"
                 + " FROM"
                     + " ORDEM_SERVICO"
                 + " WHERE"
                     + " ordem_id = '" + pOrdemId + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelOrdemServico.setOrdemId(this.getResultSet().getInt(1));
                modelOrdemServico.setOrdemData(this.getResultSet().getDate(2));
                modelOrdemServico.setOrdemValorBruto(this.getResultSet().getDouble(3));
                modelOrdemServico.setOrdemValorLiquido(this.getResultSet().getDouble(4));
                modelOrdemServico.setOrdemValorDesconto(this.getResultSet().getDouble(5));
                modelOrdemServico.setIdCliente(this.getResultSet().getInt(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelOrdemServico;
    }

    /**
    * recupera uma lista de OrdemServico
        * return ArrayList
    */
    public ArrayList<ModelOrdemServico> getListaOrdemServicoDAO(){
        ArrayList<ModelOrdemServico> listamodelOrdemServico = new ArrayList();
        ModelOrdemServico modelOrdemServico = new ModelOrdemServico();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "ordem_id,"
                    + "ordem_data,"
                    + "ordem_valor_bruto,"
                    + "ordem_valor_liquido,"
                    + "ordem_valor_desconto,"
                    + "id_cliente"
                 + " FROM"
                     + " ORDEM_SERVICO"
                + ";"
            );

            while(this.getResultSet().next()){
                modelOrdemServico = new ModelOrdemServico();
                modelOrdemServico.setOrdemId(this.getResultSet().getInt(1));
                modelOrdemServico.setOrdemData(this.getResultSet().getDate(2));
                modelOrdemServico.setOrdemValorBruto(this.getResultSet().getDouble(3));
                modelOrdemServico.setOrdemValorLiquido(this.getResultSet().getDouble(4));
                modelOrdemServico.setOrdemValorDesconto(this.getResultSet().getDouble(5));
                modelOrdemServico.setIdCliente(this.getResultSet().getInt(6));
                listamodelOrdemServico.add(modelOrdemServico);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelOrdemServico;
    }

    /**
    * atualiza OrdemServico
    * @param pModelOrdemServico
    * return boolean
    */
    public boolean atualizarOrdemServicoDAO(ModelOrdemServico pModelOrdemServico){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE ORDEM_SERVICO SET "
                    + "ordem_id = '" + pModelOrdemServico.getOrdemId() + "',"
                    + "ordem_data = '" + pModelOrdemServico.getOrdemData() + "',"
                    + "ordem_valor_bruto = '" + pModelOrdemServico.getOrdemValorBruto() + "',"
                    + "ordem_valor_liquido = '" + pModelOrdemServico.getOrdemValorLiquido() + "',"
                    + "ordem_valor_desconto = '" + pModelOrdemServico.getOrdemValorDesconto() + "',"
                    + "id_cliente = '" + pModelOrdemServico.getIdCliente() + "'"
                + " WHERE "
                    + "ordem_id = '" + pModelOrdemServico.getOrdemId() + "'"
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
    * exclui OrdemServico
    * @param pOrdemId
    * return boolean
    */
    public boolean excluirOrdemServicoDAO(int pOrdemId){
     
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM ORDEM_SERVICO  WHERE ordem_id = " + pOrdemId             
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}