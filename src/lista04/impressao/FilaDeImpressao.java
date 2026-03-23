package lista04.impressao;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class FilaDeImpressao {

    public String nome;
    public List<Documento> fila;

    public FilaDeImpressao(String nome){
        if(nome == null || nome.isBlank()){
            throw new IllegalArgumentException();
        }

        this.nome = nome;
        this.fila = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    /*
    public void adicionar(Documento d){
        if(d == null){
            throw new IllegalArgumentException();
        }
        if (d.getPrioridade().equals("URGENTE")) {

            for(int i = 0; i < fila.size(); i++){
                if(!fila.get(i).getPrioridade().equals("URGENTE")){
                    fila.add(i, d);
                }
            }

        } else {
            fila.add(d);
        }
    }
    */

    public void adicionar(Documento documento) {
        if (documento == null) throw new IllegalArgumentException();
        if (documento.getPrioridade().equals("URGENTE")) {
            int i = 0;
            while (i < fila.size() && fila.get(i).getPrioridade().equals("URGENTE")) {
                i++;
            }
            fila.add(i, documento);
        } else {
            fila.add(documento);
        }
    }

    public void cancelar(String nome){
        for(Documento documento : fila){
            if(documento.getNome().equals(nome) && documento.getStatus().equals("AGUARDANDO")){
                fila.remove(documento);
                return;
            }
        }
    }

    public void imprimirProximo() {
        if (fila.isEmpty()) return;

        Documento d = fila.get(0);
        d.iniciarImpressao();
        d.concluir();
        fila.remove(0);
    }

    public void exibirFila(){
        for(Documento documento : fila){
            documento.getNome();
            documento.getPrioridade();
            documento.getStatus();
        }
    }

    public int totalPaginasNaFila(){
        int totalPaginas = 0;

        for(Documento d : fila){
            totalPaginas += d.getNumeroPaginas();
        }

        return totalPaginas;
    }

}
