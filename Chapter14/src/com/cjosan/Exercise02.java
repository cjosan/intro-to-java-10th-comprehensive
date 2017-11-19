package com.cjosan;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise02 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        pane.setAlignment(Pos.CENTER);

        Image[] images = new Image[2];
        images[0] = new Image("com/cjosan/image/x.gif");
        images[1] = new Image("com/cjosan/image/o.gif");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int index = (int) (Math.random() * 3);
                if (index == 0 || index == 1)
                    pane.add(new ImageView(images[index]), j, i);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_02");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
