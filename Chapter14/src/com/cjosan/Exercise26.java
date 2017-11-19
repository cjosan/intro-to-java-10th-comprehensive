package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise26 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox pane = new HBox();

        ModifiedClockPane clock = new ModifiedClockPane(4, 20, 45);
        ModifiedClockPane clock2 = new ModifiedClockPane(22, 46, 15);

        pane.getChildren().addAll(clock, clock2);

        Scene scene = new Scene(pane, 500, 250);
        primaryStage.setTitle("Exercise14_26");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
