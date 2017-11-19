package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Exercise29 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        int radius = 20;

        for (int i = 1, x = 24 * radius, y = 140; i <= 13; x -= (3 * radius), y += (3 * radius), i += 2) {
            for (int j = 0, centerX = x; j < i; centerX += (3 * radius), j++) {
                Circle circle = new Circle(centerX, y, radius);
                pane.getChildren().add(circle);

                if (j % 2 != 0) {
                    circle.setFill(Color.WHITE);
                }

                if (i == 13 && j % 2 == 0) {
                    Line line = new Line(circle.getCenterX(), circle.getCenterY(), circle.getCenterX(), circle.getCenterY() + 7 * radius);
                    pane.getChildren().add(line);
                }
            }
        }

        Polyline shape = new Polyline(22 * radius, 20,
                22 * radius, 100,
                radius, 26 * radius,
                radius, 32 * radius,
                47 * radius, 32 * radius,
                47 * radius, 26 * radius,
                26 * radius, 100,
                26 * radius, 20);
        pane.getChildren().add(shape);

        Scene scene = new Scene(pane, 960, 800);
        primaryStage.setTitle("Exercise14_29");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
