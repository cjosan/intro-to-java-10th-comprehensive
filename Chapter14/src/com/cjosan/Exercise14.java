package com.cjosan;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise14 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

//      (50, 50, 100, 100);
        Rectangle face1 = new Rectangle();
        face1.xProperty().bind(pane.widthProperty().divide(4));
        face1.yProperty().bind(pane.heightProperty().divide(4));
        face1.widthProperty().bind(pane.widthProperty().divide(2));
        face1.heightProperty().bind(pane.heightProperty().divide(2));
        face1.setStroke(Color.BLACK);
        face1.setFill(Color.TRANSPARENT);
        pane.getChildren().add(face1);

//      (75, 25, 100, 100);
        Rectangle face2 = new Rectangle();
        face2.xProperty().bind(pane.widthProperty().divide(3));
        face2.yProperty().bind(pane.heightProperty().divide(7));
        face2.widthProperty().bind(pane.widthProperty().divide(2));
        face2.heightProperty().bind(pane.heightProperty().divide(2));
        face2.setStroke(Color.BLACK);
        face2.setFill(Color.TRANSPARENT);
        pane.getChildren().add(face2);

        Line line1 = new Line();
        line1.startXProperty().bind(face1.xProperty());
        line1.startYProperty().bind(face1.yProperty());
        line1.endXProperty().bind(face2.xProperty());
        line1.endYProperty().bind(face2.yProperty());
        pane.getChildren().add(line1);


        Line line2 = new Line();
        line2.startXProperty().bind(face1.xProperty().add(pane.widthProperty().divide(2)));
        line2.startYProperty().bind(face1.yProperty().add(pane.heightProperty().divide(2)));
        line2.endXProperty().bind(face2.xProperty().add(pane.widthProperty().divide(2)));
        line2.endYProperty().bind(face2.yProperty().add(pane.heightProperty().divide(2)));
        pane.getChildren().add(line2);

        Line line3 = new Line();
        line3.startXProperty().bind(face1.xProperty().add(pane.widthProperty().divide(2)));
        line3.startYProperty().bind(face1.yProperty());
        line3.endXProperty().bind(face2.xProperty().add(pane.widthProperty().divide(2)));
        line3.endYProperty().bind(face2.yProperty());
        pane.getChildren().add(line3);

        Line line4 = new Line();
        line4.startXProperty().bind(face1.xProperty());
        line4.startYProperty().bind(face1.yProperty().add(pane.heightProperty().divide(2)));
        line4.endXProperty().bind(face2.xProperty());
        line4.endYProperty().bind(face2.yProperty().add(pane.heightProperty().divide(2)));
        pane.getChildren().add(line4);


        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Exercise14_14");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
