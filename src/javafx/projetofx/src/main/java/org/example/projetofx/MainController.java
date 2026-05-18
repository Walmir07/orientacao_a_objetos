package org.example.projetofx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    protected Button testeBtn;

    @FXML
    protected void testar() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensagem");
        alert.setHeaderText("O usuário executou uma ação.");
        alert.setContentText("O botão foi clicado.");

        alert.showAndWait();
    }

    @FXML
    protected void abrirListarProdutos() {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/example/projetofx/listar-produtos.fxml")
        );

        Stage stage = (Stage) testeBtn.getScene().getWindow();

        try {
            Scene scene = new Scene(loader.load());

            stage.setScene(scene);
            stage.setTitle("Listar produtos");
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setContentText(e.getMessage());

            alert.showAndWait();
        }
    }
}