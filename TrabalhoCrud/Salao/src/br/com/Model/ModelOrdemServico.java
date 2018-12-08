package br.com.model;

import java.sql.Date;

/**
*
* @author Leandro
*/
public class ModelOrdemServico {

    private int ordemId;
    private Date ordemData;
    private double ordemValorBruto;
    private double ordemValorLiquido;
    private double ordemValorDesconto;
    private int idCliente;

    /**
    * Construtor
    */
    public ModelOrdemServico(){}

    /**
    * seta o valor de ordemId
    * @param pOrdemId
    */
    public void setOrdemId(int pOrdemId){
        this.ordemId = pOrdemId;
    }
    /**
    * return ordemId
    */
    public int getOrdemId(){
        return this.ordemId;
    }

    /**
    * seta o valor de ordemData
    * @param pOrdemData
    */
    public void setOrdemData(Date pOrdemData){
        this.ordemData = pOrdemData;
    }
    /**
    * return ordemData
    */
    public Date getOrdemData(){
        return this.ordemData;
    }

    /**
    * seta o valor de ordemValorBruto
    * @param pOrdemValorBruto
    */
    public void setOrdemValorBruto(double pOrdemValorBruto){
        this.ordemValorBruto = pOrdemValorBruto;
    }
    /**
    * return ordemValorBruto
    */
    public double getOrdemValorBruto(){
        return this.ordemValorBruto;
    }

    /**
    * seta o valor de ordemValorLiquido
    * @param pOrdemValorLiquido
    */
    public void setOrdemValorLiquido(double pOrdemValorLiquido){
        this.ordemValorLiquido = pOrdemValorLiquido;
    }
    /**
    * return ordemValorLiquido
    */
    public double getOrdemValorLiquido(){
        return this.ordemValorLiquido;
    }

    /**
    * seta o valor de ordemValorDesconto
    * @param pOrdemValorDesconto
    */
    public void setOrdemValorDesconto(double pOrdemValorDesconto){
        this.ordemValorDesconto = pOrdemValorDesconto;
    }
    /**
    * return ordemValorDesconto
    */
    public double getOrdemValorDesconto(){
        return this.ordemValorDesconto;
    }

    /**
    * seta o valor de idCliente
    * @param pIdCliente
    */
    public void setIdCliente(int pIdCliente){
        this.idCliente = pIdCliente;
    }
    /**
    * return idCliente
    */
    public int getIdCliente(){
        return this.idCliente;
    }

    @Override
    public String toString(){
        return "ModelOrdemServico {" + "::ordemId = " + this.ordemId + "::ordemData = " + this.ordemData + "::ordemValorBruto = " + this.ordemValorBruto + "::ordemValorLiquido = " + this.ordemValorLiquido + "::ordemValorDesconto = " + this.ordemValorDesconto + "::idCliente = " + this.idCliente +  "}";
    }
}