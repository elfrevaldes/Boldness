import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
//import sun.launcher.resources.launcher;

public class Gui extends Application{

	public static void main(String args[]){
		launch(args);
		System.out.print("CAca");
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Glori");
		// adding icon
		primaryStage.getIcons().add(new Image("/ico.jpg"));
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.TOP_LEFT);
		grid.setGridLinesVisible(true);
		// Setting Horizontal and vertical gap
		grid.setHgap(30);
		grid.setVgap(20);
		
		grid.setPadding(new  Insets(25));
		
		Text searchLable = new Text("Enter Runnable:");
		searchLable.setFont(Font.font("Giorgia", FontWeight.BOLD, 20));
		
		// 
		// adding the search
		grid.add(searchLable, 0, 0);
		
		// adding a textbox
		Text searchBox = new 
		grid.add(searchBox, 0, 1);
		
		// creating scene with size
		Scene scene = new Scene(grid, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}
