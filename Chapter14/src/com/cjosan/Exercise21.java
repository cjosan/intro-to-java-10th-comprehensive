package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise21 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle1 = new Circle(Math.random() * (400 - 30), Math.random() * (400 - 30), 15);
        Circle circle2 = new Circle(Math.random() * (400 - 30), Math.random() * (400 - 30), 15);
        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        double distance = Math.sqrt(Math.pow(line.getEndX() - line.getStartX(), 2) + Math.pow(line.getEndY() - line.getStartY(), 2));

        Text distanceLabel = new Text((line.getStartX() + line.getEndX()) / 2, (line.getStartY() + line.getEndY()) / 2, distance + "");

        pane.getChildren().addAll(circle1, circle2, line, distanceLabel);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_21");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
