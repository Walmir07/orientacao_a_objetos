package lista04.podcast;

public class Episodio {

    public String titulo;
    public int numero;
    public int duracaoMinutos;
    public String status;

    public Episodio(String titulo, int numero, int duracaoMinutos){
        if(titulo == null || titulo.isEmpty() || titulo.isBlank() || numero <= 0|| duracaoMinutos <= 0){
            throw new IllegalArgumentException();
        } else {
            this.titulo = titulo;
            this.numero = numero;
            this.duracaoMinutos = duracaoMinutos;
            this.status = "RASCUNHO";
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public int getNumero() {
        return numero;
    }

    public int getDuracaoMinutos(){
        return duracaoMinutos;
    }

    public String getStatus(){
        return status;
    }

    public void setDuracaoMinutos(int minutos){
        if(minutos <= 0){
            throw new IllegalArgumentException();
        } else {
            this.duracaoMinutos = minutos;
        }
    }

    public void publicar(){
        if(status.equals("RASCUNHO")){
            status = "PUBLICADO";
        }
    }

    public void arquivar(){
        if(status.equals("PUBLICADO")){
            status = "ARQUIVADO";
        }
    }

    public void restaurar(){
        if(status.equals("ARQUIVADO")){
            status = "RASCUNHO";
        }
    }

}







