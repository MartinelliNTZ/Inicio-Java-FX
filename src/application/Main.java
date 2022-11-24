package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage palco) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("ArquivoFMX.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("arquivo.css").toExternalForm());
			palco.setScene(scene);			
			//palco.setMaximized(true);			
			palco.show();	
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
