/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP02;

import javax.swing.JOptionPane;

public class FrmLP02 extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public FrmLP02() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnEx3 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEx4 = new javax.swing.JButton();
        btnEx5 = new javax.swing.JButton();
        btnEx2 = new javax.swing.JButton();
        btnEx1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Lista de Exercicios 02");

        btnEx3.setText("3 - Valor de compra e venda");
        btnEx3.setName("btnEx3"); // NOI18N
        btnEx3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEx3MouseMoved(evt);
            }
        });
        btnEx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEx3ActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.setName("btnSair"); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEx4.setText("4 - Classe eleitoral");
        btnEx4.setName("btnEx4"); // NOI18N
        btnEx4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEx4MouseMoved(evt);
            }
        });
        btnEx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEx4ActionPerformed(evt);
            }
        });

        btnEx5.setText("5 - Plano de saúde");
        btnEx5.setName("btnEx5"); // NOI18N
        btnEx5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEx5MouseMoved(evt);
            }
        });
        btnEx5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEx5ActionPerformed(evt);
            }
        });

        btnEx2.setText("2 - Ordem crescente");
        btnEx2.setName("btnEx2"); // NOI18N
        btnEx2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEx2MouseMoved(evt);
            }
        });
        btnEx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEx2ActionPerformed(evt);
            }
        });

        btnEx1.setText("1 - Multiplo de 3");
        btnEx1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEx1.setName("btnEx1"); // NOI18N
        btnEx1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEx1MouseMoved(evt);
            }
        });
        btnEx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEx1ActionPerformed(evt);
            }
        });

        textAreaDescricao.setColumns(20);
        textAreaDescricao.setLineWrap(true);
        textAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(textAreaDescricao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEx1)
                            .addComponent(btnEx2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnEx5))
                            .addComponent(btnEx4))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEx3)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEx1)
                        .addGap(26, 26, 26)
                        .addComponent(btnEx2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnEx3)
                        .addGap(28, 28, 28)
                        .addComponent(btnEx4)
                        .addGap(29, 29, 29)
                        .addComponent(btnEx5))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx1ActionPerformed
        LP02_01 ex01 = new LP02_01();
        double valor = 0;
        String confirmacao = "";
        valor = ex01.lerValor();
        confirmacao = ex01.confirmar(valor);
        ex01.exibir(valor, confirmacao);
    }//GEN-LAST:event_btnEx1ActionPerformed

    private void btnEx1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx1MouseMoved
        textAreaDescricao.setText("1º) Ler um valor e informar se ele é ou não múltiplo de 3.");
    }//GEN-LAST:event_btnEx1MouseMoved

    private void btnEx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx2ActionPerformed
        LP02_02 ex02 = new LP02_02();
        double valor1 = 0,
                valor2 = 0,
                valor3 = 0;
        String ordem = "";
        valor1 = ex02.lerValor1();
        valor2 = ex02.lerValor2();
        valor3 = ex02.lerValor3();
        ordem = ex02.ordemCrescente(valor1, valor2, valor3);
        ex02.exibir(valor1, valor2, valor3, ordem);
    }//GEN-LAST:event_btnEx2ActionPerformed

    private void btnEx2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx2MouseMoved
        textAreaDescricao.setText("2º) Ler três números e mostrá-los em ordem crescente.");
    }//GEN-LAST:event_btnEx2MouseMoved

    private void btnEx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx5ActionPerformed
        LP02_05 ex05 = new LP02_05();
        String nomeCliente = "",
                planoDeSaude = "";
        int idadeCliente = 0;
        nomeCliente = ex05.lerNome();
        idadeCliente = ex05.lerIdade();
        planoDeSaude = ex05.planoSaude(nomeCliente, idadeCliente);
        ex05.exibirPlano(nomeCliente, idadeCliente, planoDeSaude);
    }//GEN-LAST:event_btnEx5ActionPerformed

    private void btnEx5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx5MouseMoved
        textAreaDescricao.setText("5º) "
                + "Depois da liberação do governo para as mensalidades dos planos de saúde, as"
                + "pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro."
                + "Um vendedor de um plano de saúde apresentou a tabela a seguir. Criar um programa"
                + "que entre com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar."
                + "Até 10 anos – R$ 30,00\n"
                + "Acima de 10 até 29 anos – R$ 60,00\n"
                + "Acima de 29 até 45 anos – R$ 120,00\n"
                + "Acima de 45 até 59 anos – R$ 150,00\n"
                + "Acima de 59 até 65 anos – R$ 250,00\n"
                + "Maior que 65 anos – R$ 400,00");
    }//GEN-LAST:event_btnEx5MouseMoved

    private void btnEx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx4ActionPerformed
        LP02_04 ex04 = new LP02_04();
        int idade = 0;
        String classeEleitoral = "";
        idade = ex04.lerIdade();
        classeEleitoral = ex04.classeEleitoral(idade);
        ex04.exibir(idade, classeEleitoral);
    }//GEN-LAST:event_btnEx4ActionPerformed

    private void btnEx4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx4MouseMoved
        textAreaDescricao.setText("4º) "
                + "Ler a idade de uma pessoa e informar a sua classe eleitoral:\n"
                + "Não-eleitor (abaixo de 16 anos)\n"
                + "Eleitor obrigatório (entre 18 e 65 anos)\n"
                + "Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)");
    }//GEN-LAST:event_btnEx4MouseMoved

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Deseja fechar a aplicação?",
                "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx3ActionPerformed
        LP02_03 ex03 = new LP02_03();
        double valorCompra = 0;
        String valorVenda = "";
        valorCompra = ex03.lerValorProduto();
        valorVenda = ex03.valorVenda(valorCompra);
        ex03.exibir(valorCompra, valorVenda);
    }//GEN-LAST:event_btnEx3ActionPerformed

    private void btnEx3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx3MouseMoved
        textAreaDescricao.setText("3º) "
                + "Um comerciante comprou um produto e quer "
                + "vendê-lo com um lucro de 45% se o"
                + "valor da compra for menor que R$20,00; "
                + "caso contrário, o lucro será de 30%. Entrar"
                + "com o valor do produto e imprimir o valor da venda.");
    }//GEN-LAST:event_btnEx3MouseMoved

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
            java.util.logging.Logger.getLogger(FrmLP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLP02.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLP02().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEx1;
    private javax.swing.JButton btnEx2;
    private javax.swing.JButton btnEx3;
    private javax.swing.JButton btnEx4;
    private javax.swing.JButton btnEx5;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea textAreaDescricao;
    // End of variables declaration//GEN-END:variables
}
