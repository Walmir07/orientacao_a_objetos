package lista06.questao4;

public class Curso implements Avaliavel, Compravel{

    private String titulo;
    private String nomeInstrutor;
    private double notaMedia;
    private double preco;

    public Curso(String titulo, String nomeInstrutor, double notaMedia, double preco){
        this.titulo = titulo;
        this.nomeInstrutor = nomeInstrutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico(){
        return "Resumo público {" +
                "\n\tTítulo: " + getTitulo() +
                "\n\tAutor: " + getNomeInstrutor() +
                "\n\tNota média: " + getNotaMedia() +
                "\n\tPreço: " + getPreco() +
                "}";
    };

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String gerarRecebido(String nomeComprador) {
        return "Recibo {" +
                "\n\tComprador: " + nomeComprador +
                "\n\tTítulo: " + getTitulo() +
                "\n\tPreço: " + getPreco() +
                "}";
    }

}
