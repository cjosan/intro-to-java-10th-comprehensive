package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise05 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        String[] str = "WELCOME TO JAVA".split("");
        Font font = Font.font("Times Roman", FontWeight.BOLD, 22);

        double radius = 100;
        double angle = 0;
        double rotate = 90;

        for (int i = 0; i < str.length; i++, angle += 22, rotate += 22) {
            double x = 200 + radius * Math.cos(Math.toRadians(angle));
            double y = 200 + radius * Math.sin(Math.toRadians(angle));
            Text text = new Text(x, y, str[i]);
            text.setFont(font);
            text.setRotate(rotate);
            pane.getChildren().add(text);
        }

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_05");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
