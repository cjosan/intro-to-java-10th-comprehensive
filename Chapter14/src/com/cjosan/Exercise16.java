package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise16 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        for (int i = 0, numerator = 1; i < 2; numerator++, i++) {
            Line verticalLine = new Line();
            verticalLine.startXProperty().bind(pane.widthProperty().multiply(numerator / 3.0));
            verticalLine.setStartY(0);
            verticalLine.endXProperty().bind(pane.widthProperty().multiply(numerator / 3.0));
            verticalLine.endYProperty().bind(pane.heightProperty());
            verticalLine.setStroke(Color.RED);
            verticalLine.setStrokeWidth(2);

            Line horizontalLine = new Line();
            horizontalLine.setStartX(0);
            horizontalLine.startYProperty().bind(pane.heightProperty().multiply(numerator / 3.0));
            horizontalLine.endXProperty().bind(pane.widthProperty());
            horizontalLine.endYProperty().bind(pane.heightProperty().multiply(numerator / 3.0));
            horizontalLine.setStroke(Color.BLUE);
            horizontalLine.setStrokeWidth(2);

            pane.getChildren().addAll(verticalLine, horizontalLine);
        }

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_16");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
