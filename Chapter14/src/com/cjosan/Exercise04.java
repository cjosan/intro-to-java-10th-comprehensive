package com.cjosan;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Exercise04 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox pane = new HBox(5);
        pane.setAlignment(Pos.CENTER);

        for (int i = 0; i < 5; i++) {
            Label label = new Label("Java");
            label.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            label.setRotate(90);
            Color color = getColor();
            label.setTextFill(color);
            pane.getChildren().add(label);
        }

        Scene scene = new Scene(pane, 300, 150);
        primaryStage.setTitle("Exercise14_04");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public Color getColor() {
        double red = Math.random();
        double green = Math.random();
        double blue = Math.random();
        double opacity = Math.random();

        return Color.color(red, green, blue, opacity);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
