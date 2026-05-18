module org.example.projetofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projetofx to javafx.fxml;
    exports org.example.projetofx;
}