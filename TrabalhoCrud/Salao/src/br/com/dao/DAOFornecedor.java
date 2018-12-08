package br.com.dao;

import br.com.Model.ModelFornecedor;
import br.com.Conexoes.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Leandro
*/
public class DAOFornecedor extends ConexaoMySql {

    /**
    * grava Fornecedor
    * @param pModelFornecedor
    * return int
    */
    public int salvarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO FORNECEDOR ("
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "cnpj_fornecedor,"
                    + "telefone_fornecedor,"
                    + "email_fornecedor"
                + ") VALUES ("
                    + "'" + pModelFornecedor.getIdFornecedor() + "',"
                    + "'" + pModelFornecedor.getNomeFornecedor() + "',"
                    + "'" + pModelFornecedor.getCnpjFornecedor() + "',"
                    + "'" + pModelFornecedor.getTelefoneFornecedor() + "',"
                    + "'" + pModelFornecedor.getEmailFornecedor() + "'"
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
    * recupera Fornecedor
    * @param pIdFornecedor
    * return ModelFornecedor
    */
    public ModelFornecedor getFornecedorDAO(int pIdFornecedor){
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "cnpj_fornecedor,"
                    + "telefone_fornecedor,"
                    + "email_fornecedor"
                 + " FROM"
                     + " FORNECEDOR"
                 + " WHERE"
                     + " id_fornecedor = '" + pIdFornecedor + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setCnpjFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(4));
                modelFornecedor.setEmailFornecedor(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelFornecedor;
    }

    /**
    * recupera uma lista de Fornecedor
        * return ArrayList
    */
    public ArrayList<ModelFornecedor> getListaFornecedorDAO(){
        ArrayList<ModelFornecedor> listamodelFornecedor = new ArrayList();
        ModelFornecedor modelFornecedor = new ModelFornecedor();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id_fornecedor,"
                    + "nome_fornecedor,"
                    + "cnpj_fornecedor,"
                    + "telefone_fornecedor,"
                    + "email_fornecedor"
                 + " FROM"
                     + " FORNECEDOR"
                + ";"
            );

            while(this.getResultSet().next()){
                modelFornecedor = new ModelFornecedor();
                modelFornecedor.setIdFornecedor(this.getResultSet().getInt(1));
                modelFornecedor.setNomeFornecedor(this.getResultSet().getString(2));
                modelFornecedor.setCnpjFornecedor(this.getResultSet().getString(3));
                modelFornecedor.setTelefoneFornecedor(this.getResultSet().getString(4));
                modelFornecedor.setEmailFornecedor(this.getResultSet().getString(5));
                listamodelFornecedor.add(modelFornecedor);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelFornecedor;
    }

    /**
    * atualiza Fornecedor
    * @param pModelFornecedor
    * return boolean
    */
    public boolean atualizarFornecedorDAO(ModelFornecedor pModelFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE FORNECEDOR SET "
                    + "id_fornecedor = '" + pModelFornecedor.getIdFornecedor() + "',"
                    + "nome_fornecedor = '" + pModelFornecedor.getNomeFornecedor() + "',"
                    + "cnpj_fornecedor = '" + pModelFornecedor.getCnpjFornecedor() + "',"
                    + "telefone_fornecedor = '" + pModelFornecedor.getTelefoneFornecedor() + "',"
                    + "email_fornecedor = '" + pModelFornecedor.getEmailFornecedor() + "'"
                + " WHERE "
                    + "id_fornecedor = '" + pModelFornecedor.getIdFornecedor() + "'"
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
    * exclui Fornecedor
    * @param pIdFornecedor
    * return boolean
    */
    public boolean excluirFornecedorDAO(int pIdFornecedor){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM FORNECEDOR "
                + " WHERE "
                    + "id_fornecedor = '" + pIdFornecedor + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}