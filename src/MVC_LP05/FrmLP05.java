/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_LP05;

/**
 *
 * @author claud
 */
public class FrmLP05 extends javax.swing.JFrame {

    /**
     * Creates new form FrmLP05
     */
    public FrmLP05() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        panelBody = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelAside = new javax.swing.JPanel();
        btnEx1 = new javax.swing.JButton();
        btnEx2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaDescricao = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Lista de Exercícios 05 - POO");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(96, 96, 96))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        btnEx1.setText("1º) Area triângulo");
        btnEx1.setBorder(null);
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

        btnEx2.setText("2º) Raízes reais");
        btnEx2.setBorder(null);
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

        javax.swing.GroupLayout panelAsideLayout = new javax.swing.GroupLayout(panelAside);
        panelAside.setLayout(panelAsideLayout);
        panelAsideLayout.setHorizontalGroup(
            panelAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsideLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnEx1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnEx2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelAsideLayout.setVerticalGroup(
            panelAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAsideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEx1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEx2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textAreaDescricao.setColumns(20);
        textAreaDescricao.setLineWrap(true);
        textAreaDescricao.setRows(5);
        textAreaDescricao.setAutoscrolls(false);
        textAreaDescricao.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(textAreaDescricao);

        javax.swing.GroupLayout panelBodyLayout = new javax.swing.GroupLayout(panelBody);
        panelBody.setLayout(panelBodyLayout);
        panelBodyLayout.setHorizontalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelAside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBodyLayout.setVerticalGroup(
            panelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBodyLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEx1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx1MouseMoved
        textAreaDescricao.setText("1ª)  Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um"
                + "triângulo. Na classe definir um método para leitura da base e altura, um método construtor"
                + "e um método para Calcular a área do triângulo (Area=Base * Altura)/2.\n"
                + "No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar"
                + "e atribuir os valores da base e altura e invocar o método que calcula a área a partir do objeto"
                + "criado.");
    }//GEN-LAST:event_btnEx1MouseMoved

    private void btnEx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx1ActionPerformed
        LP0501_Controle contEx = new LP0501_Controle();
        LP0501_BEAN exBEAN = new LP0501_BEAN();

        exBEAN.setBase(contEx.lerBase());
        exBEAN.setAltura(contEx.lerAltura());
        exBEAN.setAreaT(contEx.calcAreaTriangulo(exBEAN));
        exBEAN.setData(contEx.lerData());
        contEx.inserir(exBEAN);

        LP0501_View frmEx1 = new LP0501_View();
        frmEx1.txtBase.setText(String.valueOf(exBEAN.getBase()));
        frmEx1.txtAltura.setText(String.valueOf(exBEAN.getAltura()));
        frmEx1.txtArea.setText(String.valueOf(exBEAN.getAreaT()));
        this.dispose();
        frmEx1.setVisible(true);
    }//GEN-LAST:event_btnEx1ActionPerformed

    private void btnEx2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEx2MouseMoved
        textAreaDescricao.setText("2ª) Criar um programa que receba 4 notas e "
                + "calcule a média aritmética, através de um "
                + "método.");
    }//GEN-LAST:event_btnEx2MouseMoved

    private void btnEx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEx2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLP05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLP05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLP05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLP05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLP05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEx1;
    private javax.swing.JButton btnEx2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelAside;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JTextArea textAreaDescricao;
    // End of variables declaration//GEN-END:variables
}
