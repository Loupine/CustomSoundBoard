package eve.sch.customsoundboard.Model;

import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class ModifiableButton extends Button {

    private AudioClip audioClip;
    private final FileChooser fileChooser = new FileChooser();


    public ModifiableButton() {
        setOnAction(event -> toggleAudioPlaying());
        setOnMousePressed(event -> {
            // When button is right-clicked
            if (event.isSecondaryButtonDown()) {
                selectNewSound();
            }
        });

        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(
                "Audio Files", "*.wav", "*.mp3", "*.mp4", "*.ogg"));
    }


    private void toggleAudioPlaying() {
        if(audioClip.isPlaying()) {
            audioClip.stop();
        }else {
            audioClip.play();
        }
    }


    private void selectNewSound() {
        File newlySelectedSound = fileChooser.showOpenDialog(new Stage());
        if(newlySelectedSound != null) {
            setText(newlySelectedSound.getName());
            audioClip = new AudioClip(newlySelectedSound.toURI().toString());
        }
    }
}
