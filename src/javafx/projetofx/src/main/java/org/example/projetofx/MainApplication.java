package org.example.projetofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/example/projetofx/login-view.fxml")
        );

        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Login");
        stage.show();
    }
}

/*
* Criar tela de login com login controller
* O mais controler vai ser o listar produtos
* E deverá ter o adixionar produtos
* O Model vai ter usuário e produto
* E terá um repositório de usuário
* */

