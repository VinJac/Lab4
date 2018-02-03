package ex2.application;

import javafx.application.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
 * New GUI class | it is now an JavaFX Application
 */
public class GUI extends Application {

	// start method | automatically called when the application is launched
	@Override
	public void start(Stage primaryStage) {
		try {
			// creates the scene graph from the view FXML file
			Pane root = FXMLLoader.load(getClass().getResource("/ex2/view.fxml"));
			
			// creates the scene from the graph (fits its content), and adds it to the stage
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			
			// shows the stage
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// The main method only launches the application
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}