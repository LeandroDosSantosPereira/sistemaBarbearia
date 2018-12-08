/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.controller.ControllerCliente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import br.com.Model.ModelCliente;

/**
 *
 * @author LEANDRO
 */
public class ViewCliente extends javax.swing.JFrame {

    /**
     * Creates new form ViewCliente
     */
    ControllerCliente controllerCliente = new ControllerCliente();
    ModelCliente modelCliente = new ModelCliente();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    String salvarAlterar;

    public ViewCliente() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarClientes();
        this.habilitaDesabilitaCampos(false);
        this.LimparCampos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InputCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        InputNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        InputEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        InputBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        InputCidade = new javax.swing.JTextField();
        InputUf = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        InputFone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        InputCpf = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        BtCancelar = new javax.swing.JButton();
        BtNovo = new javax.swing.JButton();
        BtAlterar = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtDeletar = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clientes");

        jLabel1.setText("Codigo");

        InputCodigo.setEnabled(false);
        InputCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        InputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Endereço");

        InputEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEnderecoActionPerformed(evt);
            }
        });

        jLabel4.setText("Bairro");

        jLabel5.setText("Cidade");

        InputCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCidadeActionPerformed(evt);
            }
        });

        InputUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO\t ", "MA\t ", "MT\t ", "MS\t ", "MG\t ", "PA\t ", "PB\t ", "PR\t ", "PE\t ", "PI\t ", "RJ\t ", "RN\t ", "RS\t ", "RO\t ", "RR\t ", "SC\t ", "SP\t ", "SE\t ", "TO" }));

        jLabel7.setText("UF");

        jLabel8.setText("Fone");

        InputFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFoneActionPerformed(evt);
            }
        });

        jLabel9.setText("CPF");

        TabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Cidade", "CPF", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaCliente);
        if (TabelaCliente.getColumnModel().getColumnCount() > 0) {
            TabelaCliente.getColumnModel().getColumn(0).setMinWidth(15);
            TabelaCliente.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        BtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icon/Excluir.png"))); // NOI18N
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icon/Cadastrar.png"))); // NOI18N
        BtNovo.setText("Novo");
        BtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNovoActionPerformed(evt);
            }
        });

        BtAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icon/Atualizar.png"))); // NOI18N
        BtAlterar.setText("Alterar");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        BtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icon/Salvar.png"))); // NOI18N
        BtSalvar.setText("Salvar");
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });

        BtDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/Icon/delete.png"))); // NOI18N
        BtDeletar.setText("Deletar");
        BtDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(InputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(InputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(InputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InputBairro)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(326, 326, 326))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(InputCidade))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(InputUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(InputFone, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtSalvar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCancelar)
                    .addComponent(BtNovo)
                    .addComponent(BtAlterar)
                    .addComponent(BtSalvar)
                    .addComponent(BtDeletar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputNomeActionPerformed

    private void InputCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCodigoActionPerformed

    private void InputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputEnderecoActionPerformed

    private void InputCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCidadeActionPerformed

    private void InputFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputFoneActionPerformed

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        // TODO add your handling code here:
        //BOTÃO CANCELAR
        this.habilitaDesabilitaCampos(false);
        this.LimparCampos();
        InputCodigo.setText("");
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        // BOTÃO SALVAR
        if (salvarAlterar.equals("novo")) {

            modelCliente.setNOME_CLIENTE(this.InputNome.getText());
            modelCliente.setFONE_CLIENTE(this.InputFone.getText());
            modelCliente.setENDERECO_CLIENTE(this.InputEndereco.getText());
            modelCliente.setCIDADE_CLIENTE(this.InputCidade.getText());
            modelCliente.setUF_CLIENTE(this.InputUf.getSelectedItem().toString());
            modelCliente.setCPF_CLIENTE(this.InputCpf.getText());
            modelCliente.setBAIRRO_CLIENTE(this.InputBairro.getText());

            if (controllerCliente.salvarClienteController(modelCliente) > 0) {
                JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                //CARREGAR CLIENTES NA TABELA
                mostrarClientes();
                this.habilitaDesabilitaCampos(false);
                this.LimparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!");
            }

        } else {
            //Mudar aqui
            modelCliente.setID_CLIENTE(Integer.parseInt(this.InputCodigo.getText()));
            modelCliente.setNOME_CLIENTE(this.InputNome.getText());
            modelCliente.setFONE_CLIENTE(this.InputFone.getText());
            modelCliente.setENDERECO_CLIENTE(this.InputEndereco.getText());
            modelCliente.setCIDADE_CLIENTE(this.InputCidade.getText());
            modelCliente.setUF_CLIENTE(this.InputUf.getSelectedItem().toString());
            modelCliente.setCPF_CLIENTE(this.InputCpf.getText());
            modelCliente.setBAIRRO_CLIENTE(this.InputBairro.getText());

            if (controllerCliente.atualizarClienteController(modelCliente)) {
                JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                //CARREGAR CLIENTES NA TABELA
                mostrarClientes();
              // InputCodigo.setText("");
                this.habilitaDesabilitaCampos(false);
                this.LimparCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!");
            }

        }

    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
        // TODO add your handling code here:
        //BOTÃO DELETAR
        try {
            int linha = TabelaCliente.getSelectedRow();
            int codigoCliente = (int) TabelaCliente.getValueAt(linha, 0);
            if (controllerCliente.excluirClienteController(codigoCliente)) {
                JOptionPane.showMessageDialog(this, "Deletado com sucesso");
                this.mostrarClientes();
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao deletar");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não existem dados para serem deletados!");
        }

    }//GEN-LAST:event_BtDeletarActionPerformed

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        // TODO add your handling code here:
        // BOTÃO ALTERAR
        try {
            int linha = TabelaCliente.getSelectedRow();
            int codigoCliente = (int) TabelaCliente.getValueAt(linha, 0);
            salvarAlterar = "alterar";
            modelCliente = controllerCliente.getClienteController(codigoCliente);
            InputCodigo.setText(String.valueOf(modelCliente.getID_CLIENTE()));
            InputNome.setText(modelCliente.getNOME_CLIENTE());
            InputFone.setText(modelCliente.getFONE_CLIENTE());
            InputEndereco.setText(modelCliente.getENDERECO_CLIENTE());
            InputCidade.setText(modelCliente.getCIDADE_CLIENTE());
            InputUf.setSelectedItem(modelCliente.getUF_CLIENTE());
            InputCpf.setText(modelCliente.getCPF_CLIENTE());
            InputBairro.setText(modelCliente.getBAIRRO_CLIENTE());
            this.habilitaDesabilitaCampos(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Selecione um item para alterar");
        }


    }//GEN-LAST:event_BtAlterarActionPerformed

    private void BtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovoActionPerformed
        // TODO add your handling code here:
        //BOTÃO NOVO
        this.habilitaDesabilitaCampos(true);
        this.LimparCampos();
        salvarAlterar = "novo";

    }//GEN-LAST:event_BtNovoActionPerformed

    private void mostrarClientes() {

        listaModelClientes = controllerCliente.getListaClienteController();
        DefaultTableModel modelo = (DefaultTableModel) TabelaCliente.getModel();
        modelo.setNumRows(0);
        int cont = listaModelClientes.size();
        for (int i = 0; i < cont; i++) {
            modelo.addRow(new Object[]{
                listaModelClientes.get(i).getID_CLIENTE(),
                listaModelClientes.get(i).getNOME_CLIENTE(),
                listaModelClientes.get(i).getCIDADE_CLIENTE(),
                listaModelClientes.get(i).getCPF_CLIENTE(),
                listaModelClientes.get(i).getFONE_CLIENTE()

            });
        }
    }

    private void habilitaDesabilitaCampos(boolean condicao) {
        InputNome.setEnabled(condicao);
        InputEndereco.setEnabled(condicao);
        InputBairro.setEnabled(condicao);
        InputCidade.setEnabled(condicao);
        InputUf.setEnabled(condicao);
        InputFone.setEnabled(condicao);
        InputCpf.setEnabled(condicao);
        BtSalvar.setEnabled(condicao);
    }

    private void LimparCampos() {
        InputNome.setText("");
        InputEndereco.setText("");
        InputBairro.setText("");
        InputCidade.setText("");
        InputFone.setText("");
        InputCpf.setText("");
        InputCodigo.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtDeletar;
    private javax.swing.JButton BtNovo;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JTextField InputBairro;
    private javax.swing.JTextField InputCidade;
    private javax.swing.JTextField InputCodigo;
    private javax.swing.JTextField InputCpf;
    private javax.swing.JTextField InputEndereco;
    private javax.swing.JTextField InputFone;
    private javax.swing.JTextField InputNome;
    private javax.swing.JComboBox<String> InputUf;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
