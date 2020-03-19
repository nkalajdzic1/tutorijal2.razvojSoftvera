package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class zadatak3 {
    public TextField textField;
    public TextArea textArea;
    public Label label;

    public void ispisi(MouseEvent mouseEvent) {
        String s = textField.getText();
        textArea.clear();
        String najduza = "";
        for( String rijec: s.split("[^a-zA-Z]")){ // regex da se prilikom nailaska na bilo sta sto nije slovo, podijeli string
             if( rijec.length() > najduza.length() )
                 najduza = rijec;
        }
        for( String rijec: s.split("[^a-zA-Z]") ){
            if( rijec.length() == najduza.length() )  // ovako pretvaramo sve one rijeci kod kojih je duzina rijeci jednaka maksimalnoj
                textArea.appendText(rijec.toUpperCase() + " ");
            else textArea.appendText(rijec + " ");
        }
    }
}
