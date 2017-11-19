package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Exercise10 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Ellipse ellipse = new Ellipse(150, 100, 100, 50);
        pane.getChildren().add(ellipse);
        ellipse.setStroke(Color.BLACK);
        ellipse.setFill(Color.WHITE);

        Arc strokedArc = new Arc(150, 300, 100, 50, 0, 180);
        strokedArc.setType(ArcType.OPEN);
        strokedArc.setStroke(Color.BLACK);
        strokedArc.setFill(Color.WHITE);
        strokedArc.getStrokeDashArray().addAll(6.0, 21.0);
        pane.getChildren().add(strokedArc);

        Arc arc = new Arc(150, 300, 100, 50, 180, 180);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.BLACK);
        arc.setFill(Color.WHITE);
        pane.getChildren().add(arc);

        for (int i = 0, x = 50; i < 2; x+= 200, i++) {
            Line line = new Line(x, 100, x, 300);
            pane.getChildren().add(line);
        }

        Scene scene = new Scene(pane, 300, 400);
        primaryStage.setTitle("Exercise14_10");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
