/*
 Ler a idade de uma pessoa e informar a sua classe eleitoral:
Não-eleitor (abaixo de 16 anos)
Eleitor obrigatório (entre 18 e 65 anos)
Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)
 */
package LP02;
import javax.swing.JOptionPane;
public class LP02_04 {
    public static int lerIdade(){
        int idade = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite a idade do identificar sua classe eleitoral"));
        return idade;
    }
    public static String classeEleitoral(int idade){
        String classeEleitoral = "";
        if(idade < 16){
            classeEleitoral = "NÃO-eleitor";
        }else if(idade >= 16 && idade < 18 || idade > 65){
            classeEleitoral = "Eleitor FACULTATIVO";
        }else{
            classeEleitoral = "Eleitor OBRIGATÓRIO";
        }
        return classeEleitoral;
    }
    public static void exibir(int idade, String classeEleitoral){
        JOptionPane.showMessageDialog(null,
                "Eleitor com " + idade + " anos"
                        + " configura-se como: "
                        + classeEleitoral);
    }
}
