package reflectlist;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    public void login() throws Exception {

        // Validation: Empty name check
        if (usernameField.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Login Required");
            alert.setHeaderText(null);
            alert.setContentText("Please enter your name to continue.");

            alert.showAndWait();
            return;
        }

        // Save username
        UserSession.username = usernameField.getText().trim();

        // Open Dashboard
        Stage stage = (Stage) usernameField.getScene().getWindow();
        Scene scene = new Scene(
                FXMLLoader.load(getClass().getResource("dashboard.fxml")),
                stage.getWidth(),
                stage.getHeight()
        );

        stage.setScene(scene);
        stage.setMaximized(true);
    }
}
