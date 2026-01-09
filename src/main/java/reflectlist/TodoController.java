package reflectlist;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
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
        setupListView();
        loadTasks();
    }

    @FXML
    public void deleteSelectedTask() {
        CheckBox selected = taskList.getSelectionModel().getSelectedItem();
        if (selected != null) deleteTask(selected);
    }

    private void setupListView() {
        taskList.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(CheckBox item, boolean empty) {
                super.updateItem(item, empty);
                setGraphic(empty || item == null ? null : item);
            }
        });
    }

    private void loadTasks() {
        taskList.getItems().clear();
        try {
            Connection con = DBConnection.getConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM tasks");

            while (rs.next()) {
                String taskName = rs.getString("task_name");
                boolean done = rs.getInt("is_done") == 1;

                CheckBox cb = new CheckBox(taskName);
                cb.setSelected(done);
                cb.setOnAction(e -> updateCheckbox(cb));

                taskList.getItems().add(cb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void addTask() {
        if (taskField.getText().trim().isEmpty()) return;

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO tasks (task_name, is_done) VALUES (?, 0)"
            );
            ps.setString(1, taskField.getText().trim());
            ps.execute();
            taskField.clear();
            loadTasks();
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
            ps.setInt(1, cb.isSelected() ? 1 : 0);
            ps.setString(2, cb.getText());
            ps.execute();
            motivationLabel.setText("Great job! Keep going 🌟");
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

    @FXML
    public void back(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load(), stage.getWidth(), stage.getHeight());
            stage.setScene(scene);
            stage.setMaximized(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
