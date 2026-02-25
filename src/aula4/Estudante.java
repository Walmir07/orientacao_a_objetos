package aula4;

public class Estudante {
    String nome;
    int matricula;
    double[] notas;

    public Estudante(String nome, int matricula, double... notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double getMedia(){
        int soma = 0;
        for(double nota : this.notas){
            soma += nota;
        }
        double media = soma / this.notas.length;
        return media;
    }

    public void setNotas(double... notas){
        this.notas = notas;
    }

    public double getNota(int indice){
        if(indice < 0 || indice >= this.notas.length){
            return -1;
        } else {
            return notas[indice];
        }
    }

    public String getSituacao(){
        if(this.getMedia() >= 70){
            return "Aprovado!";
        } else if(this.getMedia() <= 70 && this.getMedia() >= 50){
            return "Final!";
        } else {
            return "Reprovado!";
        }
    }

}
