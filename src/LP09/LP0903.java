/*
3) Escreva um programa que peça como entrada o peso (em kilogramas) e a
altura (em metros) da pessoa e calcule e exiba o seu IMC – Índice de Massa
Corpórea. Adicionalmente, o programa deve emitir as mensagens
correspondentes conforme a tabela a seguir:

 */
package LP09;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author claud
 */
public class LP0903 {

    private JFrame janela;
    private JPanel mainPanel;
    private JTextField txtPeso, txtAltura;
    private JLabel lblPeso, lblAltura, lblMensagem;
    private JButton btnCalcular;

    public static void main(String[] args) {
        new LP0903().montarTela();
    }

    public void montarTela() {
        setWindow();
        setMainPanel();

        setLblPeso();
        setTxtPeso();
        setLblAltura();
        setTxtAltura();

        setBtnCalcular();
        setLblMensagem();

        showWindow();
    }

    public void setWindow() {
        janela = new JFrame("Índice de Massa Corporal");
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showWindow() {
        janela.pack();
        janela.setSize(400, 400);
        janela.setVisible(true);
    }

    public void setMainPanel() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 1));
        janela.add(mainPanel);
    }

    public void setLblPeso() {
        lblPeso = new JLabel("Digite o peso em quilogramas");
        mainPanel.add(lblPeso);
    }

    public void setTxtPeso() {
        txtPeso = new JTextField();
        mainPanel.add(txtPeso);
    }

    public void setLblAltura() {
        lblAltura = new JLabel("Digite a altura em centímetros");
        mainPanel.add(lblAltura);
    }

    public void setTxtAltura() {
        txtAltura = new JTextField();
        mainPanel.add(txtAltura);
    }

    public void setBtnCalcular() {
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                try {
                    float peso = Float.parseFloat(txtPeso.getText());
                    float altura = Float.parseFloat(txtAltura.getText());

                    float imc = peso / (altura * altura);
                    if (imc < 18.5) {
                        lblMensagem.setText("Você está abaixo do peso ideal");
                    } else if (imc >= 18.5 && imc <= 24.9) {
                        lblMensagem.setText("Parabéns - você está em seu peso ideal!");
                    } else if (imc >= 25 && imc <= 29.9) {
                        lblMensagem.setText("Você está acima de seu peso (sobrepeso)");
                    } else if (imc >= 30 && imc <= 34.9) {
                        lblMensagem.setText("Obesidade grau I");
                    } else if (imc >= 35 && imc <= 39.9) {
                        lblMensagem.setText("Obesidade grau II");
                    } else if (imc >= 40) {
                        lblMensagem.setText("Obesidade grau III");
                    }

                } catch (NullPointerException e) {
                    lblMensagem.setText("Sem peso ou altura para calcular");
                } catch (NumberFormatException e) {
                    lblMensagem.setText("Digite apenas valores numéricos.");
                }
            }
        });
        mainPanel.add(btnCalcular);
    }

    public void setLblMensagem() {
        lblMensagem = new JLabel();
        mainPanel.add(lblMensagem);
    }
}
