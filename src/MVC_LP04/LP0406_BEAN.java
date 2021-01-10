/*
6ª) Criar um programa que receba um número que corresponda a um mês do 1º trimestre e
escreva o mês correspondente; caso o usuário digite o número fora do intervalo deverá
aparecer inválido, mas utilizando um método do tipo void
 */
package MVC_LP04;

/**
 *
 * @author claud
 */
public class LP0406_BEAN {
    private int mes;
    private String mesString;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getMesString() {
        return mesString;
    }

    public void setMesString(String mesString) {
        this.mesString = mesString;
    }

}
