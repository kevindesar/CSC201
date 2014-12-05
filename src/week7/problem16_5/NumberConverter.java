package week7.problem16_5;


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
 * CSC 201-E81N Problem 16.5 (page 669) NumberConverter.java
 * <p>
 * This class converts numbers between decimal, hexadecimal, and binary values using the JavaFX API. Enter a valid
 * number into any of the three text fields and press Enter to convert the number into the remaining two formats.  If an
 * invalid input is entered, the program will be reset, and the text field where the error occured will be highlighted
 * in red.
 */
public class NumberConverter extends Application {

    private TextField tfDecimal = new TextField();
    private TextField tfHex = new TextField();
    private TextField tfBinary = new TextField();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        // Add labels
        gridPane.add(new Label("Decimal"), 0, 0);
        gridPane.add(new Label("Hex"), 0, 1);
        gridPane.add(new Label("Binary"), 0, 2);

        // Add text fields
        gridPane.add(tfDecimal, 1, 0);
        gridPane.add(tfHex, 1, 1);
        gridPane.add(tfBinary, 1, 2);

        // Set properties for UI
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setAlignment(Pos.CENTER);
        tfDecimal.setAlignment(Pos.BOTTOM_RIGHT);
        tfHex.setAlignment(Pos.BOTTOM_RIGHT);
        tfBinary.setAlignment(Pos.BOTTOM_RIGHT);

        // Process events
        tfDecimal.setOnKeyPressed(e -> convert(e, 10));
        tfHex.setOnKeyPressed(e -> convert(e, 16));
        tfBinary.setOnKeyPressed(e -> convert(e, 2));

        // Create a scene and place it on the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Number Converter");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * Converts the number entered into the other two radices.
     *
     * @param event The KeyEvent triggering the method to fire.
     * @param radix The radix of the value entered.
     */
    private void convert(KeyEvent event, int radix) {
        if (event.getCode() == KeyCode.ENTER) {
            tfDecimal.setStyle("-fx-text-inner-color: black;");
            tfHex.setStyle("-fx-text-inner-color: black;");
            tfBinary.setStyle("-fx-text-inner-color: black;");
            int decimal = 0;
            switch (radix) {
                case 10:
                    try {
                        decimal = Integer.parseInt(tfDecimal.getText(), 10);
                    } catch (NumberFormatException e) {
                        tfDecimal.setStyle("-fx-text-inner-color: red;");
                    }
                    break;
                case 16:
                    try {
                        decimal = Integer.parseInt(tfHex.getText(), 16);
                    } catch (NumberFormatException e) {
                        tfHex.setStyle("-fx-text-inner-color: red;");
                    }
                    break;
                case 2:
                    try {
                        decimal = Integer.parseInt(tfBinary.getText(), 2);
                    } catch (NumberFormatException e) {
                        tfBinary.setStyle("-fx-text-inner-color: red;");
                    }
                    break;
            }

            tfDecimal.setText(Integer.toString(decimal));
            tfHex.setText(Integer.toHexString(decimal));
            tfBinary.setText(Integer.toBinaryString(decimal));

        }
    }
}
