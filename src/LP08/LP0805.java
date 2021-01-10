/*
5) Crie uma classe Animal contendo os atributos tipo e cor. Adicione os métodos
set, get, um construtor para classe que inicialize as variáveis de instância, e um
método toString para retornar o tipo e a cor do animal.
 Construa uma classe Cachorro que estenda a classe Animal e tenha os atributos
nome e raça do cachorro, construa para classe os métodos set, get, um
construtor e um método toString para classe cachorro.
 Construa uma classe Cocker que estenda a classe Cachorro e tenha os atributos
tosa do tipo boolean (falso, verdadeiro), com um método setTosa e um método
precisaTosa que deve retornar apenas se precisa ou não de tosa.
 Escreva um programa de teste (classe CockerTeste) adequado para esta classe
testando os métodos da classe e os métodos herdados. Utilize para entrada e saída
de dados a classe JOptionPane.
 */
package LP08;

import javax.swing.JOptionPane;

class Animal {

    private String cor, tipo;

    public Animal(String cor, String tipo) {
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" + "cor=" + cor + ", tipo=" + tipo + '}';
    }

}

class Cachorro extends Animal {

    private String nome, raca;

    public Cachorro(String nome, String raca, String cor, String tipo) {
        super(cor, tipo);
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "nome=" + nome + ", raca=" + raca + '}';
    }
    
}

class Cocker extends Cachorro {

    private boolean tosa;

    public Cocker(boolean tosa, String nome, String raca, String cor, String tipo) {
        super(nome, raca, cor, tipo);
        this.tosa = tosa;
    }

    public boolean isTosa() {
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    public String precisaTosa(boolean tosa) {
        if (tosa == true) {
            return "Precisa de tosa";
        } else {
            return "Não precisa de tosa";
        }
    }
}

class CockerTeste {

    public static String lerNome() {
        String nome = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                nome = JOptionPane.showInputDialog("Escreva o NOME do cachorro.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva o nome do cachorro.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return nome;
    }

    public static String lerRaca() {
        String raca = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                raca = JOptionPane.showInputDialog("Escreva a RAÇA do cachorro.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva a raça do cachorro.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return raca;
    }

    public static String lerCor() {
        String cor = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                cor = JOptionPane.showInputDialog("Escreva a COR do animal.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva a cor do cachorro.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return cor;
    }

    public static String lerTipo() {
        String raca = "";
        boolean valorValido = false;
        while (valorValido == false) {
            try {
                raca = JOptionPane.showInputDialog("Escreva o TIPO do animal.");
                valorValido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva o tipo do cachorro.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return raca;
    }
    
    public static boolean lerTosa(){
        boolean tosa = false;
        boolean valorValido = false;
        String resposta = "";
        while(valorValido == false){
            try{
                resposta = JOptionPane.showInputDialog("Digite se o cachorro precisa de tosa.\nSim\nNão");
                if(resposta.equals("sim") || resposta.equals("Sim") || resposta.equals("SIM")){
                    tosa = true;
                    valorValido = true;
                }else if(resposta.equals("não") || resposta.equals("nao") ||
                        resposta.equals("Não") || resposta.equals("Nao") ||
                        resposta.equals("NÃO") || resposta.equals("NAO")){
                    tosa = false;
                    valorValido = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Digite novamente.","Valor inválido", 2);
                }
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,
                        "Por favor, escreva se o cachorro precisa de tosa.",
                        "Campo não pode ficar vazio", 2);
            }
        }
        return tosa;
    }

    public static void main(String[] args) {
        String tipo = "";
        String cor = "";
        String nome = "";
        String raca = "";
        
        Animal animal = new Animal(cor, tipo);
        animal.setCor(lerCor());
        animal.setTipo(lerTipo());
        JOptionPane.showMessageDialog(null, animal.toString());
        
        Cachorro dog = new Cachorro(nome, raca, animal.getCor(), animal.getTipo());
        dog.setNome(lerNome());
        dog.setRaca(lerRaca());
        JOptionPane.showMessageDialog(null, dog.toString());
        
        Cocker cocker = new Cocker(false, nome, raca, cor, tipo);
        cocker.setTosa(lerTosa());
        JOptionPane.showMessageDialog(null, cocker.precisaTosa(cocker.isTosa()));
    }
}

public class LP0805 {

}
