package org.example.projetofx;

import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ProdutoFX {
    private StringProperty nome = new SimpleStringProperty("");
    private DoubleProperty preco = new SimpleDoubleProperty(0.0);

    public ProdutoFX(Produto produto) {
        nome.setValue(produto.getNome());
        preco.setValue(produto.getPreco());
    }

    public StringProperty nomeProperty() {
        return nome;
    }

    public DoubleProperty precoProperty() {
        return preco;
    }

    public String getNome() {
        return nome.get();
    }

    public double getPreco() {
        return preco.get();
    }
}
