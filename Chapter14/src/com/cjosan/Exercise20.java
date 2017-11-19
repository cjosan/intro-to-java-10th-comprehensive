package com.cjosan;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Exercise20 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        drawArrowLine(Math.random() * 400, Math.random() * 400, Math.random() * 400, Math.random() * 400, pane);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_20");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {
        Polyline arrow = new Polyline(startX, startY, endX, endY);
        ObservableList<Double> list = arrow.getPoints();
        double arctan = Math.atan((startY - endY) / (startX - endX));
        double angle = (startX > endX) ? 1.57 / 2 : -1.57 * 1.5;

        list.addAll(endX, endY, (endX + Math.cos(arctan - angle) * 20), (endY + Math.sin(arctan - angle) * 20));
        list.addAll(endX, endY, (endX + Math.cos(arctan + angle) * 20), (endY + Math.sin(arctan + angle) * 20));

        pane.getChildren().add(arrow);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
