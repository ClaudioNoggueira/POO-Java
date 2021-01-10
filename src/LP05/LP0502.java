/*
2ª) Criar uma Classe chamada Equacao que contenha como atributos 3 valores inteiros, A,
B e C. Na classe definir um método para leitura dos valores, um método construtor e um
método para calcular as raízes da equação.
R1 = -b+ (raiz de delta) / (2*a)
R2 = -b-(raiz de delta) / (2*a)
Considerar que:
- Se delta = 0, as raízes são iguais;
- Se delta <0, não existem raízes reais;
- Se delta >=, existem 2 raízes diferentes
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar
e atribuir os valores e invocar o método que calcula as raízes a partir do objeto criado.
 */
package LP05;

public class LP0502 {

    public static void main(String[] args) {
        Equacao equacao = new Equacao();
        //Ler valor de A
        equacao.setA(equacao.lerA());
        //Ler valor de B
        equacao.setB(equacao.lerB());
        //Ler valor de C
        equacao.setC(equacao.lerC());
        //Calcular Delta
        equacao.setDelta(equacao.calcDelta(equacao.getA(), equacao.getB(), equacao.getC()));
        //Calcular raízes
        equacao.setRaiz(equacao.calcRaiz(equacao.getA(), equacao.getB(), equacao.getC(), equacao.getDelta()));
        //Exibir valores
        equacao.exibir(equacao.getA(), equacao.getB(), equacao.getC(), equacao.getDelta(), equacao.getRaiz());
    }
}
