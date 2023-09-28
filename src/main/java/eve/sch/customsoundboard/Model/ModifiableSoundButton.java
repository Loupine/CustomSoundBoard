package eve.sch.customsoundboard.Model;

import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class ModifiableSoundButton extends Button {

    private AudioClip audioClip;
    private final FileChooser fileChooser = new FileChooser();


    public ModifiableSoundButton(File mainDirectory) {
        assignButtonEvents();
        formatButton();
        // Set the main folder and limit selection file types
        fileChooser.setInitialDirectory(mainDirectory);
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(
                "Audio Files", "*.wav", "*.mp3", "*.mp4", "*.ogg"));
    }

    // Second constructor for if a main directory was not selected
    public ModifiableSoundButton() {
        assignButtonEvents();
        formatButton();

        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(
                "Audio Files", "*.wav", "*.mp3", "*.mp4", "*.ogg"));
    }


    private void assignButtonEvents() {
        setOnAction(event -> toggleAudioPlaying());
        setOnMousePressed(event -> {
            // When button is right-clicked
            if (event.isSecondaryButtonDown()) {
                selectNewSound();
            }
        });
    }


    private void formatButton() {
        setFont(new Font(12));
        setMaxSize(50,50);
        setMinSize(50,50);
    }


    private void toggleAudioPlaying() {
        if(audioClip.isPlaying()) {
            audioClip.stop();
        }else {
            audioClip.play();
        }
    }


    private void selectNewSound() {
        // Opens a file selection menu in a new stage window
        File newlySelectedSound = fileChooser.showOpenDialog(new Stage());
        if(newlySelectedSound != null) {
            setText(newlySelectedSound.getName());
            audioClip = new AudioClip(newlySelectedSound.toURI().toString());
        }
    }
}
