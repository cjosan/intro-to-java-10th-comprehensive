package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise15 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();

        Polygon octagon = new Polygon(70, 20, 130, 20, 170, 60, 170, 120, 130, 160, 70, 160, 30, 120, 30, 60);
        octagon.setFill(Color.RED);
        pane.getChildren().add(octagon);

        Text stop = new Text("STOP");
        stop.setFont(Font.font("Times New Roman", FontWeight.BOLD, 40));
        stop.setFill(Color.WHITE);
        pane.getChildren().add(stop);


        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Exercise14_15");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
