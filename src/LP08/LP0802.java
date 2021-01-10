/*
2) A fim de representar empregados em uma firma, crie uma classe chamada
Empregado que inclui as três informações a seguir como atributos:
• um primeiro nome,
• um sobrenome, e
• um salário mensal.
Sua classe deve ter um construtor que inicializa os três atributos. Forneça um
método set e get para cada atributo. Se o salário mensal não for positivo,
configure-o como 0.
Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie
duas instâncias da classe e exiba o salário anual de cada instância.
Então dê a cada empregado um aumento de 10% e exiba novamente o salário
anual de cada empregado.

 */
package LP08;

import javax.swing.JOptionPane;

class Empregado {

    private String priNome, sobreNome;
    private double salarioMensal;

    public Empregado(String priNome, String sobreNome, double salarioMensal) {
        this.priNome = priNome;
        this.sobreNome = sobreNome;
        this.salarioMensal = salarioMensal;
    }

    public String getPriNome() {
        return priNome;
    }

    public void setPriNome(String priNome) {
        this.priNome = priNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double validaSalario(double salario) {
        if (salario < 0) {
            salario = 0;
        }
        return salario;
    }

    public double aumentoSalario(double salario) {
        salario *= 1.1;
        return salario;
    }

    public double mostrarSalarioAnual(double salario) {
        salario *= 12;
        return salario;
    }
}

public class LP0802 {

    public static String lerNome(int i) {
        String nome = "";
        boolean valido = false;
        while (valido == false) {
            try {
                nome = JOptionPane.showInputDialog(null, "Escreva o nome do " + i + "º empregado. ");
                valido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro.");
            }
        }
        return nome;
    }

    public static String lerSobreNome(int i) {
        String nome = "";
        boolean valido = false;
        while (valido == false) {
            try {
                nome = JOptionPane.showInputDialog(null, "Escreva o sobrenome do " + i + "º empregado.");
                valido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro.");
            }
        }
        return nome;
    }

    public static double lerSalario(int i) {
        double num = 0;
        boolean valido = false;
        while (valido == false) {
            try {
                num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salario do " + i + "º empregado").replace(",", "."));
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente valores numéricos");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico.");
            }
        }
        return num;
    }

    public static void exibir(String nome, String sNome, double salM, double salA, double salNovo, double salANovo) {
        JOptionPane.showMessageDialog(null,
                "Nome do funcionário: " + nome + " " + sNome
                + "\nSalário: R$ " + String.valueOf(salM).replace(".", ",")
                + "\nSalário anual: " + String.valueOf(salA).replace(".", ",")
                + "\nCom aumento de 10%: " + String.valueOf(salNovo).replace(".", ",")
                + "\nSalário anual após aumento de 10%: R$ " + String.valueOf(salANovo).replace(".", ","));
    }

    public static void main(String[] args) {
        String nome = "";
        String sobreNome = "";
        double salario = 0;

        Empregado empregado1 = new Empregado(nome, sobreNome, salario);
        Empregado empregado2 = new Empregado(nome, sobreNome, salario);

        empregado1.setPriNome(lerNome(1));
        empregado1.setSobreNome(lerSobreNome(1));
        empregado1.setSalarioMensal(empregado1.validaSalario(lerSalario(1)));

        empregado2.setPriNome(lerNome(2));
        empregado2.setSobreNome(lerSobreNome(2));
        empregado2.setSalarioMensal(empregado1.validaSalario(lerSalario(2)));

        exibir(empregado1.getPriNome(),
                empregado1.getSobreNome(),
                empregado1.getSalarioMensal(),
                empregado1.mostrarSalarioAnual(empregado1.getSalarioMensal()),
                empregado1.aumentoSalario(empregado1.getSalarioMensal()),
                empregado1.mostrarSalarioAnual(empregado1.aumentoSalario(empregado1.getSalarioMensal()))
        );

        exibir(empregado2.getPriNome(),
                empregado2.getSobreNome(),
                empregado2.getSalarioMensal(),
                empregado2.mostrarSalarioAnual(empregado2.getSalarioMensal()),
                empregado2.aumentoSalario(empregado2.getSalarioMensal()),
                empregado2.mostrarSalarioAnual(empregado2.aumentoSalario(empregado2.getSalarioMensal()))
        );
    }
}
