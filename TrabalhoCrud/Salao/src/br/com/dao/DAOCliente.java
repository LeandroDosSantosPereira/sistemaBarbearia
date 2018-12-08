package br.com.dao;

import br.com.Conexoes.ConexaoMySql;
import br.com.Model.ModelCliente;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class DAOCliente extends ConexaoMySql {

    /**
     * grava Cliente
     *
     * @param pModelCliente return int
     */
    public int salvarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO CLIENTES ("
                    + "nome_cliente,"
                    + "fone_cliente,"
                    + "endereco_cliente,"
                    + "cidade_cliente,"
                    + "uf_cliente,"
                    + "cpf_cliente,"
                    + "bairro_cliente"
                    + ") VALUES ("
                    + "'" + pModelCliente.getNOME_CLIENTE() + "',"
                    + "'" + pModelCliente.getFONE_CLIENTE() + "',"
                    + "'" + pModelCliente.getENDERECO_CLIENTE() + "',"
                    + "'" + pModelCliente.getCIDADE_CLIENTE() + "',"
                    + "'" + pModelCliente.getUF_CLIENTE() + "',"
                    + "'" + pModelCliente.getCPF_CLIENTE() + "',"
                    + "'" + pModelCliente.getBAIRRO_CLIENTE() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Cliente
     *
     * @param pID_CLIENTE return ModelCliente
     */
    public ModelCliente getClienteDAO(int pID_CLIENTE) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT id_cliente,nome_cliente,fone_cliente,endereco_cliente,cidade_cliente,uf_cliente,cpf_cliente,bairro_cliente FROM CLIENTES  WHERE id_cliente =" + pID_CLIENTE
            );

            while (this.getResultSet().next()) {
                modelCliente.setID_CLIENTE(this.getResultSet().getInt(1));
                modelCliente.setNOME_CLIENTE(this.getResultSet().getString(2));
                modelCliente.setFONE_CLIENTE(this.getResultSet().getString(3));
                modelCliente.setENDERECO_CLIENTE(this.getResultSet().getString(4));
                modelCliente.setCIDADE_CLIENTE(this.getResultSet().getString(5));
                modelCliente.setUF_CLIENTE(this.getResultSet().getString(6));
                modelCliente.setCPF_CLIENTE(this.getResultSet().getString(7));
                modelCliente.setBAIRRO_CLIENTE(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera uma lista de Cliente return ArrayList
     */
    public ArrayList<ModelCliente> getListaClienteDAO() {
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT id_cliente,nome_cliente,fone_cliente,endereco_cliente,cidade_cliente,uf_cliente,cpf_cliente,bairro_cliente FROM CLIENTES"
            );

            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setID_CLIENTE(this.getResultSet().getInt(1));
                modelCliente.setNOME_CLIENTE(this.getResultSet().getString(2));
                modelCliente.setFONE_CLIENTE(this.getResultSet().getString(3));
                modelCliente.setENDERECO_CLIENTE(this.getResultSet().getString(4));
                modelCliente.setCIDADE_CLIENTE(this.getResultSet().getString(5));
                modelCliente.setUF_CLIENTE(this.getResultSet().getString(6));
                modelCliente.setCPF_CLIENTE(this.getResultSet().getString(7));
                modelCliente.setBAIRRO_CLIENTE(this.getResultSet().getString(8));
                listamodelCliente.add(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
     * atualiza Cliente
     *
     * @param pModelCliente return boolean
     */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE CLIENTES SET id_cliente = " + pModelCliente.getID_CLIENTE()
                    + ",nome_cliente =" +"'"+ pModelCliente.getNOME_CLIENTE() + "'"
                    +",fone_cliente = " +"'"+ pModelCliente.getFONE_CLIENTE()+"'"
                    +",endereco_cliente ="+"'" + pModelCliente.getENDERECO_CLIENTE()+"'"
                    + ",cidade_cliente = "+"'" + pModelCliente.getCIDADE_CLIENTE()+"'"
                    + ",uf_cliente = "+"'" + pModelCliente.getUF_CLIENTE()+"'"
                    + ",cpf_cliente = "+ "'" + pModelCliente.getCPF_CLIENTE()+"'"
                    + ",bairro_cliente = "+"'" + pModelCliente.getBAIRRO_CLIENTE()+"'"
                    + " WHERE id_cliente = " + pModelCliente.getID_CLIENTE()
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Cliente
     *
     * @param pID_CLIENTE return boolean
     */
    public boolean excluirClienteDAO(int pID_CLIENTE) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM CLIENTES "
                    + " WHERE "
                    + "id_cliente = '" + pID_CLIENTE + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    //NOVO METODO
    
     public ModelCliente getClienteDAO(String pNOME_CLIENTE) {
        ModelCliente modelCliente = new ModelCliente();
        try {
         
            this.conectar();
            this.executarSQL(
                    "SELECT id_cliente,nome_cliente,fone_cliente,endereco_cliente,cidade_cliente,uf_cliente,cpf_cliente,bairro_cliente FROM CLIENTES  WHERE nome_cliente =" +"'"+pNOME_CLIENTE+"'"
            );
           
            while (this.getResultSet().next()) {
                modelCliente.setID_CLIENTE(this.getResultSet().getInt(1));
                modelCliente.setNOME_CLIENTE(this.getResultSet().getString(2));
                modelCliente.setFONE_CLIENTE(this.getResultSet().getString(3));
                modelCliente.setENDERECO_CLIENTE(this.getResultSet().getString(4));
                modelCliente.setCIDADE_CLIENTE(this.getResultSet().getString(5));
                modelCliente.setUF_CLIENTE(this.getResultSet().getString(6));
                modelCliente.setCPF_CLIENTE(this.getResultSet().getString(7));
                modelCliente.setBAIRRO_CLIENTE(this.getResultSet().getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    
    
    
    
    
}
