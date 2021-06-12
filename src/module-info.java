module SchoolSystem {

    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    requires AnimateFX;

    opens testJavaFX;
    opens login;
}