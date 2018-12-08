package br.com.Model;
/**
*
* @author Leandro
*/
public class ModelCliente {

    private int ID_CLIENTE;
    private String NOME_CLIENTE;
    private String FONE_CLIENTE;
    private String ENDERECO_CLIENTE;
    private String CIDADE_CLIENTE;
    private String UF_CLIENTE;
    private String CPF_CLIENTE;
    private String BAIRRO_CLIENTE;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de ID_CLIENTE
    * @param pID_CLIENTE
    */
    public void setID_CLIENTE(int pID_CLIENTE){
        this.ID_CLIENTE = pID_CLIENTE;
    }
    /**
    * return pk_ID_CLIENTE
    */
    public int getID_CLIENTE(){
        return this.ID_CLIENTE;
    }

    /**
    * seta o valor de NOME_CLIENTE
    * @param pNOME_CLIENTE
    */
    public void setNOME_CLIENTE(String pNOME_CLIENTE){
        this.NOME_CLIENTE = pNOME_CLIENTE;
        
    }
    /**
    * return NOME_CLIENTE
    */
    
    public String getNOME_CLIENTE(){
        return this.NOME_CLIENTE;
    }

    /**
    * seta o valor de FONE_CLIENTE
    * @param pFONE_CLIENTE
    */
    public void setFONE_CLIENTE(String pFONE_CLIENTE){
        this.FONE_CLIENTE = pFONE_CLIENTE;
    }
    /**
    * return FONE_CLIENTE
    */
    public String getFONE_CLIENTE(){
        return this.FONE_CLIENTE;
    }

    /**
    * seta o valor de ENDERECO_CLIENTE
    * @param pENDERECO_CLIENTE
    */
    public void setENDERECO_CLIENTE(String pENDERECO_CLIENTE){
        this.ENDERECO_CLIENTE = pENDERECO_CLIENTE;
    }
    /**
    * return ENDERECO_CLIENTE
    */
    public String getENDERECO_CLIENTE(){
        return this.ENDERECO_CLIENTE;
    }

    /**
    * seta o valor de CIDADE_CLIENTE
    * @param pCIDADE_CLIENTE
    */
    public void setCIDADE_CLIENTE(String pCIDADE_CLIENTE){
        this.CIDADE_CLIENTE = pCIDADE_CLIENTE;
    }
    /**
    * return CIDADE_CLIENTE
    */
    public String getCIDADE_CLIENTE(){
        return this.CIDADE_CLIENTE;
    }

    /**
    * seta o valor de UF_CLIENTE
    * @param pUF_CLIENTE
    */
    public void setUF_CLIENTE(String pUF_CLIENTE){
        this.UF_CLIENTE = pUF_CLIENTE;
    }
    /**
    * return UF_CLIENTE
    */
    public String getUF_CLIENTE(){
        return this.UF_CLIENTE;
    }

    /**
    * seta o valor de CPF_CLIENTE
    * @param pCPF_CLIENTE
    */
    public void setCPF_CLIENTE(String pCPF_CLIENTE){
        this.CPF_CLIENTE = pCPF_CLIENTE;
    }
    /**
    * return CPF_CLIENTE
    */
    public String getCPF_CLIENTE(){
        return this.CPF_CLIENTE;
    }

    /**
    * seta o valor de BAIRRO_CLIENTE
    * @param pBAIRRO_CLIENTE
    */
    public void setBAIRRO_CLIENTE(String pBAIRRO_CLIENTE){
        this.BAIRRO_CLIENTE = pBAIRRO_CLIENTE;
    }
    /**
    * return BAIRRO_CLIENTE
    */
    public String getBAIRRO_CLIENTE(){
        return this.BAIRRO_CLIENTE;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::ID_CLIENTE = " + this.ID_CLIENTE + "::NOME_CLIENTE = " + this.NOME_CLIENTE + "::FONE_CLIENTE = " + this.FONE_CLIENTE + "::ENDERECO_CLIENTE = " + this.ENDERECO_CLIENTE + "::CIDADE_CLIENTE = " + this.CIDADE_CLIENTE + "::UF_CLIENTE = " + this.UF_CLIENTE + "::CPF_CLIENTE = " + this.CPF_CLIENTE + "::BAIRRO_CLIENTE = " + this.BAIRRO_CLIENTE +  "}";
    }
}