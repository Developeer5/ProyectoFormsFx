module org.example.proyectoformsfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectoformsfx to javafx.fxml;
    exports org.example.proyectoformsfx;
}