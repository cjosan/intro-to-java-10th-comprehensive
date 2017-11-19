package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise06 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        boolean isFilled;
        for (int i = 0; i < 8; i++) {
            isFilled = (i % 2 != 0);
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle();
                rectangle.setHeight(20);
                rectangle.setWidth(20);

                if (isFilled) {
                    rectangle.setFill(Color.BLACK);
                } else {
                    rectangle.setFill(Color.WHITE);
                }

                isFilled = !isFilled;
                pane.add(rectangle, j, i);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_06");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
