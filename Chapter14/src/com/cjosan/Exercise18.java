package com.cjosan;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise18 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Polyline xAxis = new Polyline(0, 300, 400, 300, 380, 305, 400, 300, 380, 295);
        Text axisName = new Text(380, 280, "x");
        pane.getChildren().addAll(xAxis, axisName);

        Polyline yAxis = new Polyline(200, 400, 200, 0, 195, 20, 200, 0, 205, 20);
        axisName = new Text(220, 20, "y");
        pane.getChildren().addAll(yAxis, axisName);

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = 0.0125;
        for (int x = -100; x <= 100; x++) {
            list.add(x + 200.0);
            list.add(-(scaleFactor * x * x) + 300);
        }

        pane.getChildren().add(polyline);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_18");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
