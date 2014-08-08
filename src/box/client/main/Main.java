package box.client.main;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		URL url = getClass().getResource("/box/client/views/Login.fxml");
		Parent root = FXMLLoader.load(url);

		Scene scene = new Scene(root, 640, 360);
		
		//stage.setTitle("FXML Welcome");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
