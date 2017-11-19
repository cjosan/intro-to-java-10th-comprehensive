package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Exercise07 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int num = (int)(Math.random() * 2);

                TextField text = new TextField();
                text.setPrefColumnCount(1);
                text.setText(num + "");
                pane.add(text, j, i);
            }
        }

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_07");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
