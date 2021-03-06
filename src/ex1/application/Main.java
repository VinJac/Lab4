package ex1.application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/*
 * Main class, which is a JavaFX Application
 */
public class Main extends Application {
	
	// start method | automatically called when the application is launched
	@Override
	public void start(Stage primaryStage) {
		try {
			// creates the scene graph from the fxml file
			Pane root = FXMLLoader.load(getClass().getResource("/ex1/ex1.fxml"));
			
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
