package week6.problem14_11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

/**
 * CSC 201-E81N
 * Problem 14.11 (page 580)
 * SmileyFace.java
 */
public class SmileyFace extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        // Create a pane to hold the smiley face
        Pane pane = new Pane();

        // Create a head and set its properties
        Circle head = new Circle();
        head.setCenterY(200);
        head.setCenterX(200);
        head.setRadius(200);
        head.setStroke(Color.BLACK);
        head.setFill(Color.WHITE);
        pane.getChildren().add(head);

        // Create the eyes (ellipses)
        Ellipse eye1 = new Ellipse(120, 120, 50, 40);
        Ellipse eye2 = new Ellipse(280, 120, 50, 40);
        eye1.setStroke(Color.BLACK);
        eye2.setStroke(Color.BLACK);
        eye1.setFill(Color.WHITE);
        eye2.setFill(Color.WHITE);
        pane.getChildren().add(eye1);
        pane.getChildren().add(eye2);

        // Create the pupils
        Circle pupil1 = new Circle(120, 120, 30);
        Circle pupil2 = new Circle(280, 120, 30);
        pupil1.setStroke(Color.BLACK);
        pupil2.setStroke(Color.BLACK);
        pupil1.setFill(Color.BLACK);
        pupil2.setFill(Color.BLACK);
        pane.getChildren().add(pupil1);
        pane.getChildren().add(pupil2);

        // Create the mouth (arc)
        Arc mouth = new Arc(200, 300, 120, 60, 180, 180);
        mouth.setType(ArcType.OPEN);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.WHITE);
        pane.getChildren().add(mouth);

        // Create the nose (triangle)
        Polygon nose = new Polygon();
        nose.getPoints().setAll(
                200d, 160d,
                125d, 250d,
                275d, 250d
        );
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);
        pane.getChildren().add(nose);


        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Smile!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
