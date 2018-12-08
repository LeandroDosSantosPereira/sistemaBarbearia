/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.Conexoes.ConexaoMySql;
import br.com.Model.ModelServico;
import java.util.ArrayList;

/**
 *
 * @author LEANDRO
 */
public class DaoServico extends ConexaoMySql {

    public int cadastrarServicosDAO(ModelServico pModelServicos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO SERVICO ("
                    + "NOME_SERVICO,"
                    + "VALOR_SERVICO"
                    + ")VALUES("
                    + "'" + pModelServicos.getNOME_SERVICO() + "' ,"
                    + "'" + pModelServicos.getVALOR_SERVICO() + "'"
                    +");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean deletarServicosDAO(int pID_SERVICO) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM SERVICO WHERE ID_SERVICO = '" + pID_SERVICO + "' "
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean alterarServicosDao(ModelServico pModelServico) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
"UPDATE SERVICO SET NOME_SERVICO = " +"'" + pModelServico.getNOME_SERVICO()+"'" + ",VALOR_SERVICO = " + pModelServico.getVALOR_SERVICO() +" WHERE ID_SERVICO = " + pModelServico.getID_SERVICO() 
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    //*******************************************
    //RETORNA APENAS UM SERVIÇO
    public ModelServico retornarServicoDao(int pID_SERVICO) {
        ModelServico modelServico = new ModelServico();
        try {
            this.conectar();
            this.executarSQL("SELECT ID_SERVICO,NOME_SERVICO,VALOR_SERVICO FROM SERVICO WHERE ID_SERVICO = " + pID_SERVICO );

            while (this.getResultSet().next()) {
                modelServico.setID_SERVICO(this.getResultSet().getInt(1));
                modelServico.setNOME_SERVICO(this.getResultSet().getString(2));
                modelServico.setVALOR_SERVICO(this.getResultSet().getDouble(3));

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.fecharConexao();
        }
        return modelServico;
    }
//**********************************************************************
    //RETORNA LISTA DE SERVICOS
    public ArrayList<ModelServico> retornaListaServicoDAO() {
        ArrayList<ModelServico> listaModelServico = new ArrayList<>();
        ModelServico modelServico = new ModelServico();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT ID_SERVICO, NOME_SERVICO,VALOR_SERVICO FROM SERVICO"
            );
            while (this.getResultSet().next()) {
                modelServico = new ModelServico();
                modelServico.setID_SERVICO(this.getResultSet().getInt(1));
                modelServico.setNOME_SERVICO(this.getResultSet().getString(2));
                modelServico.setVALOR_SERVICO(this.getResultSet().getDouble(3));
                //ADICIONA Á LISTA PARA NÃO SOBRESCREVER
                listaModelServico.add(modelServico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelServico;
    }
    
    //NOVO METODO
    
     public ModelServico retornarServicoDao(String pNOME_SERVICO) {
        ModelServico modelServico = new ModelServico();
        try {
            this.conectar();
            this.executarSQL("SELECT ID_SERVICO,NOME_SERVICO,VALOR_SERVICO FROM SERVICO WHERE NOME_SERVICO = " +"'"+ pNOME_SERVICO +"'");

            while (this.getResultSet().next()) {
                modelServico.setID_SERVICO(this.getResultSet().getInt(1));
                modelServico.setNOME_SERVICO(this.getResultSet().getString(2));
                modelServico.setVALOR_SERVICO(this.getResultSet().getDouble(3));

            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.fecharConexao();
        }
        return modelServico;
    }
    
    
    
}
