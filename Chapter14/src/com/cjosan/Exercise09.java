package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Exercise09 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane mainPane = new GridPane();

        int x = 100, y = 100;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int angle = 30; // start angle for arcs
                Pane pane = new Pane(); // pane for circle and arcs

                // create and add circle
                Circle circle = new Circle(x, y, 90);
                circle.setStroke(Color.BLACK);
                circle.setFill(Color.WHITE);
                pane.getChildren().add(circle);

                // Create 4 arcs with different angles and add them to pane
                for (int k = 0; k < 4; angle += 90, k++) {
                    Arc arc = new Arc(x, y, 80, 80, angle, 30);
                    arc.setFill(Color.BLACK);
                    arc.setType(ArcType.ROUND);
                    pane.getChildren().add(arc);
                }

                // add pane with circle and arcs to grid
                mainPane.add(pane, j ,i);

                // increment x for next column
                x += 30;
            }

            // reset x for next row
            x = 100;

            // increment y for next row
            y += 30;
        }

        Scene scene = new Scene(mainPane, 425, 425);
        primaryStage.setTitle("Exercise14_09");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
