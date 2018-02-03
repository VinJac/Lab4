package ex2.application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/* Controller class
 * handle event propagated by the view by modifying the model
 */
// Partly generated with JavaFX Scene Builder

public class Controller {

	// new model, the user list, as an observable list of strings
	// [EX2]: we use an observable list of strings to implement the user list
	private final ObservableList<String> model = FXCollections.observableArrayList(); 
	
    @FXML
    private TextField textField;

    @FXML
    private Button addButton;

    // the observer of the model
    @FXML
    private ListView<String> userList;

    // initialize method => will be called when the FXML loader instantiates the Controller
    public void initialize() {
    	userList.setItems(model);			// this view will listen to this model
    }
    
    // we either clicked on the button or pressed ENTER focusing the text field
    @FXML
    void addUser(ActionEvent event) {
    	// adds the specify user to the model, which will notify the view
    	model.add(textField.getText());
    	// empties the text field
    	textField.setText("");
    }
}

