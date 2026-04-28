package lista07.questao03;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Item> itens = new ArrayList<>();
    private double valorFrete;

    public Carrinho(double valorFrete){
        this.itens = new ArrayList<>();
        this.valorFrete = valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }

    public double subTotalLista(){
        double total = 0;
        for(Item item : itens){
            total += item.getPrecoUnitario();
        }

        return total;
    }

    public boolean doisOuMaisDistintos(){
        int tipos = 0;
        for(Item item : itens){
            for(int i = 0; i < itens.size(); i++){
                if(item.getNome().equals(itens.get(i).getNome())){
                    tipos += 0;
                } else {
                    tipos++;
                }
            }
        }

        return tipos >= 2;
    }

    public boolean somaTotalDeItensMaiorQue5() {
        int itensTotais = 0;
        for(Item item : itens){
            itensTotais += item.getQuantidade();
        }

        return itensTotais > 5;
    }

    public double ValorDoProdutoMaisBarato(){
        double menorValor = itens.get(0).getPrecoUnitario();
        for(Item item : itens){
            if(menorValor > item.getPrecoUnitario()){
                menorValor = item.getPrecoUnitario();
            };
        }
        return menorValor;
    }

    public double valorFinal(){
        return subTotalLista() + valorFrete;
    }

}
