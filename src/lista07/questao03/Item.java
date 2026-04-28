package lista07.questao03;

public class Item {

    private String nome;
    private double precoUnitario;
    private int quantidade;

    public Item(String nome, double precoUnitario, int quantidade){
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
