package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Exercise01 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        pane.setHgap(5);
        pane.setVgap(5);

        Image img1 = new Image("com/cjosan/image/uk.gif");
        Image img2 = new Image("com/cjosan/image/ca.gif");
        Image img3 = new Image("com/cjosan/image/china.gif");
        Image img4 = new Image("com/cjosan/image/us.gif");

        pane.add(new ImageView(img1), 0, 0);
        pane.add(new ImageView(img2), 1, 0);
        pane.add(new ImageView(img3), 0, 1);
        pane.add(new ImageView(img4), 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_01");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
