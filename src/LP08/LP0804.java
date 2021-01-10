/*
4) Crie uma classe em Java chamada Data que inclui três informações como
variáveis de instância:
• mês (int),
• dia (int)
• e ano (int).
A classe deve ter métodos get e set para cada variável e um construtor que
inicializa as variáveis e assume que os valores fornecidos são corretos. Forneça
um método displayData que exibe o dia, o mês e o ano separados por barras
normais ( / ).
Escreva um aplicativo de teste chamado DataTeste que demonstra as
capacidades da classe Data.
 */
package LP08;

import java.util.Calendar;
import javax.swing.JOptionPane;

class Data {

    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String displayData(int dia, int mes, int ano) {
        String data = "";
        data = "Data: " + dia + "/" + mes + "/" + ano;
        return data;
    }
}

class DataTeste {

    public static int lerNum(int i) {
        int num = 0;
        boolean valido = false;
        while (valido == false) {
            try {
                switch (i) {
                    case 1:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia."));
                        if (num > 31 || num <= 0) {
                            JOptionPane.showMessageDialog(null, "Digite um número entre 1 e 31", "Valor inválido", 2);
                        } else {
                            valido = true;
                        }
                        break;
                    case 2:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês."));
                        if (num > 12 || num <= 0) {
                            JOptionPane.showMessageDialog(null, "Digite um número entre 1 e 12", "Valor inválido", 2);
                        } else {
                            valido = true;
                        }
                        break;
                    case 3:
                        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano."));
                        if (num < 0) {
                            JOptionPane.showMessageDialog(null, "Digite um número maior que zero.", "Valor inválido", 2);
                        } else {
                            valido = true;
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros positivos");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro.");
            }
        }
        return num;
    }

        public static void main(String[] args) {
        int dia = 0;
        int mes = 0;
        int ano = 0;

        Data data = new Data(dia, mes, ano);
        data.setDia(lerNum(1));
        data.setMes(lerNum(2));
        data.setAno(lerNum(3));

        JOptionPane.showMessageDialog(null, data.displayData(data.getDia(), data.getMes(), data.getAno()));
    }
}

public class LP0804 {

}
