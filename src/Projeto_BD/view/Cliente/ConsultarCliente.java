/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_BD.view.Cliente;

import Projeto_BD.control.ClienteControl;
import Projeto_BD.model.bean.ClienteBEAN;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author claud
 */
public class ConsultarCliente extends javax.swing.JFrame {

    public void visuDataHora() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar date = Calendar.getInstance();
        int hora = date.get(Calendar.HOUR_OF_DAY) - 1;
        int min = date.get(Calendar.MINUTE);
        lblDataHora.setText(hora + ":" + min + " - " + formatter.format(date.getTime()));
    }

    public void visuGeral() {
        ClienteControl cont = new ClienteControl();

        List<ClienteBEAN> listaDados = new ArrayList<>();
        listaDados = cont.listar();

        DefaultTableModel tbm = (DefaultTableModel) tblDados.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }

        int i = 0;
        for (ClienteBEAN bean : listaDados) {
            tbm.addRow(new String[1]);
            tblDados.setValueAt(bean.getIdCliente(), i, 0);
            tblDados.setValueAt(bean.getNome(), i, 1);
            tblDados.setValueAt(bean.getEndereco(), i, 2);
            tblDados.setValueAt(bean.getBairro(), i, 3);
            tblDados.setValueAt(bean.getCidade(), i, 4);
            tblDados.setValueAt(bean.getCep(), i, 5);
            tblDados.setValueAt(bean.getUF(), i, 6);
            tblDados.setValueAt(bean.getEmail(), i, 7);
            tblDados.setValueAt(bean.getFone(), i, 8);
            tblDados.setValueAt(bean.getCelular(), i, 9);
            i++;
        }
    }

    public void visuLista(List<ClienteBEAN> listaDados) {
        DefaultTableModel tbm = (DefaultTableModel) tblDados.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        int i = 0;
        for (ClienteBEAN bean : listaDados) {
            tbm.addRow(new String[1]);
            tblDados.setValueAt(bean.getIdCliente(), i, 0);
            tblDados.setValueAt(bean.getNome(), i, 1);
            tblDados.setValueAt(bean.getEndereco(), i, 2);
            tblDados.setValueAt(bean.getBairro(), i, 3);
            tblDados.setValueAt(bean.getCidade(), i, 4);
            tblDados.setValueAt(bean.getCep(), i, 5);
            tblDados.setValueAt(bean.getUF(), i, 6);
            tblDados.setValueAt(bean.getEmail(), i, 7);
            tblDados.setValueAt(bean.getFone(), i, 8);
            tblDados.setValueAt(bean.getCelular(), i, 9);
            i++;
        }
    }

    public void visuResult(ClienteBEAN bean) {
        DefaultTableModel tbm = (DefaultTableModel) tblDados.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }

        tbm.addRow(new String[1]);
        tblDados.setValueAt(bean.getIdCliente(), 0, 0);
        tblDados.setValueAt(bean.getNome(), 0, 1);
        tblDados.setValueAt(bean.getEndereco(), 0, 2);
        tblDados.setValueAt(bean.getBairro(), 0, 3);
        tblDados.setValueAt(bean.getCidade(), 0, 4);
        tblDados.setValueAt(bean.getCep(), 0, 5);
        tblDados.setValueAt(bean.getUF(), 0, 6);
        tblDados.setValueAt(bean.getEmail(), 0, 7);
        tblDados.setValueAt(bean.getFone(), 0, 8);
        tblDados.setValueAt(bean.getCelular(), 0, 9);

    }

    public void visuDescricao(int linha) {
        DefaultListModel listaDesc = new DefaultListModel();

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("Nome do cliente: " + (String) tblDados.getValueAt(linha, 1), 0);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("Endereço: " + (String) tblDados.getValueAt(linha, 2), 1);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("Bairro: " + (String) tblDados.getValueAt(linha, 3), 2);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("Cidade: " + (String) tblDados.getValueAt(linha, 4), 3);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("CEP: " + (String) tblDados.getValueAt(linha, 5), 4);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("UF: " + (String) tblDados.getValueAt(linha, 6), 5);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("E-mail: " + (String) tblDados.getValueAt(linha, 7), 6);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("Fone: " + (String) tblDados.getValueAt(linha, 8), 7);

        listaDesc.addElement(new String[1]);
        listaDesc.setElementAt("Celular: " + (String) tblDados.getValueAt(linha, 9), 8);
        
        listaDescricao.setModel(listaDesc);
    }

    public ConsultarCliente() {
        initComponents();
        visuDataHora();
        visuGeral();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOU = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        chkNome = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        chkID = new javax.swing.JCheckBox();
        lblDataHora = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jScrollPane26 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDescricao = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Cliente");

        lblOU.setText("ou");

        txtID.setEnabled(false);
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Status:");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        chkNome.setText("Nome do Cliente");
        chkNome.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkNomeStateChanged(evt);
            }
        });
        chkNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNomeActionPerformed(evt);
            }
        });
        chkNome.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                chkNomePropertyChange(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consultar CLIENTES");

        chkID.setText("ID do Cliente");
        chkID.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chkIDStateChanged(evt);
            }
        });
        chkID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkIDActionPerformed(evt);
            }
        });

        lblDataHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDataHora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDataHora.setText("Hora - Data");

        lblDescricao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao.setText("Descrição");

        txtNome.setEnabled(false);

        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Endereço", "Bairro", "Cidade", "CEP", "UF", "E-Mail", "Fone", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDados.setAlignmentX(6.0F);
        tblDados.setAlignmentY(1.0F);
        tblDados.setRowHeight(25);
        tblDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDadosMouseClicked(evt);
            }
        });
        jScrollPane26.setViewportView(tblDados);

        jScrollPane1.setViewportView(listaDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnConsultar)
                                    .addComponent(chkNome))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkID)
                                .addGap(60, 60, 60)
                                .addComponent(txtID))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblOU)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDataHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar)
                    .addComponent(lblDataHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ClienteBEAN bean = new ClienteBEAN();
        ClienteControl cont = new ClienteControl();

        if (chkNome.isSelected() == true) {
            txtID.setText("");
            bean.setNome(txtNome.getText());
            List<ClienteBEAN> listaDeDados = new ArrayList<>();
            listaDeDados = cont.consultarNome(bean);
            lblStatus.setText(bean.getStatus());
            visuLista(listaDeDados);
        } else if (chkID.isSelected() == true) {
            txtNome.setText("");
            bean.setIdCliente(Integer.parseInt(txtID.getText()));
            bean = cont.consultarID(bean);
            lblStatus.setText(bean.getStatus());
            visuResult(bean);
        } else {
            lblStatus.setText("Sem nome ou ID para fazer a consulta.");
            visuGeral();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void chkIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkIDActionPerformed
        if (chkID.isSelected() == true) {
            chkNome.setSelected(false);
            txtID.enable(true);
        } else {
            txtID.enable(false);
            txtID.setText(null);
        }
    }//GEN-LAST:event_chkIDActionPerformed

    private void chkIDStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkIDStateChanged
        if (chkID.isSelected() == true) {
            chkNome.setSelected(false);
            txtID.enable(true);
        } else {
            txtID.enable(false);
            txtID.setText(null);
        }
    }//GEN-LAST:event_chkIDStateChanged

    private void chkNomePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_chkNomePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_chkNomePropertyChange

    private void chkNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkNomeActionPerformed
        if (chkNome.isSelected() == true) {
            chkID.setSelected(false);
            txtNome.enable(true);
        } else {
            txtNome.enable(false);
            txtNome.setText(null);
        }
    }//GEN-LAST:event_chkNomeActionPerformed

    private void chkNomeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chkNomeStateChanged
        if (chkNome.isSelected() == true) {
            chkID.setSelected(false);
            txtNome.enable(true);
        } else {
            txtNome.enable(false);
            txtNome.setText(null);
        }
    }//GEN-LAST:event_chkNomeStateChanged

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        MenuCliente menu = new MenuCliente();
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tblDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDadosMouseClicked
        Integer linhaTabela = tblDados.getSelectedRow();

        visuDescricao(linhaTabela);
    }//GEN-LAST:event_tblDadosMouseClicked

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
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JCheckBox chkID;
    private javax.swing.JCheckBox chkNome;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JLabel lblDataHora;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblOU;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JList<String> listaDescricao;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
