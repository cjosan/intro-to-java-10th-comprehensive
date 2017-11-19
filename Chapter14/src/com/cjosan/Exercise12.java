package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise12 extends Application {
    public final static int WIN_WIDTH = 450;
    public final static int WIN_HEIGHT = 200;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        String[] names = {"Project", "Quiz", "Midterm", "Final"};
        int[] heights = {20, 10, 30, 40};
        Color[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE};

        for (int i = 0, x = 10; i < 4; x+= 110, i++) {
            Rectangle rectangle = new Rectangle(100, heights[i] * (WIN_HEIGHT / 100));
            double y = WIN_HEIGHT - rectangle.getHeight();
            rectangle.setX(x);
            rectangle.setY(y);
            rectangle.setFill(colors[i]);

            Text name = new Text(names[i] + " -- " + heights[i] + "%");
            name.setX(x);
            name.setY(y - 10);

            pane.getChildren().addAll(rectangle, name);
        }

        Scene scene = new Scene(pane, WIN_WIDTH, WIN_HEIGHT);
        primaryStage.setTitle("Exercise14_11");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
