package ex1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/*
 * Controller class - handles events
 * [Also partly generated via JavaFX Scene Builder]
 */
public class Controller {

    @FXML
    private Button button;

    @FXML
    private TextArea textArea;

    /*
     * EX1 - A button control triggers an ActionEvent when it is clicked on
     * => We therefore have to handle an ActionEvent here
     */
    @FXML
    void printAreaText(ActionEvent event) {
    	// prints the TextArea's content in the console
    	System.out.println(textArea.getText());
    }

}

