/*
2)Escreva  um  programa  capaz  de  converter  o  valor  em  Reais  fornecido  
numa caixa  de  entrada  (TextField)  em  outro  valor  monetário  conforme  a  
seleção  de uma  moeda  (no  mínimo  3  moedas  diferentes) emcomponentesde  
seleção (Radio  Button)  indicando  o  resultado  em  um  rótulo  (Label).  
Se  necessário adicione botões.
 */
package LP09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author claud
 */
public class LP0902 {
    
    private JFrame janela;
    private JPanel mainPanel;
    private JTextField txtEntrada, txtSaida;
    private JRadioButton radDolar, radEuro, radLibra;
    private JLabel lblSaida, lblEntrada;
    
    public static void main(String[] args) {
        new LP0902().assembleScreen();
    }
    
    private void assembleScreen() {
        setWindow();
        setMainPanel();
        
        setLblEntrada();
        setTxtEntrada();
        setRadDolar();
        setRadEuro();
        setRadLibra();
        setLblSaida();
        setTxtSaida();
        
        showWindow();
    }
    
    private void setWindow() {
        janela = new JFrame("Conversor");
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void showWindow() {
        janela.pack();
        janela.setSize(400, 300);
        janela.setVisible(true);
    }
    
    private void setMainPanel() {
        mainPanel = new JPanel();
        janela.add(mainPanel);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
    }
    
    private void setLblEntrada() {
        lblEntrada = new JLabel("Valor em real:");
        lblEntrada.setHorizontalAlignment(javax.swing.JLabel.CENTER);
        mainPanel.add(lblEntrada);
    }
    
    private void setTxtEntrada() {
        txtEntrada = new JTextField();
        txtEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEntrada.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String caracteres = "0123456789";
                if (!caracteres.contains(e.getKeyChar() + "")) {
                    e.consume();
                }
            }
            
            @Override
            public void keyPressed(KeyEvent ke) {
                String caracteres = "0123456789";
                if (!caracteres.contains(ke.getKeyChar() + "")) {
                    ke.consume();
                }
            }
            
            @Override
            public void keyReleased(KeyEvent ke) {
                String caracteres = "0123456789";
                if (!caracteres.contains(ke.getKeyChar() + "")) {
                    ke.consume();
                }
            }
        });
        mainPanel.add(txtEntrada);
    }
    
    private void setRadDolar() {
        JRadioButton radDolar = new JRadioButton("Dólar");
        radDolar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double real = Double.parseDouble(txtEntrada.getText()) * 0.1785;
                    txtSaida.setText(String.valueOf(real) + " dólares");
                } catch (NumberFormatException nfe) {
                    
                }
            }
        });
        radDolar.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                try {
                    if (radEuro.isSelected() == true || radLibra.isSelected() == true) {
                        radEuro.setSelected(false);
                        radLibra.setSelected(false);
                    }
                } catch (NullPointerException e) {
                    
                }
                
            }
        });
        mainPanel.add(radDolar);
    }
    
    private void setRadEuro() {
        JRadioButton radEuro = new JRadioButton("Euro");
        radEuro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double real = Double.parseDouble(txtEntrada.getText()) * 0.1503;
                    txtSaida.setText(String.valueOf(real) + " euros");
                } catch (NumberFormatException nfe) {
                    
                }
                
            }
        });
        radEuro.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                try {
                    if (radDolar.isSelected() == true || radLibra.isSelected() == true) {
                        radDolar.setSelected(false);
                        radLibra.setSelected(false);
                    }
                } catch (NullPointerException e) {
                    
                }
                
            }
        });
        mainPanel.add(radEuro);
    }
    
    private void setRadLibra() {
        JRadioButton radLibra = new JRadioButton("Libra");
        radLibra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double real = Double.parseDouble(txtEntrada.getText()) * 0.1364;
                    txtSaida.setText(String.valueOf(real) + " libras");
                } catch (NumberFormatException nfe) {
                    
                }
            }
        });
        radLibra.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                try {
                    if (radDolar.isSelected() == true || radEuro.isSelected() == true) {
                        radDolar.setSelected(false);
                        radEuro.setSelected(false);
                    }
                } catch (NullPointerException e) {
                    
                }
                
            }
        });
        mainPanel.add(radLibra);
    }
    
    private void setLblSaida() {
        lblSaida = new JLabel("Equivalem a: ");
        mainPanel.add(lblSaida);
    }
    
    private void setTxtSaida() {
        txtSaida = new JTextField();
        txtSaida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mainPanel.add(txtSaida);
    }
}
