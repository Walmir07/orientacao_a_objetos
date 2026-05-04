package lista07.questao03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Carrinho {

    private List<Item> itens = new ArrayList<>();
    private double valorFrete;

    public List<Item> getItens() {
        return itens;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    private void setValorFrete(double valor) {
        this.valorFrete = valor;
    }

    private void adicionarItem(Item item) {
        itens.add(item);
    }

    public double obterMelhorDesconto(List<Regra> regras){
        Carrinho carrinho = this;
        regras.sort(new Comparator<Regra>() {
            @Override
            public int compare(Regra o1, Regra o2) {
                return (int)(o1.getDesconto(carrinho) - o2.getDesconto(carrinho));
            }
        });

        double melhorDesconto = regras.getFirst().getDesconto(carrinho);

        for(Regra regra : regras){
            double desconto = regra.getDesconto(this);
            if(desconto > melhorDesconto){
                melhorDesconto = desconto;
            }
            return melhorDesconto;
        }

        return 0;
    }

    public static void main(String[] args){

        Carrinho carrinho = new Carrinho();

        carrinho.setValorFrete(10.00);
        carrinho.adicionarItem(new Item("Feijão", 5.00, 5));
        carrinho.adicionarItem(new Item("Arroz", 4.00, 3));
        carrinho.adicionarItem(new Item("Alface", 2.00, 2));

    }

}
