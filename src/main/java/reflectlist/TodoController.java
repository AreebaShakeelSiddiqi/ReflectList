package reflectlist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoController {

    @FXML
    private ListView<CheckBox> taskList;

    @FXML
    private TextField taskField;

    @FXML
    private Label motivationLabel;

    @FXML
    public void initialize() {
        loadTasks();
    }

    @FXML
    public void addTask() {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO tasks(task_name, is_done) VALUES (?, false)"
            );
            ps.setString(1, taskField.getText());
            ps.execute();
            taskField.clear();
            loadTasks();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void back(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/reflectlist/dashboard.fxml")
            );
            Stage stage = (Stage) ((Node) event.getSource())
                    .getScene()
                    .getWindow();
            stage.setScene(new Scene(loader.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteTask(CheckBox cb) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "DELETE FROM tasks WHERE task_name=?"
            );
            ps.setString(1, cb.getText());
            ps.execute();
            loadTasks();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadTasks() {
        taskList.getItems().clear();
        try {
            Connection con = DBConnection.getConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tasks");
            while (rs.next()) {
                CheckBox cb = new CheckBox(rs.getString("task_name"));
                cb.setSelected(rs.getBoolean("is_done"));
                cb.setOnAction(e -> updateCheckbox(cb));
                taskList.getItems().add(cb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void updateCheckbox(CheckBox cb) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE tasks SET is_done=? WHERE task_name=?"
            );
            ps.setBoolean(1, cb.isSelected());
            ps.setString(2, cb.getText());
            ps.execute();
            motivationLabel.setText("Great job! Keep going 🌟");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
