package ex3.application;
	
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
			Pane root = FXMLLoader.load(getClass().getResource("/ex3/application/ex3.fxml"));
			
			// creates the scene from the graph (fits its content), add a title and adds it to the stage
			Scene scene = new Scene(root);
                        primaryStage.setTitle("Pie chart of the number of students in each major");
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
