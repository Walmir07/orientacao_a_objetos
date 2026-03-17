package lista04.laboratorio;

public class ItemLaboratorio {

    public String codigo;
    public String nome;
    public int quantidadeDisponivel;
    public int quantidadeMinima;
    public String status;

    public ItemLaboratorio(String codigo, String nome, int quantidadeDisponivel, int quantidadeMinima){

        if(codigo == null || codigo.isEmpty() || codigo.isBlank()){
            throw new IllegalArgumentException();
        }
        if(nome == null || nome.isEmpty() || nome.isBlank()){
            throw new IllegalArgumentException();
        }
        if(quantidadeDisponivel < 0){
            throw new IllegalArgumentException();
        }
        if(quantidadeMinima <= 0){
            throw new IllegalArgumentException();
        }

        this.codigo = codigo;
        this.nome = nome;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.quantidadeMinima = quantidadeMinima;
        atualizarStatus();

    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidadeDisponivel(){
        return quantidadeDisponivel;
    }

    public int getQuantidadeMinima(){
        return quantidadeMinima;
    }

    public String getStatus(){
        return status;
    }

    public void entrada(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException();
        }

        quantidadeDisponivel += quantidade;
        atualizarStatus();
    }

    public void saida(int quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException();
        }

        if(quantidade > quantidadeDisponivel){
            return;
        }

        quantidadeDisponivel -= quantidade;
        atualizarStatus();
    }

    public void atualizarStatus(){
        if(quantidadeDisponivel == 0){
            status = "ESGOTADO";
        } else if (quantidadeDisponivel > 0 && quantidadeDisponivel <= quantidadeMinima){
            status = "ALERTA";
        } else {
            status = "NORMAL";
        }
    }

}
