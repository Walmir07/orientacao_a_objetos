package lista04.receita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Receita {

    public String nome;
    public int tempoPreparo;
    public int rendimentoPorcoes;
    public List<String> ingredientes;

    public Receita(String nome, int tempoPreparo, int rendimentoPorcoes){

        if(nome == null || nome.isEmpty() || nome.isBlank() || tempoPreparo <= 0 || rendimentoPorcoes <= 0) {
            throw new IllegalArgumentException();
        } else {
            this.nome = nome;
            this.tempoPreparo = tempoPreparo;
            this.rendimentoPorcoes = rendimentoPorcoes;
            this.ingredientes = new ArrayList<>();
        }

    }

    public String getNome() {
        return nome;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo){
        if(tempoPreparo <= 0){
            throw new IllegalArgumentException("O tempo de preparo não pode ser menor ou igual a 0.");
        } else {
            this.tempoPreparo = tempoPreparo;
        }
    }

    public int getRendimentoPorcoes(){
        return rendimentoPorcoes;
    }

    public void setRendimentoPorcoes(int rendimentoPorcoes){
        if(rendimentoPorcoes <= 0){
            throw new IllegalArgumentException("O rendimento das porções não pode ser menor ou igual a 0.");
        } else {
            this.rendimentoPorcoes = rendimentoPorcoes;
        }
    }

    public List<String> getIngredientes(){
        return new ArrayList<>(ingredientes);
    }

    public void adicionarIngrediente(String ingrediente){

        if(ingrediente != null && !ingrediente.isEmpty() && !ingrediente.isBlank()){
            this.ingredientes.add(ingrediente);
        }

    }

    public void removerIngrediente(String ingrediente){

        if(ingredientes.contains(ingrediente)){
            ingredientes.remove(ingrediente);
        }

    }

}















