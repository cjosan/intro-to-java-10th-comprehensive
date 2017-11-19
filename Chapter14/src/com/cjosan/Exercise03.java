package com.cjosan;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise03 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox pane = new HBox(5);
        pane.setAlignment(Pos.CENTER);

        ArrayList<Integer> cards = initList();

        ImageView card1 = new ImageView("com/cjosan/image/card/" + cards.get(0) + ".png");
        ImageView card2 = new ImageView("com/cjosan/image/card/" + cards.get(1) + ".png");
        ImageView card3 = new ImageView("com/cjosan/image/card/" + cards.get(2) + ".png");

        pane.getChildren().addAll(card1, card2, card3);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_03");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private ArrayList initList() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 52; i++) {
            list.add(i);
        }

        Collections.shuffle(list);
        return list;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
