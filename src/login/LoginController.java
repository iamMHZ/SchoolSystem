package login;

import animatefx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LoginController {
    @FXML
    private AnchorPane loginPane;

    @FXML
    private TextField loginUsername;

    @FXML
    private PasswordField loginPassword;

    @FXML
    private Button loginBtn;

    @FXML
    private Button changeToSignInBtn;

    @FXML
    private AnchorPane signInPane;

    @FXML
    private TextField name;

    @FXML
    private TextField nationalId;

    @FXML
    private PasswordField signInPassword1;

    @FXML
    private PasswordField signInPassword2;

    @FXML
    private TextField signInUsername;

    @FXML
    private TextField schoolName;

    @FXML
    private TextField courseName;

    @FXML
    private Button signInBtn;


    @FXML
    void backClicked(MouseEvent event) {

    }

    @FXML
    void OnMouseEntered(MouseEvent event) {
        if (event.getSource() == changeToSignInBtn) {
            new RubberBand(changeToSignInBtn).play();

        }

    }

    @FXML
    void onLoginBtnClicked(MouseEvent event) {


    }

    @FXML
    void onSignInBtnsClicked(MouseEvent event) {

        if (event.getSource() == changeToSignInBtn) {
            signInPane.toFront();
            new FadeIn(signInPane).play();
        }


    }


}
