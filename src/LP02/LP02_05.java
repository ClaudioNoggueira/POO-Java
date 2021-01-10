/*
Depois da liberação do governo para as mensalidades dos planos de saúde, as
pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro.
Um vendedor de um plano de saúde apresentou a tabela a seguir. Criar um programa
que entre com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar.
Até 10 anos – R$ 30,00
Acima de 10 até 29 anos – R$ 60,00
Acima de 29 até 45 anos – R$ 120,00
Acima de 45 até 59 anos – R$ 150,00
Acima de 59 até 65 anos – R$ 250,00
Maior que 65 anos – R$ 400,00
 */
package LP02;
import javax.swing.JOptionPane;
public class LP02_05 {
    public static String lerNome(){
        String nome ="";
        nome = JOptionPane.showInputDialog("Entre com o nome do cliente.");
        return nome;
    }
    public static int lerIdade(){
        int idade = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente."));
        return idade;
    }
    public static String planoSaude(String nomeCliente, int idadeCliente){
        String plano = "";
        if(idadeCliente < 10){
            plano = "R$ 30,00";
        }else if(idadeCliente >= 10 && idadeCliente <29){
            plano = "R$ 60,00";
        }else if(idadeCliente >= 29 && idadeCliente < 45){
            plano = "R$ 120,00";
        }else if(idadeCliente >= 45 && idadeCliente < 59){
            plano = "R$ 150,00";
        }else if(idadeCliente >= 59 && idadeCliente < 65){
            plano = "R$ 250,00";
        }else if(idadeCliente >= 65){
            plano = "R$ 400,00";
        }
        return plano;
    }
    public static void exibirPlano(String nome, int idade, String plano){
        JOptionPane.showMessageDialog(null, "Cliente: " + nome
        +"\nIdade: " + idade
        +"\nPlano recomendado: " + plano);
    }
}
