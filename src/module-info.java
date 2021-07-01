module SchoolSystem {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;
    requires sqlite.jdbc;
    requires AnimateFX;



    opens database.playground;



    opens main;
    opens controller;
}