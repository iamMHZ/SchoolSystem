package login;

import animatefx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private AnchorPane signInPane;

    @FXML
    private Button signInBtn;

    @FXML
    private AnchorPane loginPane;

    @FXML
    private Button loginBtn;

    @FXML
    private Button changeToSignInBtn;

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
