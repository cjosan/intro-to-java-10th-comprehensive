package com.cjosan;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Exercise28 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a clock and a label
        int hour = (int) (Math.random() * 12);
        int minute = (int) Math.round(Math.random()) * 30;
        ModifiedClockPane clock = new ModifiedClockPane(hour, minute, 0);
        clock.setSecondHandVisible(false);

        String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        // Place clock and label in border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Exercise14_28");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
