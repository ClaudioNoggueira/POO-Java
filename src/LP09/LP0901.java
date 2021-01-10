/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP09;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author claud
 */
public class LP0901 {

    private JFrame janela;
    private JPanel mainPainel;
    private JTextField txtVisu;

    public String calculadora(String expressao) {
        String resultado;
        List<Double> listaNumeros = new ArrayList<>();
        List<Character> listaOperadores = new ArrayList<>();

        listaNumeros = obterNumeros(expressao);
        listaOperadores = obterOperadores(expressao);

        resultado = calcularValor(listaNumeros, listaOperadores);

        return resultado;
    }

    public String calcularValor(List<Double> listaNumeros, List<Character> listaOperadores) {
        String resultado = "";
        double total = 0;
        int j = 0;
        for (int i = 0; i < listaNumeros.size() - 1; i++) {
            if (total == 0) {
                double numero1 = listaNumeros.get(i).doubleValue();
                double numero2 = listaNumeros.get(i + 1).doubleValue();
                char operador = listaOperadores.get(i);
                total = executarOperacao(numero1, operador, numero2);
            } else if (total > 0) {
                double numero2 = listaNumeros.get(i).doubleValue();
                char operador = listaOperadores.get(j);
                total = executarOperacao(total, operador, numero2);
                j++;
            }
        }
        resultado = "" + total;
        return resultado;
    }

    public double executarOperacao(double numero1, char operador, double numero2) {
        double resultado = 0;
        if (operador == '+') {
            resultado = numero1 + numero2;
        } else if (operador == '-') {
            resultado = numero1 - numero2;
        } else if (operador == '*') {
            resultado = numero1 * numero2;
        } else if (operador == '/') {
            resultado = numero1 / numero2;
        }
        return resultado;
    }

    public List<Double> obterNumeros(String expressao) {
        List<Double> listaNumeros = new ArrayList<>();
        String numeroString = "";
        for (int i = 0; i < expressao.length(); i++) {
            if (isOperador(expressao.charAt(i))) {
                Double numero = Double.valueOf(numeroString);
                listaNumeros.add(numero);
                numeroString = "";
            } else {
                numeroString = numeroString.concat("" + expressao.charAt(i));
            }
        }
        if (!numeroString.isEmpty()) {
            Double numero = Double.valueOf(numeroString);
            listaNumeros.add(numero);
        }
        return listaNumeros;
    }

    public List<Character> obterOperadores(String expressao) {
        List<Character> listaOperadores = new ArrayList<>();
        for (int i = 0; i < expressao.length(); i++) {
            if (isOperador(expressao.charAt(i))) {
                listaOperadores.add(new Character(expressao.charAt(i)));
            }
        }
        return listaOperadores;
    }

    private boolean isOperador(char caractere) {
        boolean isOperador = false;
        if (caractere == '-' || caractere == '+' || caractere == '*' || caractere == '/') {
            isOperador = true;
        }
        return isOperador;
    }

    public static void main(String[] args) {
        new LP0901().montaTela();
    }

    private void montaTela() {
        preparaJanela();
        preparaText();
        preparaPainelPrincipal();

        btnSete();
        btnOito();
        btnNove();
        btnDivisao();

        btnQuatro();
        btnCinco();
        btnSeis();
        btnVezes();

        btnUm();
        btnDois();
        btnTres();
        btnMenos();

        btnZero();
        btnApagar();
        btnIgual();
        btnMais();

        mostraJanela();
    }

    private void preparaJanela() {
        janela = new JFrame("Calculadora");
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mostraJanela() {
        janela.pack();
        janela.setSize(250, 250);
        janela.setVisible(true);
    }

    private void preparaPainelPrincipal() {
        janela.setLayout(new BorderLayout());
        mainPainel = new JPanel();
        janela.add(mainPainel, BorderLayout.SOUTH);
        mainPainel.setLayout(new GridLayout(4, 4));
    }

    private void preparaText() {
        txtVisu = new JTextField("");
        txtVisu.setEnabled(false);
        txtVisu.setSize(250, 50);
        txtVisu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        janela.add(txtVisu, BorderLayout.NORTH);
    }

    private void btnZero() {
        JButton btnZero = new JButton("0");
        btnZero.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "0");
        });
        mainPainel.add(btnZero);
    }

    private void btnUm() {
        JButton btnUm = new JButton("1");
        btnUm.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "1");
        });
        mainPainel.add(btnUm);
    }

    private void btnDois() {
        JButton btnDois = new JButton("2");
        btnDois.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "2");
        });
        mainPainel.add(btnDois);
    }

    private void btnTres() {
        JButton btnTres = new JButton("3");
        btnTres.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "3");
        });
        mainPainel.add(btnTres);
    }

    private void btnQuatro() {
        JButton btnQuatro = new JButton("4");
        btnQuatro.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "4");
        });
        mainPainel.add(btnQuatro);
    }

    private void btnCinco() {
        JButton btnCinco = new JButton("5");
        btnCinco.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "5");
        });
        mainPainel.add(btnCinco);
    }

    private void btnSeis() {
        JButton btnSeis = new JButton("6");
        btnSeis.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "6");
        });
        mainPainel.add(btnSeis);
    }

    private void btnSete() {
        JButton btnSete = new JButton("7");
        btnSete.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "7");
        });
        mainPainel.add(btnSete);
    }

    private void btnOito() {
        JButton btnOito = new JButton("8");
        btnOito.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "8");
        });
        mainPainel.add(btnOito);
    }

    private void btnNove() {
        JButton btnNove = new JButton("9");
        btnNove.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "9");
        });
        mainPainel.add(btnNove);
    }

    private void btnApagar() {
        JButton btnApagar = new JButton("(x)");
        btnApagar.addActionListener((ActionEvent e) -> {
            txtVisu.setText("");
        });
        mainPainel.add(btnApagar);
    }

    private void btnMais() {
        JButton btnMais = new JButton("+");
        btnMais.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "+");
        });
        mainPainel.add(btnMais);
    }

    private void btnMenos() {
        JButton btnMenos = new JButton("-");
        btnMenos.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "-");
        });
        mainPainel.add(btnMenos);
    }

    private void btnVezes() {
        JButton btnVezes = new JButton("*");
        btnVezes.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "*");
        });
        mainPainel.add(btnVezes);
    }

    private void btnDivisao() {
        JButton btnDivisao = new JButton("/");
        btnDivisao.addActionListener((ActionEvent e) -> {
            txtVisu.setText(txtVisu.getText() + "/");
        });
        mainPainel.add(btnDivisao);
    }

    private void btnIgual() {
        JButton btnIgual = new JButton("=");
        btnIgual.addActionListener((ActionEvent e) -> {
            String valor = txtVisu.getText();
            String resultado = calculadora(valor);
            txtVisu.setText(resultado);
        });
        mainPainel.add(btnIgual);
    }
}
