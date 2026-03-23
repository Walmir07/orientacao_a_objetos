package lista04.impressao;

public class Documento {

    public String nome;
    public int numeroPaginas;
    public String prioridade;
    public String status;

    public Documento(String nome, int numeroPaginas, String prioridade){

        if(nome == null || nome.isBlank() || numeroPaginas <= 0){
            throw new IllegalArgumentException();
        }

        if(prioridade == null || !prioridade.equals("NORMAL") && !prioridade.equals("URGENTE")){
            throw new IllegalArgumentException();
        }

        this.nome = nome;
        this.numeroPaginas = numeroPaginas;
        this.prioridade = prioridade;
        this.status = "AGUARDANDO";
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public String getStatus() {
        return status;
    }

    public void iniciarImpressao(){
        if(status.equals("AGUARDANDO")){
            this.status = "IMPRIMINDO";
        }
    }

    public void concluir(){
        if(status.equals("IMPRIMINDO")){
            this.status = "CONCLUIDO";
        }
    }

}
