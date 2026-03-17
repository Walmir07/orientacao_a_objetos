package lista04.musica;

public class Musica {

    public String titulo;
    public String artista;
    public int duracaoSegundos;
    public String prioridade;

    public Musica(String titulo, String artista, int duracaoSegundos, String prioridade){

        if(titulo == null || titulo.isBlank()){
            throw new IllegalArgumentException();
        }

        if(artista == null || artista.isBlank()){
            throw new IllegalArgumentException();
        }

        if(duracaoSegundos <= 0){
            throw new IllegalArgumentException();
        }

        if(!prioridade.equals("NORMAL") && !prioridade.equals("URGENTE")){
            throw new IllegalArgumentException();
        }

        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        this.prioridade = prioridade;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista(){
        return artista;
    }

    public String getPrioridade(){
        return prioridade;
    }

    public void setPrioridade(String prioridade){

        if(prioridade == null || prioridade.isBlank() || prioridade.isEmpty()){
            throw new IllegalArgumentException();
        }

        if(!prioridade.equals("NORMAL") && !prioridade.equals("URGENTE")){
            throw new IllegalArgumentException();
        }

        this.prioridade = prioridade;

    }

}
