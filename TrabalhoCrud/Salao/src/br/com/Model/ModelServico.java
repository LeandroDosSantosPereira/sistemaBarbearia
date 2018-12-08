/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Model;

/**
 *
 * @author LEANDRO
 */

public class ModelServico {
  private int ID_SERVICO;
  private String NOME_SERVICO;
  private double VALOR_SERVICO;    

    public int getID_SERVICO() {
        return ID_SERVICO;
    }

    public void setID_SERVICO(int ID_SERVICO) {
        this.ID_SERVICO = ID_SERVICO;
    }

    public String getNOME_SERVICO() {
        return NOME_SERVICO;
    }

    public void setNOME_SERVICO(String NOME_SERVICO) {
        this.NOME_SERVICO = NOME_SERVICO;
    }

    public double getVALOR_SERVICO() {
        return VALOR_SERVICO;
    }

    public void setVALOR_SERVICO(double VALOR_SERVICO) {
        this.VALOR_SERVICO = VALOR_SERVICO;
    }
}
