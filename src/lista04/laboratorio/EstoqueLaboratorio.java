package lista04.laboratorio;

import java.util.ArrayList;
import java.util.List;

public class EstoqueLaboratorio {

    public List<ItemLaboratorio> itens;

    public EstoqueLaboratorio(){
        itens = new ArrayList<>();
    }

    public void cadastrar(ItemLaboratorio item){
        if(item == null){
            throw new IllegalArgumentException();
        }

        itens.add(item);
    }

    public ItemLaboratorio buscarPorCodigo(String codigo){
        for(ItemLaboratorio item : itens){
            if(item.getCodigo().equals(codigo)){
                return item;
            }
        }
        return null;
    }

    public List<ItemLaboratorio> listarEmAlerta(){
        List<ItemLaboratorio> novaLista = new ArrayList<>(){
        };

        for(ItemLaboratorio item : itens){
            if(item.getStatus().equals("ALERTA") || item.getStatus().equals("ESGOTADO")){
                novaLista.add(item);
            }
        }

        return novaLista;
    }

}
