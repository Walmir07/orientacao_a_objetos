package lista07.questao03;

import java.util.List;

public class RegraDescontoSegundaUnidade implements Regra {

    @Override
    public double getDesconto(Carrinho carrinho){
        List<Item> distintos = carrinho.getItens().stream().distinct().toList();

        if(distintos.size() < 2) return 0;

        Item maisBarato = distintos.get(0);

        for(Item item : distintos){
            if(item.getPrecoUnitario() < maisBarato.getPrecoUnitario()){
                maisBarato = item;
            }
        }

        return maisBarato.getPrecoUnitario() * 0.50;
    };

}
