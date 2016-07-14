package com.gmail.rollerxander;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        primaryStage.setTitle("Rolllershop.by");

       // TableView
        Scene scene = new Scene(pane, 250, 250);

        Button button = new Button();
        button.setText("Button");

        Button button1 = new Button();
        button1.setText("Button1");

        pane.getChildren().add(button);
        pane.getChildren().add(button1);


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
