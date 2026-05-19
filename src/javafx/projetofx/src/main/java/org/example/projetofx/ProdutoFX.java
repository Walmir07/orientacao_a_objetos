package org.example.projetofx;

import javafx.beans.InvalidationListener;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class ProdutoFX {

    StringProperty nome = new SimpleStringProperty("");
    DoubleProperty preco = new SimpleDoubleProperty(0.0);

    public StringProperty nomeProperty() {
        return nome;
    }

    public DoubleProperty precoProperty() {
        return preco;
    }

}
