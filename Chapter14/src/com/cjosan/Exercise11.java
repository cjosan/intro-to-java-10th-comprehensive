package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Exercise11 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle face = new Circle(200, 200, 150);
        face.setStroke(Color.BLACK);
        face.setFill(Color.YELLOW);
        pane.getChildren().add(face);

        for (int i = 0, x = 140; i < 2; x += 120, i++) {
            Ellipse eye = new Ellipse(x, 150, 40, 30);
            eye.setStroke(Color.BLACK);
            eye.setFill(Color.WHITE);

            Circle iris = new Circle(x, 150, 20);
            iris.setFill(Color.BLUE.darker());
            pane.getChildren().addAll(eye, iris);
        }

        Polygon nose = new Polygon(200, 170, 160, 250, 240, 250);
        nose.setStroke(Color.BLACK);
        nose.setFill(Color.YELLOW.darker());
        pane.getChildren().add(nose);

        Arc mouth = new Arc(200, 280, 60, 20, 0, -180);
        mouth.setType(ArcType.OPEN);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.YELLOW);
        pane.getChildren().add(mouth);



        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
