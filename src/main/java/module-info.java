module reflectlist {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens reflectlist to javafx.fxml;
    exports reflectlist;
}