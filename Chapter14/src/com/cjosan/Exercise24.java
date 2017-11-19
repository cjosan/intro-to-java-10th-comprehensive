package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Exercise24 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner input = new Scanner(System.in);
        Pane pane = new Pane();

        System.out.println("Enter 5 points");
        Polygon polygon = new Polygon();
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);
        for (int i = 0; i < 4; i++) {
            double x = input.nextDouble();
            double y = input.nextDouble();
            polygon.getPoints().addAll(x, y);
        }

        double x = input.nextDouble();
        double y = input.nextDouble();

        Circle point = new Circle(x, y, 5);
        pane.getChildren().addAll(polygon, point);
        addMessage(x, y, polygon, pane);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_24");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void addMessage(double x, double y, Polygon polygon, Pane pane) {
        String msg;
        if (polygon.contains(x, y)) {
            msg = "The point is inside the polygon";
        } else {
            msg = "The point is not inside the polygon";
        }

        Text text = new Text(100, 370, msg);
        pane.getChildren().add(text);
    }
}
