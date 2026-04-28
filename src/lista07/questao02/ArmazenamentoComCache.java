package lista07.questao02;

import java.util.HashMap;
import java.util.Map;

public class ArmazenamentoComCache extends ArmazenamentoNuvem {
    private Map<String, byte[]> cache = new HashMap<>();

    @Override
    public void gravar(String caminho, byte[] dados) {
        cache.put(caminho, dados);
        // não chama super.gravar() — dados ficam apenas no cache
    }

    @Override
    public byte[] ler(String caminho) {
        return cache.getOrDefault(caminho, null);
    }
}