package org.example.projetofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/org/example/projetofx/main-view.fxml")
        );

        stage.setScene(new Scene(loader.load()));
        stage.setTitle("Produtos");
        stage.show();
    }
}
