/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LP05;

import javax.swing.JOptionPane;

/**
 *
 * @author claud
 */
public class Equacao {

    private int a, b, c, delta;
    private String raiz;

    public Equacao() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.delta = 0;
        this.raiz = "";
        
    }

    
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String getRaiz() {
        return raiz;
    }

    public void setRaiz(String raiz) {
        this.raiz = raiz;
    }

    public int lerA() {
        int num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A."));
                if (num == 0) {
                    JOptionPane.showMessageDialog(null,
                            "A não pode ser igual a 0, pois constituiria uma equação do primeiro grau.",
                            "Digite outro valor.", 2);
                } else {
                    valorValido = true;
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Campo não pode ficar nulo.", "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros", "Valor inválido", 2);
            }
        }
        return num;
    }

    public int lerB() {
        int num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Campo não pode ficar nulo.", "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros", "Valor inválido", 2);
            }
        }
        return num;
    }

    public int lerC() {
        int num = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Campo não pode ficar nulo.", "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros", "Valor inválido", 2);
            }
        }
        return num;
    }

    public int calcDelta(int A, int B, int C) {
        int delta = 0;
        delta = (B * B) - 4 * A * C;
        return delta;
    }

    public String calcRaiz(int a, int b, int c, int delta) {
        String raiz = "";
        if (delta < 0) {
            raiz = "Delta menor que zero. Equação não possui raízes reais.";
            return raiz;
        } else if (delta == 0) {
            raiz = "Delta igual zero. Equação possui apenas uma raiz real: "
                    + String.valueOf(-b / 2 * a);
            return raiz;
        } else {
            raiz = "Delta maior que zero. Equação possúi duas raizes reais:\n"
                    + String.valueOf((-b + Math.sqrt(delta)) / 2 * a) + " e "
                    + String.valueOf((-b - Math.sqrt(delta)) / 2 * a);
            return raiz;
        }
    }

    public void exibir(int a, int b, int c, int delta, String raiz) {
        JOptionPane.showMessageDialog(null,
                "Valores inseridos:"
                + "\nA: " + a
                + "\nB: " + b
                + "\nC: " + c
                + "\nDelta: " + delta
                + "\n\n" + raiz);
    }
}
