package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Exercise23 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scanner input = new Scanner(System.in);
        Pane pane = new Pane();
        Rectangle[] rectangles = new Rectangle[2];
        Color[] colors = {Color.RED, Color.BLUE};

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the center x, y, width and height of " + (i + 1) + " rectangle");
            double x = input.nextDouble();
            double y = input.nextDouble();
            double width = input.nextDouble();
            double height = input.nextDouble();

            Rectangle rectangle = new Rectangle(x - (width / 2.0), y - (height / 2.0), width, height);
            rectangle.setStroke(colors[i]);
            rectangle.setFill(Color.TRANSPARENT);
            rectangles[i] = rectangle;
            pane.getChildren().add(rectangles[i]);
        }

        addMessage(rectangles, pane);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Exercise14_23");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    public boolean contains(Rectangle rect1, Rectangle rect2) {
        double rect1CenterX = rect1.getX() + (rect1.getWidth() / 2.0);
        double rect1CenterY = rect1.getY() + (rect1.getHeight() / 2.0);
        double rect2CenterX = rect2.getX() + (rect2.getWidth() / 2.0);
        double rect2CenterY = rect2.getY() + (rect2.getHeight() / 2.0);
        return ((rect1CenterX >= rect2CenterX) && (rect1CenterY >= rect2CenterY)
                && ((rect1CenterX + rect2.getWidth()) <= (rect2CenterX + rect1.getWidth()))
                && ((rect1CenterY + rect2.getHeight()) <= (rect1CenterY + rect1.getHeight())));
    }

    public boolean overlaps(Rectangle rect1, Rectangle rect2) {
        double rect1CenterX = rect1.getX() + (rect1.getWidth() / 2.0);
        double rect1CenterY = rect1.getY() + (rect1.getHeight() / 2.0);
        double rect2CenterX = rect2.getX() + (rect2.getWidth() / 2.0);
        double rect2CenterY = rect2.getY() + (rect2.getHeight() / 2.0);
        return rect1CenterX < rect2CenterX + rect2.getWidth() && rect1CenterX + rect1.getWidth() > rect2CenterX &&
                rect1CenterY < rect2CenterY + rect2.getHeight() && rect1CenterY + rect1.getHeight() > rect2CenterY;
    }

    public void addMessage(Rectangle[] rectangles, Pane pane) {
        String message;
        if (contains(rectangles[0], rectangles[1]) || contains(rectangles[1], rectangles[0])) {
            message = "One rectangle is contained in another";
        } else if (overlaps(rectangles[0], rectangles[1])) {
            message = "The rectangles overlap";
        } else {
            message = "The rectangles do not overlap";
        }

        Text text = new Text(100, 370, message);
        pane.getChildren().add(text);
    }
}
