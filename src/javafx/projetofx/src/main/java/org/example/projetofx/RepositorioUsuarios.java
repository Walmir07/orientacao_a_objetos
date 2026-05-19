package org.example.projetofx;

import java.util.Map;
import java.util.HashMap;


public class RepositorioUsuarios {

    Map<String, Usuario> usuarios = new HashMap<>();

    public void criarUsuariosExemplo() {
        usuarios.put("antonio", new Usuario("antonio", "123"));
        usuarios.put("joao", new Usuario("joao", "456"));
    }

}
