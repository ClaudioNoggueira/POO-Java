/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP01;

import javax.swing.JOptionPane;

public class FrmLP01 extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public FrmLP01() {
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

        btnEx1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescricao = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        btnEx3 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnEx4 = new javax.swing.JButton();
        btnEx5 = new javax.swing.JButton();
        btnEx2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEx1.setText("1 - Produto com desconto de 9%");
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
        textAreaDescricao.setAutoscrolls(false);
        textAreaDescricao.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(textAreaDescricao);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Lista de Exercicios 01");

        btnEx3.setText("3 - Média de dois valores");
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

        btnEx4.setText("4 - Conversão ºC em ºF");
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

        btnEx5.setText("5 - Volume da lata");
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

        btnEx2.setText("2 - Salários mínimos");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEx2)
                            .addComponent(btnEx3)
                            .addComponent(btnEx4)
                            .addComponent(btnEx5))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnEx1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEx1)
                        .addGap(18, 18, 18)
                        .addComponent(btnEx2)
                        .addGap(18, 18, 18)
                        .addComponent(btnEx3)
                        .addGap(18, 18, 18)
                        .addComponent(btnEx4)
                        .addGap(18, 18, 18)
                        .addComponent(btnEx5))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(btnSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEx1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx1MouseMoved
        textAreaDescricao.setText("Em época de pouco dinheiro, os comerciantes "
                + "estão procurando aumentar suas vendas oferecendo desconto. "
                + "Faça um programa que possa entrar com o nome de um produto e "
                + "seu valor unitário e calcular e exibir um novo valor com um"
                + "desconto de 9%");
    }//GEN-LAST:event_btnEx1MouseMoved

    private void btnEx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx1ActionPerformed
        LP01_01 ex01 = new LP01_01();
        String nomeProduto = "", valorOriginal = "";
        float valorDescontado = 0;
        nomeProduto = ex01.lerNomeProduto();
        valorOriginal = ex01.lerValorOriginal();
        valorDescontado = ex01.desconto(valorOriginal);
        ex01.exibir(nomeProduto, valorOriginal, valorDescontado);
    }//GEN-LAST:event_btnEx1ActionPerformed


    private void btnEx3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx3MouseMoved
        textAreaDescricao.setText("Faça um programa que leia dois valores e "
                + "informe a média entre eles. (use float como tipo de dado).");
    }//GEN-LAST:event_btnEx3MouseMoved

    private void btnEx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx3ActionPerformed
        LP01_03 ex03 = new LP01_03();
        float valor1 = 0, valor2 = 0, media = 0;
        valor1 = ex03.lerValor1();
        valor2 = ex03.lerValor2();
        media = ex03.calcMedia(valor1, valor2);
        ex03.exibir(valor1, valor2, media);
    }//GEN-LAST:event_btnEx3ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Deseja fechar a aplicação?",
                "Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        if (i == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEx4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx4MouseMoved
        textAreaDescricao.setText("Faça um programa que leia uma temperatura em "
                + "graus Centígrados e apresente-a convertida em graus Fahrenheit."
                + " A fórmula de conversão é:\n"
                + "F = (9 * C + 160) / 5, onde F é a temperatura em Fahrenheit e C em graus\n"
                + "Centígrados.");
    }//GEN-LAST:event_btnEx4MouseMoved

    private void btnEx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx4ActionPerformed
        LP01_04 ex04 = new LP01_04();
        int celsius, fahrenheit;
        celsius = ex04.lerCelsius();
        fahrenheit = ex04.converterFahrenheit(celsius);
        ex04.exibir(celsius, fahrenheit);
    }//GEN-LAST:event_btnEx4ActionPerformed

    private void btnEx5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx5MouseMoved
        textAreaDescricao.setText("Calcular e apresentar o valor do volume de "
                + "uma lata de óleo, utilizando a fórmula:\n"
                + "VOLUME = 3.14159 * R2 * ALTURA");
    }//GEN-LAST:event_btnEx5MouseMoved

    private void btnEx5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx5ActionPerformed
        LP01_05 ex05 = new LP01_05();
        double altura, raio, volume = 0;
        raio = ex05.lerRaio();
        altura = ex05.lerAltura();
        volume = ex05.calcularVolume(altura, raio);
        ex05.exibir(volume);
    }//GEN-LAST:event_btnEx5ActionPerformed

    private void btnEx2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx2MouseMoved
        textAreaDescricao.setText("Para vários tributos, a base de cálculo é o "
                + "salário mínimo. Fazer um programa que leia o valor do"
                + " salário mínimo e o valor do salário de uma pessoa. Calcular"
                + "e mostrar quantos salários mínimos ela ganha.");
    }//GEN-LAST:event_btnEx2MouseMoved

    private void btnEx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx2ActionPerformed
        LP01_02 ex02 = new LP01_02();
        float SM, SP, qtdeSM = 0;
        SM = ex02.lerSalarioMinimo();
        SP = ex02.lerSalarioPessoal();
        qtdeSM = ex02.qtdeSalariosMininos(SM, SP);
        ex02.exibir(SM, SP, qtdeSM);
    }//GEN-LAST:event_btnEx2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLP01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLP01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLP01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLP01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmLP01().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea textAreaDescricao;
    // End of variables declaration//GEN-END:variables
}
