/*
1) Crie uma classe chamada Faturar que possa ser utilizado por uma loja de
suprimentos de informática para representar uma fatura de um item vendido na
loja. Uma fatura deve incluir as seguintes informações como atributos:
• o número do item faturado,
• a descrição do item,
• a quantidade comprada do item e
• o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a
quantidade não for positiva, ela deve ser configurada como 0. Se o preço por item
não for positivo ele deve ser configurado como 0.
Forneça um método set e um método get para cada variável de instância. Além
disso, forneça um método chamado getFaturarTotal que calcula o valor da fatura
(isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como
um double.
Escreva um aplicativo de teste que demonstra as capacidades da classe Faturar.
 */
package LP08;

import javax.swing.JOptionPane;

class Fatura {

    private int numItem, qtde;
    private String descricao;
    private float preco;

    public Fatura(int numItem, int qtde, String descricao, float preco) {
        this.numItem = numItem;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int validaQtde(int qtde) {
        if (qtde < 0) {
            qtde = 0;
        }
        return qtde;
    }

    public float validaPreco(float preco) {
        if (preco < 0) {
            preco = 0;
        }
        return preco;
    }

    public double getFaturaTotal(float preco, int qtde) {
        double faturaTotal = 0;
        faturaTotal = preco * qtde;
        return faturaTotal;
    }
}

public class LP0801 {

    public static int lerNumItem() {
        int num = 0;
        boolean valido = false;
        while (valido == false) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o nº do item. "));
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros positivos");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro.");
            }
        }
        return num;
    }

    public static int lerQtde() {
        int num = 0;
        boolean valido = false;
        while (valido == false) {
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do item. "));
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros positivos");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro.");
            }
        }
        return num;
    }

    public static String lerDescricao() {
        String descricao = "";
        boolean valido = false;
        while (valido == false) {
            try {
                descricao = JOptionPane.showInputDialog(null, "Descreva o item. ");
                valido = true;
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro.");
            }
        }
        return descricao;
    }

    public static float lerPreco() {
        float num = 0;
        boolean valido = false;
        while (valido == false) {
            try {
                num = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a preço do item. ").replace(",", "."));
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite somente números inteiros positivos");
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Digite um número inteiro.");
            }
        }
        return num;
    }

    public static void exibir(int numItem, int qtde, String descricao, float preco, double faturaTotal) {
        JOptionPane.showMessageDialog(null,
                "Nº do item: " + numItem
                + "\nQuantidade: " + qtde
                + "\nDescrição: " + descricao
                + "\nPreço: R$ " + String.valueOf(preco).replace(".", ",")
                + "\n\nFatura Total: R$ " + String.valueOf(faturaTotal).replace(".", ","));
    }

    public static void main(String[] args) {
        int numItem, qtde;
        String descricao;
        float preco;
        
        numItem = lerNumItem();
        qtde = lerQtde();
        descricao = lerDescricao();
        preco = lerPreco();

        Fatura fatura = new Fatura(numItem, qtde, descricao, preco);
        fatura.setQtde(fatura.validaQtde(qtde));
        fatura.setPreco(fatura.validaPreco(preco));
        
        exibir(fatura.getNumItem(),
                fatura.getQtde(),
                fatura.getDescricao(),
                fatura.getPreco(),
                fatura.getFaturaTotal(fatura.getPreco(), fatura.getQtde()));
    }
}
