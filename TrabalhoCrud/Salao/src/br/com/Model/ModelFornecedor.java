package br.com.Model;
/**
*
* @author Leandro
*/
public class ModelFornecedor {

    private int idFornecedor;
    private String nomeFornecedor;
    private String cnpjFornecedor;
    private String telefoneFornecedor;
    private String emailFornecedor;

    /**
    * Construtor
    */
    public ModelFornecedor(){}

    /**
    * seta o valor de idFornecedor
    * @param pIdFornecedor
    */
    public void setIdFornecedor(int pIdFornecedor){
        this.idFornecedor = pIdFornecedor;
    }
    /**
    * return idFornecedor
    */
    public int getIdFornecedor(){
        return this.idFornecedor;
    }

    /**
    * seta o valor de nomeFornecedor
    * @param pNomeFornecedor
    */
    public void setNomeFornecedor(String pNomeFornecedor){
        this.nomeFornecedor = pNomeFornecedor;
    }
    /**
    * return nomeFornecedor
    */
    public String getNomeFornecedor(){
        return this.nomeFornecedor;
    }

    /**
    * seta o valor de cnpjFornecedor
    * @param pCnpjFornecedor
    */
    public void setCnpjFornecedor(String pCnpjFornecedor){
        this.cnpjFornecedor = pCnpjFornecedor;
    }
    /**
    * return cnpjFornecedor
    */
    public String getCnpjFornecedor(){
        return this.cnpjFornecedor;
    }

    /**
    * seta o valor de telefoneFornecedor
    * @param pTelefoneFornecedor
    */
    public void setTelefoneFornecedor(String pTelefoneFornecedor){
        this.telefoneFornecedor = pTelefoneFornecedor;
    }
    /**
    * return telefoneFornecedor
    */
    public String getTelefoneFornecedor(){
        return this.telefoneFornecedor;
    }

    /**
    * seta o valor de emailFornecedor
    * @param pEmailFornecedor
    */
    public void setEmailFornecedor(String pEmailFornecedor){
        this.emailFornecedor = pEmailFornecedor;
    }
    /**
    * return emailFornecedor
    */
    public String getEmailFornecedor(){
        return this.emailFornecedor;
    }

    @Override
    public String toString(){
        return "ModelFornecedor {" + "::idFornecedor = " + this.idFornecedor + "::nomeFornecedor = " + this.nomeFornecedor + "::cnpjFornecedor = " + this.cnpjFornecedor + "::telefoneFornecedor = " + this.telefoneFornecedor + "::emailFornecedor = " + this.emailFornecedor +  "}";
    }
}