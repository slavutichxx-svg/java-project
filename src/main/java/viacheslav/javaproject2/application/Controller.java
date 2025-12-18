package viacheslav.javaproject2.application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {
    @FXML
    private Label helloWorld;

    @FXML
    protected void onButtonClick() {
        helloWorld.setText("Hello World!");
    }
}
