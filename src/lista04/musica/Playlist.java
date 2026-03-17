package lista04.musica;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    public String nome;
    public List<Musica> fila;

    public Playlist(String nome){
        if(nome == null || nome.isEmpty() || nome.isBlank()){
            throw new IllegalArgumentException();
        }

        this.nome = nome;
        this.fila = new ArrayList<>();

    }

    public void adicionar(Musica m) {

        if(m == null){
            throw new IllegalArgumentException();
        }

        if(m.getPrioridade().equals("URGENTE")){
            int i = 0;

            while(i < fila.size() && fila.get(i).getPrioridade().equals("URGENTE")){
                i++;
            }

            fila.add(i, m);
        } else {

            fila.add(m);

        }


    }

    public void remover(String titulo){
        if(fila.isEmpty()){

        } else {
            for(Musica musica : fila){
                if(musica.getTitulo().equals(titulo)){
                    fila.remove(musica);
                    return;
                }
            }
        }

    }

    public Musica proximaMusica(){
        if(fila.isEmpty()){
            return null;
        } else {
            return fila.get(0);
        }
    }

    public Musica reproduzirProxima(){
        if(fila.isEmpty()){
            return null;
        }

        return fila.remove(0);
    }

    public int tamanho(){
        return fila.size();
    }

    public void listar(){
        for(Musica musica : fila){
            System.out.println("Título: " + musica.getTitulo());
            System.out.println("Artista: " + musica.getArtista());
            System.out.println("Prioridade: " + musica.getPrioridade());
        }
    }

}
