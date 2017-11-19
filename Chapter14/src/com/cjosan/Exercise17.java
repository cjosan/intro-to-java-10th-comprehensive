package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Exercise17 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Arc base = new Arc(80, 380, 70, 30, 0, 180);
        base.setType(ArcType.OPEN);
        base.setStroke(Color.BLACK);
        base.setFill(Color.WHITE);

        Polyline hanger = new Polyline(80, 350, 80, 30, 230, 30, 230, 60);

        Circle head = new Circle(230, 90, 30);
        head.setStroke(Color.BLACK);
        head.setFill(Color.WHITE);

        Line rightHand = new Line(208, 110, 150, 170);
        Line leftHand = new Line(252, 110, 308, 170);

        Line body = new Line(230, 120, 230, 240);

        Line rightLeg = new Line(230, 240, 170, 300);
        Line leftLeg = new Line(230, 240, 290, 300);


        pane.getChildren().addAll(base, hanger, head, rightHand, leftHand, body, rightLeg, leftLeg);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_17");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
