package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise13 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        String[] names = {"Project", "Quiz", "Midterm", "Final"};
        int[] percentages = {20, 10, 30, 40};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        for (int i = 0, angle = 0; i < 4; i++) {
            double length = percentages[i] * 360 / 100;
            Arc arc = new Arc(100, 100, 90, 90, angle, length);
            arc.setType(ArcType.ROUND);
            arc.setFill(colors[i]);
            pane.getChildren().add(arc);

            angle += length;
        }

        Text label = new Text(names[0] + " -- " + percentages[0] + "%");
        label.setX(110);
        label.setY(90);

        Text label1 = new Text(names[1] + " -- " + percentages[1] + "%");
        label1.setX(100);
        label1.setY(10);

        Text label2 = new Text(names[2] + " -- " + percentages[2] + "%");
        label2.setX(0);
        label2.setY(90);

        Text label3 = new Text(names[3] + " -- " + percentages[3] + "%");
        label3.setX(110);
        label3.setY(150);

        pane.getChildren().addAll(label, label1, label2, label3);

        Scene scene = new Scene(pane, 220, 200);
        primaryStage.setTitle("Exercise14_13");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
