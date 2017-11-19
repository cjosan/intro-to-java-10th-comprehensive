package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class Exercise25 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle circle = new Circle(200, 200, 100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Polygon polygon = new Polygon();
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);

        for (int i = 0; i < 5; i++) {
            int angle = (int) (Math.random() * 361);
            double x = circle.getCenterX() + circle.getRadius() * Math.cos(Math.toRadians(angle));
            double y = circle.getCenterY() + circle.getRadius() * Math.sin(Math.toRadians(angle));

            polygon.getPoints().addAll(x, y);
        }

        pane.getChildren().addAll(circle, polygon);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_25");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
