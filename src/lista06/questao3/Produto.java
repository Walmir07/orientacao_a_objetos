package lista06.questao3;

public abstract class Produto {

    protected String titulo;
    protected String autor;
    protected double preco;

    public Produto(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public abstract String toString();

    public boolean equals(Produto obj){

        if(obj.getTitulo().equals(titulo) && obj.getAutor().equals(autor)){
            return true;
        }

        return false;
    }

}
