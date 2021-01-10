package LP05;

import javax.swing.JOptionPane;

public class Triangulo {

    private float base, altura, areaT;

    public Triangulo() {
        this.base = 0;
        this.altura = 0;
        this.areaT = 0;
    }

    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAreaT() {
        return areaT;
    }

    public void setAreaT(float areaT) {
        this.areaT = areaT;
    }

    public float lerBase() {
        float base = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                base = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro. Digite novamente.", "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente valores numéricos", "Valor inválido", 2);
            }
        }
        return base;
    }

    public float lerAltura() {
        float altura = 0;
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                altura = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura").replace(",", "."));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro. Digite novamente.", "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente valores numéricos", "Valor inválido", 2);
            }
        }
        return altura;
    }

    public float calcAreaTriangulo(float base, float altura) {
        float areaT = 0;
        areaT = (base * altura) / 2;
        return areaT;
    }

    public void exibir(float base, float altura, float areaT) {
        JOptionPane.showMessageDialog(null,
                "Valor do base: " + base
                + "\nValor da altura: " + altura
                + "\n\nValor da area: " + areaT);
    }

}
