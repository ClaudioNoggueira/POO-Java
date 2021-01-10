/*
3) Escreva uma classe em Java que simule uma calculadora bem simples. Essa
classe deve ter como atributos duas variáveis double e um char. Deve possuir um
construtor que recebe como parâmetro dois números e um caracter,
Fatec Zona Sul 
Prof. Ma. Luciana Zapparolli
correspondente a uma das operações básicas (+, -, *, /). Deve ter um método para
calcular a operação desejada e um para imprimir o resultado. O programa deve
considerar divisões por zero como sendo erros, e imprimir uma mensagem
adequada.

 */
package LP08;

import javax.swing.JOptionPane;

class Calculadora {

    private double numUm, numDois;
    private char operacao;

    public Calculadora(double numUm, double numDois, char operacao) {
        this.numUm = numUm;
        this.numDois = numDois;
        this.operacao = operacao;
    }

    public double getNumUm() {
        return numUm;
    }

    public void setNumUm(double numUm) {
        this.numUm = numUm;
    }

    public double getNumDois() {
        return numDois;
    }

    public void setNumDois(double numDois) {
        this.numDois = numDois;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public double calcular(double numUm, double numDois, char op) {
        double result = 0;
        switch (op) {
            case '+':
                result = numUm + numDois;
                break;
            case '-':
                result = numUm - numDois;
                break;
            case '*':
                result = numUm * numDois;
                break;
            case '/':
                if (numDois != 0) {
                    result = numUm / numDois;
                }
                break;
        }
        return result;
    }

}

public class LP0803 {

    public static double lerNum(int i) {
        double num = 0;
        boolean valido = false;
        while (valido == false) {
            try {
                num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do " + i + "º número").replace(",", "."));
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente valores numéricos");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico.");
            }
        }
        return num;
    }

    public static char lerOperacao() {
        char operacao = '0';
        boolean valido = false;
        while (valido == false) {
            try {
                operacao = JOptionPane.showInputDialog("Digite um dos quatro sinais das operações matéticas abaixo:"
                        + "\n+ Adição"
                        + "\n- Subtração"
                        + "\n* Multiplicação"
                        + "\n/ Divisão").charAt(0);
                if (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/') {
                    JOptionPane.showMessageDialog(null, "Digite novamente.");
                } else {
                    valido = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente um dos quatro caractéres listados.");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite somente um dos quatro caractéres listados.");
            }
        }
        return operacao;
    }

    public static void exibir(double numUm, double numDois, char op, double result) {
        if (numDois != 0) {
            JOptionPane.showMessageDialog(null,
                    "1º número: " + String.valueOf(numUm).replace(".", ",")
                    + "\n2º número: " + String.valueOf(numDois).replace(".", ",")
                    + "\nOperação: " + String.valueOf(numUm).replace(".", ",")
                    + " " + op
                    + " " + String.valueOf(numDois).replace(".", ",")
                    + " = "
                    + String.valueOf(result).replace(".", ","));
        } else {
            JOptionPane.showMessageDialog(null, "Não eh possível dividir por zero.");
        }

    }

    public static void main(String[] args) {
        double numUm = 0;
        double numDois = 0;
        char operacao = 'a';

        Calculadora calc = new Calculadora(numUm, numDois, operacao);
        calc.setNumUm(lerNum(1));
        calc.setNumDois(lerNum(2));
        calc.setOperacao(lerOperacao());

        exibir(calc.getNumUm(),
                calc.getNumDois(),
                calc.getOperacao(),
                calc.calcular(calc.getNumUm(),
                        calc.getNumDois(),
                        calc.getOperacao()));
    }
}
