module org.example.javademo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javademo to javafx.fxml;
    exports org.example.javademo;
}