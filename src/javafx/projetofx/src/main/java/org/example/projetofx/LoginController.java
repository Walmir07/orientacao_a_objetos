package org.example.projetofx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class LoginController {

    @FXML
    protected Label alertaLogin;

    @FXML
    protected TextField txtNomeUsuario;

    @FXML
    protected PasswordField txtSenhaUsuario;

    @FXML
    protected Button botaoEntrar;

    @FXML
    protected Button botaoSair;

    @FXML
    protected void initialize() {
        alertaLogin.setTextFill(Color.RED);
    }

    @FXML
    protected void autenticar() {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/example/projetofx/listar-produtos.fxml")
        );

        Stage stage = (Stage) txtNomeUsuario.getScene().getWindow();

        try {

            Optional<Usuario> usuario = RepositorioUsuarios.getInstance()
                    .autenticar(txtNomeUsuario.getText().trim(), txtSenhaUsuario.getText().trim());

            if(usuario.isPresent()){
                stage.setScene(new Scene(loader.load()));
                stage.setTitle("Produtos");
            } else {
                alertaLogin.setVisible(true);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
