package pl.lublin.wsei.java.cwiczenia;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {
    public Button btnMain;
    public TextField txtLicznik;
    int clickCounter;
    public void onBtnAction() {
        System.out.println("Kliknięcie nr " + ++clickCounter);
        txtLicznik.setText(String.valueOf(clickCounter));
            if (clickCounter == 1)
                btnMain.setText("I jeszcze raz!");
    }
}