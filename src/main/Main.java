package main;

import java.awt.event.InputEvent;
import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("---- Auto Mouse Clicker ----");
		
		System.out.println("Number of clicks: (0 = infinate)");
		
		if (scr.nextInt() == 0) {
			int clicks = 1000000 * 1000000;
			
			System.out.println();
			System.out.println("Enter delay between clicks in miliseconds: ");
			int delay = scr.nextInt();
			
			System.out.println();
			System.out.println("Program will start in 3 seconds!");
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Clicker clicker = new Clicker();
			clicker.setDelay(delay);
			
			for (int i = 0; i < clicks; i++) {
				clicker.clickMouse(InputEvent.BUTTON1_MASK);
			}
			
			System.out.println("Clicking complete!");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.exit(0);
			
		} else {
			int clicks = scr.nextInt();
			
			System.out.println();
			System.out.println("Enter delay between clicks in miliseconds: ");
			int delay = scr.nextInt();
			
			System.out.println();
			System.out.println("Program will start in 3 seconds!");
			
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			Clicker clicker = new Clicker();
			clicker.setDelay(delay);
			
			for (int i = 0; i < clicks; i++) {
				clicker.clickMouse(InputEvent.BUTTON1_MASK);
			}
			
			System.out.println("Clicking complete!");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.exit(0);
		}
	}
}

/*
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

public class Main extends Application {
	
	public static void main(String[] args) throws Exception {
		launch(args);
	}

	public static int windowWidth = 260;
	public static int windowHeight = 160;

	public void start(Stage window) {
		
	// Input: amounts of clicks ---------------------------
		Label clicksLabel = new Label("Number of clicks: ");
		TextField clicksText = new TextField();	
		
	// Input: delay between clicks ------------------------
		Label delayLabel = new Label("Delay between clicks: ");
		TextField delayText = new TextField();
		
	// Start button that starts the clicking --------------
		Button start = new Button("Start");
		start.setStyle("-fx-left: 50px");
		start.setOnAction(new EventHandler<ActionEvent>() {
            
			public void handle(ActionEvent e) {
				
				private void getClickstText(evt) {
					
			        int clicks = Integer.parseInt(clicksText.getText());
			        int delay = Integer.parseInt(delayText.getText());
			        
			        Clicker clicker = new Clicker();
					clicker.setDelay(delay);
					
					for (int i = 0; i < clicks; i++) {
						Clicker.clickMouse(InputEvent.BUTTON1_MASK);
					}
				}
            }
		);
		
	// Main HBox container	
		VBox root = new VBox();
		root.setStyle("-fx-padding: 15px;");
		
		root.getChildren().add(clicksLabel);
		root.getChildren().add(clicksText);
		root.getChildren().add(delayLabel);
		root.getChildren().add(delayText);
		root.getChildren().add(start);
		
		Scene mainScene = new Scene(root, windowWidth, windowHeight);
        
		window.setTitle("Auto Mouse Clicker");
		window.setResizable(false);
        window.setScene(mainScene);
        window.show();
    }
}
*/
