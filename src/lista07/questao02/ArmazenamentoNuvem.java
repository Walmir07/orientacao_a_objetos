package lista07.questao02;

import java.util.HashMap;
import java.util.Map;

public class ArmazenamentoNuvem {
    private Map<String, byte[]> storage = new HashMap<>();

    public void gravar(String caminho, byte[] dados) {
        storage.put(caminho, dados);
    }

    public byte[] ler(String caminho) {
        return storage.get(caminho);
    }
}
