package reflectlist;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    public void login() throws Exception {
        UserSession.username = usernameField.getText();

        Stage stage = (Stage) usernameField.getScene().getWindow();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("dashboard.fxml")));
        stage.setScene(scene);
    }
}
