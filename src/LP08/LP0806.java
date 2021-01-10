/*
6) Implemente a classe Pessoa possuindo nome, idade, altura e sexo como
variáveis de instância. Construa os métodos set e get para cada variável de instância
e um construtor para a classe para inicializar as variáveis de instância. Construa
depois uma classe Empregado que deve ser uma subclasse da classe Pessoa
(herança), adicionando um novo construtor e uma variável de instância salário e os
métodos set e get para o novo atributo.
Construa um método obterLucros que devolva o lucro (salário) do empregado.
Escreva um programa de teste (classe EmpregadoTeste) adequado para esta classe
testando os métodos da classe e os métodos herdados. Utilize para entrada e saída
de dados a classe JOptionPane.
 */
package LP08;

import javax.swing.JOptionPane;

class Pessoa {
    
    private String nome, idade, altura, sexo;
    
    public Pessoa(String nome, String idade, String altura, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getIdade() {
        return idade;
    }
    
    public void setIdade(String idade) {
        this.idade = idade;
    }
    
    public String getAltura() {
        return altura;
    }
    
    public void setAltura(String altura) {
        this.altura = altura;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

class Empregado2 extends Pessoa {
    
    private double salario;
    
    public Empregado2(double salario, String nome, String idade, String altura, String sexo) {
        super(nome, idade, altura, sexo);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double obterLucros(double salario) {
        return salario;
    }
}

class EmpregadoTeste {
    
    public static String lerNome() {
        String aux = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                aux = JOptionPane.showInputDialog("Escreva o nome da pessoa.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva o nome da pessoa.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return aux;
    }
    
    public static String lerIdade() {
        String aux = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                aux = JOptionPane.showInputDialog("Digite a idade da pessoa.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva a idade da pessoa.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return aux;
    }
    
    public static String lerAltura() {
        String aux = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                aux = JOptionPane.showInputDialog("Escreva a altura da pessoa.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva a altura da pessoa.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return aux;
    }
    
    public static String lerSexo() {
        String aux = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                aux = JOptionPane.showInputDialog("Escreva o sexo da pessoa.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva o sexo da pessoa.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return aux;
    }
    
    public static double lerSalario() {
        double num = 0;
        boolean valido = false;
        while (valido == false) {
            try {
                num = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do salário do empregado.").replace(",", "."));
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente valores numéricos");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico.");
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        String nome = "";
        String idade = "";
        String altura = "";
        String sexo = "";
        double salario = 0;
        
        Pessoa pes = new Pessoa(nome, idade, altura, sexo);
        pes.setNome(lerNome());
        pes.setIdade(lerIdade());
        pes.setAltura(lerAltura());
        pes.setSexo(lerSexo());
        
        Empregado2 emp = new Empregado2(salario, pes.getNome(), pes.getIdade(), pes.getAltura(), pes.getSexo());
        emp.setSalario(lerSalario());
        
        JOptionPane.showMessageDialog(null,
                "Nome do empregado: " + emp.getNome()
                + "\nIdade: " + emp.getIdade()
                + "\nAltura: " + emp.getAltura().replace(".", ",")
                + "\nSexo: " + emp.getSexo()
                + "\nSalário: R$" + String.valueOf(emp.getSalario()).replace(".", ","));
    }
}

public class LP0806 {
    
}
