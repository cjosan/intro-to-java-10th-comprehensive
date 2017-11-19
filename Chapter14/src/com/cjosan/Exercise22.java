package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Exercise22 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle1 = new Circle(Math.random() * (400 - 30), Math.random() * (400 - 30), 15);
        Circle circle2 = new Circle(Math.random() * (400 - 30), Math.random() * (400 - 30), 15);
        Line line = new Line(circle1.getCenterX(), circle1.getCenterY(), circle2.getCenterX(), circle2.getCenterY());
        line.setStroke(Color.RED);

        // get intersection points of line with first Circle
        ArrayList<Double> intersection = getIntersection(line.getStartX(), line.getStartY(),
                line.getEndX(), line.getEndY(), circle1.getCenterX(), circle1.getCenterY(), circle1.getRadius());
        line.setStartX(intersection.get(0));
        line.setStartY(intersection.get(1));

        // get intersection points of line with second Circle
        intersection = getIntersection(line.getStartX(), line.getStartY(),
                line.getEndX(), line.getEndY(), circle2.getCenterX(), circle2.getCenterY(), circle2.getRadius());
        line.setEndX(intersection.get(2));
        line.setEndY(intersection.get(3));

        pane.getChildren().addAll(circle1, circle2, line);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_22");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public ArrayList<Double> getIntersection(double startX, double startY, double endX, double endY, double circleX, double circleY, double radius) {
        ArrayList<Double> intersection = new ArrayList<>();
        double baX = endX - startX;
        double baY = endY - startY;
        double caX = circleX - startX;
        double caY = circleY - startY;

        double a = baX * baX + baY * baY;
        double bBy2 = baX * caX + baY * caY;
        double c = caX * caX + caY * caY - radius * radius;

        double pBy2 = bBy2 / a;
        double q = c / a;

        double disc = pBy2 * pBy2 - q;
        if (disc < 0)
            return null;

        double tmpSqrt = Math.sqrt(disc);
        double abScalingFactor1 = -pBy2 + tmpSqrt;
        double abScalingFactor2 = -pBy2 - tmpSqrt;

        double intersectionX1 = startX - baX * abScalingFactor2;
        double intersectionY1 = startY - baY * abScalingFactor2;

        intersection.add(intersectionX1);
        intersection.add(intersectionY1);

        if (disc == 0)
            return intersection;

        double intersectionX2 = startX - baX * abScalingFactor1;
        double intersectionY2 = startY - baY * abScalingFactor1;
        intersection.add(intersectionX2);
        intersection.add(intersectionY2);

        return intersection;
    }
}
