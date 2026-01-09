package reflectlist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class DashboardController {

    @FXML
    private Label greetingLabel;

    @FXML
    public void initialize() {
        greetingLabel.setText("ASSALAM-O-ALAIKUM " + UserSession.username);
    }

    public void openMood(ActionEvent e) throws Exception {
        Button btn = (Button) e.getSource();
        MoodController.selectedMood = btn.getText();

        Stage stage = (Stage) btn.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mood.fxml"));
        Scene scene = new Scene(loader.load(), stage.getWidth(), stage.getHeight());
        stage.setScene(scene);
        stage.setMaximized(true);
    }

    public void openTodo(ActionEvent e) throws Exception {
        Stage stage = (Stage) ((Button)e.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("todo.fxml"));
        Scene scene = new Scene(loader.load(), stage.getWidth(), stage.getHeight());
        stage.setScene(scene);
        stage.setMaximized(true);
    }
}
