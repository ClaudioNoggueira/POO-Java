package LP07;

import javax.swing.JOptionPane;

public class Superior {

    float n1, n2, n3, media;

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    void lerN1() {
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                setN1(Float.parseFloat(
                        JOptionPane.showInputDialog("Superior\nDigite a nota da P1.").replace(",", ".")));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
    }

    void lerN2() {
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                setN2(Float.parseFloat(
                        JOptionPane.showInputDialog("Superior\nDigite a nota da P2.").replace(",", ".")));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
    }

    void lerN3() {
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                setN3(Float.parseFloat(
                        JOptionPane.showInputDialog("Superior\nDigite a nota do trabalho.").replace(",", ".")));
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Campo não pode ficar vazio.",
                        "Valor inválido", 2);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Digite somente valores numéricos, sem mais de uma vírgula.",
                        "Valor inválido", 2);
            }
        }
    }

    public void calculaMedia() {
        setMedia((float) (getN1() * 0.35 + getN2() * 0.5 + getN3() * 0.15));
    }
}
