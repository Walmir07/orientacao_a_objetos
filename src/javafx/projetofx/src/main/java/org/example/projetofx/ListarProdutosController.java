package org.example.projetofx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ListarProdutosController {

    @FXML
    protected TextField nomeTxt;
    @FXML
    protected Label nomeProduto;

    @FXML
    protected void definir() {
        nomeProduto.setText(nomeTxt.getText());
    }
}
