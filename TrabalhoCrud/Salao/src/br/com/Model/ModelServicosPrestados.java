package br.com.model;
/**
*
* @author Leandro
*/
public class ModelServicosPrestados {

    private int idOrdemservicoServico;
    private int idServico;
    private int ordemId;
    private double valorServico;
    private int servicoQuantidade;

    /**
    * Construtor
    */
    public ModelServicosPrestados(){}

    /**
    * seta o valor de idOrdemservicoServico
    * @param pIdOrdemservicoServico
    */
    public void setIdOrdemservicoServico(int pIdOrdemservicoServico){
        this.idOrdemservicoServico = pIdOrdemservicoServico;
    }
    /**
    * return idOrdemservicoServico
    */
    public int getIdOrdemservicoServico(){
        return this.idOrdemservicoServico;
    }

    /**
    * seta o valor de idServico
    * @param pIdServico
    */
    public void setIdServico(int pIdServico){
        this.idServico = pIdServico;
    }
    /**
    * return idServico
    */
    public int getIdServico(){
        return this.idServico;
    }

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
    * seta o valor de valorServico
    * @param pValorServico
    */
    public void setValorServico(double pValorServico){
        this.valorServico = pValorServico;
    }
    /**
    * return valorServico
    */
    public double getValorServico(){
        return this.valorServico;
    }

    /**
    * seta o valor de servicoQuantidade
    * @param pServicoQuantidade
    */
    public void setServicoQuantidade(int pServicoQuantidade){
        this.servicoQuantidade = pServicoQuantidade;
    }
    /**
    * return servicoQuantidade
    */
    public int getServicoQuantidade(){
        return this.servicoQuantidade;
    }

    @Override
    public String toString(){
        return "ModelServicosPrestados {" + "::idOrdemservicoServico = " + this.idOrdemservicoServico + "::idServico = " + this.idServico + "::ordemId = " + this.ordemId + "::valorServico = " + this.valorServico + "::servicoQuantidade = " + this.servicoQuantidade +  "}";
    }
}