package lista06.questao4;

public class TrilhaDeAprendizado implements Avaliavel {

    private String nome;
    private int numeroCursos;
    private double notaMedia;

    public TrilhaDeAprendizado(String nome, int numeroCursos, double notaMedia){
        this.nome = nome;
        this.numeroCursos = numeroCursos;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroCursos() {
        return numeroCursos;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Resumo público {" +
                "\n\tNome: " + getNome() +
                "\n\tNumero de cursos: " + getNumeroCursos() +
                "\n\tNota média: " + getNotaMedia() +
                "}";
    }
}
