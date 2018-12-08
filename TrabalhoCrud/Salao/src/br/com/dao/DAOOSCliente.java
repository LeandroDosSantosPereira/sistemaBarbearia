/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.Conexoes.ConexaoMySql;
import br.com.Model.ModelCliente;
import br.com.Model.ModelOSCliente;
import br.com.model.ModelOrdemServico;
import java.util.ArrayList;

/**
 *
 * @author LEANDRO
 */
public class DAOOSCliente extends ConexaoMySql {
    
    public ArrayList<ModelOSCliente> getListaOSClienteDAO(){
        ArrayList<ModelOSCliente> listamodelOSClientes = new ArrayList();
        ModelOrdemServico modelOrdemServico = new ModelOrdemServico();
        ModelCliente modelCliente =  new ModelCliente();
        ModelOSCliente modelOSCliente = new ModelOSCliente();
        
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + " ORDEM_SERVICO.ordem_id,"
                    + " ORDEM_SERVICO.ordem_data,"
                    + " ORDEM_SERVICO.ordem_valor_bruto,"
                    + " ORDEM_SERVICO.ordem_valor_liquido,"
                    + " ORDEM_SERVICO.ordem_valor_desconto,"
                    + " ORDEM_SERVICO.id_cliente,"
                    + "CLIENTES.id_cliente,"
                    + "CLIENTES.nome_cliente,"
                    + "CLIENTES.fone_cliente,"
                    + "CLIENTES.endereco_cliente,"
                    + "CLIENTES.cidade_cliente,"
                    + "CLIENTES.uf_cliente,"
                    + "CLIENTES.cpf_cliente,"
                    + "CLIENTES.bairro_cliente"
                    + " FROM ORDEM_SERVICO INNER JOIN CLIENTES ON CLIENTES.ID_CLIENTE = ORDEM_SERVICO.ID_CLIENTE"
                 
            );

            while(this.getResultSet().next()){
                modelOrdemServico = new ModelOrdemServico();
                modelCliente = new ModelCliente();
                modelOSCliente = new ModelOSCliente();
                //ORDEM SERVIÇO
                modelOrdemServico.setOrdemId(this.getResultSet().getInt(1));
                modelOrdemServico.setOrdemData(this.getResultSet().getDate(2));
                modelOrdemServico.setOrdemValorBruto(this.getResultSet().getDouble(3));
                modelOrdemServico.setOrdemValorLiquido(this.getResultSet().getDouble(4));
                modelOrdemServico.setOrdemValorDesconto(this.getResultSet().getDouble(5));
                modelOrdemServico.setIdCliente(this.getResultSet().getInt(6));
                // CLIENTES
                modelCliente.setID_CLIENTE(this.getResultSet().getInt(7));
                modelCliente.setNOME_CLIENTE(this.getResultSet().getString(8));
                modelCliente.setFONE_CLIENTE(this.getResultSet().getString(9));
                modelCliente.setENDERECO_CLIENTE(this.getResultSet().getString(10));
                modelCliente.setCIDADE_CLIENTE(this.getResultSet().getString(11));
                modelCliente.setUF_CLIENTE(this.getResultSet().getString(12));
                modelCliente.setCPF_CLIENTE(this.getResultSet().getString(13));
                modelCliente.setBAIRRO_CLIENTE(this.getResultSet().getString(14));
                //SETANDO VALORES
                modelOSCliente.setModelOrdemServico(modelOrdemServico);
                modelOSCliente.setModelCliente(modelCliente);
                
                listamodelOSClientes.add(modelOSCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelOSClientes;
    }
    
}
