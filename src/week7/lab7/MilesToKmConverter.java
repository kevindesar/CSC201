package week7.lab7;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * CSC 201-E81N
 * Problem 16.4 (page 669)
 * MilesToKmConverter.java
 * <p>
 * This program converts miles and kilometers in both directions.  If you enter a value in the Mile text field and press
 * the Enter key, the corresponding kilometer measurement is displayed in the Kilometer text field and vice versa.
 * This is accomplished by having two TextFields and two Labels organized in a GridPane.  Each TextField is a source
 * object for a KeyEvent which is fired each time a key is pressed on the keyboard within that TextField.  Only on an
 * Enter keypress does the event actually calculate anything.  In both events, an if statement checks if the last key
 * pressed is the Enter key and if it is, it gathers the information from its source TextField, parses it as a double,
 * and multiplies it by the appropriate conversion factor.  It then sets the opposite TextField's text to the result
 * that was calculated.
 */
public class MilesToKmConverter extends Application {

    private TextField tfMiles = new TextField();
    private TextField tfKilometers = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();


        // Add labels
        gridPane.add(new Label("Miles"), 0, 0);
        gridPane.add(new Label("Kilometers"), 0, 1);

        // Add text fields
        gridPane.add(tfMiles, 1, 0);
        gridPane.add(tfKilometers, 1, 1);

        // Set properties for UI
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setAlignment(Pos.CENTER);
        tfMiles.setAlignment(Pos.BOTTOM_RIGHT);
        tfKilometers.setAlignment(Pos.BOTTOM_RIGHT);

        // Process events
        tfMiles.setOnKeyPressed(this::convertToKilometers);
        tfKilometers.setOnKeyPressed(this::convertToMiles);

        // Create a scene and place it on the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Miles/Kilometers Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Converts the value inputted to the Kilometers TextField to miles and displays the result in the Miles TextField.
     * This event is triggered on each key press but only the ENTER key is caught and processed.
     *
     * @param event the keyboard key being pressed
     */
    private void convertToMiles(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            double input = Double.parseDouble(tfKilometers.getText());
            double MILES_CONVERSTION_FACTOR = 0.62137119;
            tfMiles.setText(String.valueOf(input * MILES_CONVERSTION_FACTOR));
        }
    }

    /**
     * Converts the value inputted to the Miles TextField to kilometers and displays the result in the Kilometers
     * TextField. This event is triggered on each key press but only the ENTER key is caught and processed.
     *
     * @param event the keyboard key being pressed.
     */
    private void convertToKilometers(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            double input = Double.parseDouble(tfMiles.getText());
            double KILOMETERS_CONVERSION_FACTOR = 1.609344;
            tfKilometers.setText(String.valueOf(input * KILOMETERS_CONVERSION_FACTOR));
        }
    }
}
