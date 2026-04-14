package lista06.questao3;

public class Ebook extends Produto {

    private String formatoArquivo;

    public Ebook(String titulo, String autor, double preco, String formatoArquivo){
        super(titulo, autor, preco);
        this.formatoArquivo = formatoArquivo;
    }

    public String getFormatoArquivo(){
        return formatoArquivo;
    }


    @Override
    public String toString() {
        return "Ebook {" +
                "\n\tTítulo: " + getTitulo() +
                "\n\tAutor: " + getAutor() +
                "\n\tPreço: " + getPreco() +
                "\n\tFormato do arquivo: " + getFormatoArquivo() +
                "}";
    }
}
