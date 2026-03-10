package aula5.br.edu.ifpb.suap.model;

import java.time.LocalDateTime;
import java.util.List;

public class Estudante {

    String nome;
    private String cpf;
    //LocalDateTime dataDeNascimento;
    //String matricula;
    //List<Disciplina> disciplinas;

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) throws Exception{
        if(cpf.length() != 11){
            throw new Exception("CPF deve ter 11 dígitos.");
        }
        this.cpf = cpf;
    }

    private void isValid(String cpf) throws Exception {
        if (cpf.length() != 11)
            throw new Exception("CPF deve ter 11 dígitos.");
    }

}