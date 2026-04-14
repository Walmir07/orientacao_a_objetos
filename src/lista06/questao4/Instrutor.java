package lista06.questao4;

public class Instrutor implements Avaliavel {

    private String nome;
    private String especialidade;
    private double notaMedia;

    public Instrutor(String nome, String especialidade, double notaMedia){
        this.nome = nome;
        this.especialidade = especialidade;
        this.notaMedia = notaMedia;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String gerarResumoPublico() {
        return "Resumo público {" +
                "\n\tNome: " + getNome() +
                "\n\tEspecialidade: " + getEspecialidade() +
                "\n\tNota média: " + getNotaMedia() +
                "}";
    }
}
