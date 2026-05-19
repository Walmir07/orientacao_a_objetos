package org.example.projetofx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    protected TextField txtNomeUsuario;

    @FXML
    protected PasswordField txtSenhaUsuario;

    @FXML
    protected Button botaoEntrar;

    @FXML
    protected Button botaoSair;

    @FXML
    protected void autenticar() {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/example/projetofx/listar-produtos.fxml")
        );

        Stage stage = (Stage) txtNomeUsuario.getScene().getWindow();

        try {
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Login");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
