package aula3;

import java.time.LocalDateTime;

public class Produto {

    String nome;
    double preco;
    int quantidade;
    LocalDateTime validade;

    public Produto(String nome, double preco, int quantidade, LocalDateTime validade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    double valorEmEstoque(){
        return preco * quantidade;
    }

    double calcularPreco(double desconto){
        if(desconto < 1){
            return preco * desconto;
        } else {
            return preco;
        }
    }

    LocalDateTime getValidade(){
        return validade;
    }

}
