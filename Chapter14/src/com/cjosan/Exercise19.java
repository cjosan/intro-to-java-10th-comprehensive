package com.cjosan;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise19 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        String[] values = {"-2\u03c0", "-\u03c0", "0", "\u03c0", "2\u03c0"};

        Polyline xAxis = new Polyline(0, 150, 400, 150, 380, 155, 400, 150, 380, 145);
        Text axisName = new Text(380, 130, "x");
        pane.getChildren().addAll(xAxis, axisName);

        Polyline yAxis = new Polyline(200, 300, 200, 0, 195, 20, 200, 0, 205, 20);
        axisName = new Text(220, 20, "y");
        pane.getChildren().addAll(yAxis, axisName);

        Polyline sinFunction = new Polyline();
        ObservableList<Double> list = sinFunction.getPoints();
        double scaleFactor = 50;
        for (int x = -170; x <= 170; x++) {
            list.add(x + 200.0);
            list.add(150 - scaleFactor * Math.sin((x / 100.0) * 2 * Math.PI));
        }
        sinFunction.setStroke(Color.RED);
        pane.getChildren().add(sinFunction);

        Polyline cosFunction = new Polyline();
        ObservableList<Double> list2 = cosFunction.getPoints();
        for (int x = -170; x <= 170; x++) {
            list2.add(x + 200.0);
            list2.add(150 - scaleFactor * Math.cos((x / 100.0) * 2 * Math.PI));
        }
        cosFunction.setStroke(Color.BLUE);
        pane.getChildren().add(cosFunction);

        for (int i = 0, x = 95; i < values.length; x+=50, i++) {
            Text value = new Text(x, 165, values[i]);
            pane.getChildren().add(value);
        }

        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Exercise14_19");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
