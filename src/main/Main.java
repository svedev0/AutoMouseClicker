package main;

import java.awt.event.InputEvent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch();
	}

	int windowWidth = 600;
	int windowHeight = 800;

	@SuppressWarnings("all")
	public void start(Stage window) throws Exception {

		// Create containers ================================================

		VBox root = new VBox();

		// Create scenes ====================================================

		Scene mainScene = new Scene(root, windowWidth, windowHeight);

		// Create content for scenes =======================================

		Label clicksLabel = new Label("Enter number of clicks:");
		TextField clicksText = new TextField();

		Label delayLabel = new Label("Enter delay between clicks:");
		TextField delayText = new TextField();

		Button startButton = new Button();

		// Styling ==========================================================

		startButton.setText("Start");

		// Button action ====================================================

		Clicker clicker = new Clicker();

		startButton.setOnMouseClicked(e -> {

			int clicks = Integer.parseInt(clicksText.getText());
			int delay = Integer.parseInt(delayText.getText());

			root.getChildren().removeAll();

			for (int i = 0; i < clicks; i++) {
				Clicker.delay = Integer.parseInt(delayText.getText());
				clicker.clickMouse(InputEvent.BUTTON1_MASK);
			}
		});

		root.getChildren().addAll(clicksLabel, clicksText, delayLabel, delayText, startButton);

		// Window parameters ===============================================

		window.getIcons().add(new Image("/icons/icon.png"));
		window.setTitle("Auto Mouse Clicker");
		window.setScene(mainScene);
		window.show();
	}
}
