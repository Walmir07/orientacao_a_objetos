package org.example.projetofx;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;


public class RepositorioUsuarios {

    // Padrão de projeto singleton --> Centralizar dados de instância.

    private static final RepositorioUsuarios INSTANCIA = new RepositorioUsuarios();

    private RepositorioUsuarios() {
        if(usuarios == null) {
            usuarios = new HashMap<>();
            criarUsuariosExemplo();
        }
    }

    public static RepositorioUsuarios getInstance() {
        return INSTANCIA;
    }

    private Map<String, Usuario> usuarios;

    private void criarUsuariosExemplo() {
        usuarios.put("antonio", new Usuario("antonio", "123"));
        usuarios.put("joao", new Usuario("joao", "456"));
    }

    public Optional<Usuario> autenticar(String nome, String senha){

        Usuario u1 = new Usuario("antonio", "123");
        u1.getProdutos().add(new Produto("Teclado", 100.0));

        Usuario u = usuarios.get(nome);

        if(u != null && u.getSenha().equals(senha)){
            return Optional.of(u);
        }

        return Optional.empty();

    }

}
