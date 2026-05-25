package org.example.projetofx;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String senha;
    private List<Produto> produtos;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}
