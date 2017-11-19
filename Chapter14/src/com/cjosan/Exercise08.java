package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise08 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        for (int i = 0, count = 1; i < 6; i++) {
            for (int j = 0; j < 9; count++, j++) {
                ImageView img = new ImageView("com/cjosan/image/card/" + count + ".png");
                pane.add(img, j, i);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_08");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
