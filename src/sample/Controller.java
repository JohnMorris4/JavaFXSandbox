package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private Button buttonTwo;
    @FXML
    private GridPane gridPane;

    public void initialize() {
        buttonTwo.setEffect(new DropShadow());

    }
    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
        label.setTranslateX(5.1);
        label.setTranslateY(4.1);
    }
    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
        label.setTranslateX(1.0);
        label.setTranslateY(1.0);
    }
    @FXML
    public void handleClick() {
//        DirectoryChooser dirChooser = new DirectoryChooser();
//        dirChooser.showDialog(gridPane.getScene().getWindow());
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("text", "*.txt"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png")
        );
        File file = chooser.showOpenDialog(gridPane.getScene().getWindow());
        if(file != null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("operation cancelled");
        }
    }
}
