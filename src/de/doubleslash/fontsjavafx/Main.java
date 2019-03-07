package de.doubleslash.fontsjavafx;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static final Logger LOG = Logger.getLogger(Main.class.getName());

	Label title;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("HuHu");
		
		// Load font
		if (Font.loadFont(Main.class.getResource("GoboldLight.ttf").toExternalForm(), 12) == null) {
			LOG.log(Level.WARNING, "Couldn't load GoboldLight.ttf");
		}
		
		// initiate Nodes
		title = new Label("KeepTime\n12:04:23");
		title.getStyleClass().add("title");
		
		button = new Button("Test");
		button.getStyleClass().add("button");
		
		// set layout
		StackPane layout = new StackPane();
		layout.getChildren().addAll(button, title);
		StackPane.setAlignment(title, Pos.TOP_CENTER);
		
		// set scene
		Scene scene = new Scene(layout, 300, 250);
		scene.getStylesheets().add(getClass().getResource("custom-font-styles.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}





















