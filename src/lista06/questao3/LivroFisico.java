package lista06.questao3;

public class LivroFisico extends Produto {

    private int numeroPaginas;

    LivroFisico(String titulo, String autor, double preco, int numeroPaginas){
        super(titulo, autor, preco);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro físico {" +
                "\n\tTítulo: " + getTitulo() +
                "\n\tAutor: " + getAutor() +
                "\n\tPreço: " + getPreco() +
                "\n\tNúmero de páginas" + getNumeroPaginas() +
                "}";
    }
}
