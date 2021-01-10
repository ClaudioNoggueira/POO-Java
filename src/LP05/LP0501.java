/*
1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um
triângulo. Na classe definir um método para leitura da base e altura, um método construtor
e um método para Calcular a área do triângulo (Area=Base * Altura)/2.
No método principal do programa (main) , criar um objeto a partir da classe criada, solicitar
e atribuir os valores da base e altura e invocar o método que calcula a área a partir do objeto
criado.
 */
package LP05;

public class LP0501 {

    public static void main(String[] args) {
        Triangulo areaT = new Triangulo();
        //Ler valor da base
        areaT.setBase(areaT.lerBase());
        //Ler valor da altura
        areaT.setAltura(areaT.lerAltura());
        //Calcular valor da area
        areaT.setAreaT(areaT.calcAreaTriangulo(areaT.getBase(), areaT.getAltura()));
        //Exibir valores
        areaT.exibir(areaT.getBase(), areaT.getAltura(), areaT.getAreaT());
    }
}
