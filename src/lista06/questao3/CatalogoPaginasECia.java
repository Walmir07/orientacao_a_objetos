package lista06.questao3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoPaginasECia {

    private List<Produto> produtos = new ArrayList<>();
    private List<String> log = new ArrayList<>();

    public boolean cadastrar(Produto p) {
        if (produtos.contains(p)) {
            return false;
        }

        for(Produto produto : produtos){
            if (produto.equals(p)){
                return false;
            }
        }

        produtos.add(p);
        log.add("Cadastrado: " + p);
        return true;
    }

    public List<String> getLog() {
        return Collections.unmodifiableList(log);
    }

    public List<Produto> getProdutos() {
        return Collections.unmodifiableList(produtos);
    }
}