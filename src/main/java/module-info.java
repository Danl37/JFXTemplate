module org.danl {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.danl to javafx.fxml;
    exports org.danl;
}