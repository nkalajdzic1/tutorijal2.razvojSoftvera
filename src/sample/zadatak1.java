package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class zadatak1 {
    public Label text;

    public void promijeni(ActionEvent actionEvent) {
        text.setText("Hello World!");
    }
}
