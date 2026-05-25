package org.example.projetofx;

import java.util.Map;
import java.util.HashMap;
import java.util.Optional;


public class RepositorioUsuarios {

    // Padrão de projeto singleton --> Centralizar dados de instância.
    private static final RepositorioUsuarios INSTANCIA = new RepositorioUsuarios();

    private RepositorioUsuarios() {
        if (usuarios == null) {
            usuarios = new HashMap<>();
            criarUsuariosExemplo();
        }
    }

    public static RepositorioUsuarios getInstance() {
        return INSTANCIA;
    }

    private Map<String, Usuario> usuarios;

    private void criarUsuariosExemplo() {
        Usuario u1 = new Usuario("antonio", "123");
        u1.getProdutos().add(new Produto("Teclado", 45.99));
        u1.getProdutos().add(new Produto("Webcam", 145.99));
        usuarios.put("antonio", u1);

        Usuario u2 = new Usuario("joao", "234");
        u2.getProdutos().add(new Produto("Monitor", 2345.99));
        u2.getProdutos().add(new Produto("Mouse", 235.99));
        usuarios.put("joao", u2);
    }

    public Optional<Usuario> autenticar(String nome, String senha) {
        Usuario u = usuarios.get(nome);
        if (u != null && u.getSenha().equals(senha)) {
            return Optional.of(u);
        }

        return Optional.empty();
    }
}