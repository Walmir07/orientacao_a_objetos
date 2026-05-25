package org.example.projetofx;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ListarProdutosController {
    @FXML
    protected TableView<ProdutoFX> produtosTable;
    @FXML
    protected TableColumn<ProdutoFX, String> colunaNome;
    @FXML
    protected TableColumn<ProdutoFX, Number> colunaPreco;

    public void setProdutos(ObservableList<ProdutoFX> produtos) {
        produtosTable.setItems(produtos);
    }

    @FXML
    protected void initialize() {
        colunaNome.setCellValueFactory(
                cell -> cell.getValue().nomeProperty()
        );
        colunaPreco.setCellValueFactory(
                cell -> cell.getValue().precoProperty()
        );


    }
}
