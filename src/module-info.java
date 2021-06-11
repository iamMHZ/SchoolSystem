module SchoolSystem {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires sqlite.jdbc;


    opens testJavaFX;
    opens database.playground;
}