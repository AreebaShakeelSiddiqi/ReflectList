package reflectlist;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MoodController {

    public static String selectedMood;  // Mood selected from dashboard

    @FXML
    private Label moodLabel;

    @FXML
    private Label ayatLabel;

    @FXML
    private Label duaLabel;

    @FXML
    public void initialize() {
        if (selectedMood == null) selectedMood = "Unknown";
        moodLabel.setText(selectedMood + " Mood");

        String ayat;
        String dua;

        switch (selectedMood) {
            case "Happy":
                ayat = MoodData.getRandom(MoodData.happyAyat);
                dua = MoodData.getRandom(MoodData.happyDua);
                break;
            case "Sad":
                ayat = MoodData.getRandom(MoodData.sadAyat);
                dua = MoodData.getRandom(MoodData.sadDua);
                break;
            case "Anxious":
                ayat = MoodData.getRandom(MoodData.anxiousAyat);
                dua = MoodData.getRandom(MoodData.anxiousDua);
                break;
            case "Stressed":
                ayat = MoodData.getRandom(MoodData.stressedAyat);
                dua = MoodData.getRandom(MoodData.stressedDua);
                break;
            case "Excited":
                ayat = MoodData.getRandom(MoodData.excitedAyat);
                dua = MoodData.getRandom(MoodData.excitedDua);
                break;
            case "Angry":
                ayat = MoodData.getRandom(MoodData.angryAyat);
                dua = MoodData.getRandom(MoodData.angryDua);
                break;
            case "Lonely":
                ayat = MoodData.getRandom(MoodData.lonelyAyat);
                dua = MoodData.getRandom(MoodData.lonelyDua);
                break;
            case "Depressed":
                ayat = MoodData.getRandom(MoodData.depressedAyat);
                dua = MoodData.getRandom(MoodData.depressedDua);
                break;
            case "Grateful":
                ayat = MoodData.getRandom(MoodData.gratefulAyat);
                dua = MoodData.getRandom(MoodData.gratefulDua);
                break;
            case "Frustrated":
                ayat = MoodData.getRandom(MoodData.frustratedAyat);
                dua = MoodData.getRandom(MoodData.frustratedDua);
                break;
            default:
                ayat = "No Ayat available";
                dua = "No Dua available";
        }

        ayatLabel.setText(ayat);
        duaLabel.setText(dua);
    }

    @FXML
    public void back() throws Exception {
        Stage stage = (Stage) moodLabel.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dashboard.fxml"));
        Scene scene = new Scene(loader.load(), stage.getWidth(), stage.getHeight());
        stage.setScene(scene);
        stage.setMaximized(true);
    }

    @FXML
    public void todo() throws Exception {
        Stage stage = (Stage) moodLabel.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("todo.fxml"));
        Scene scene = new Scene(loader.load(), stage.getWidth(), stage.getHeight());
        stage.setScene(scene);
        stage.setMaximized(true);
    }
}
