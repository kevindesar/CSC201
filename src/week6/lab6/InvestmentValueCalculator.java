package week6.lab6;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * CSC 201-E81N
 * Problem 15.5 (page 621)
 * InvestmentValueCalculator.java
 * <p>
 * This program calculates the investment-value using input from the keyboard into a GUI built with JavaFX. It begins
 * by setting up the GUI using a GridPane that has labels in the left column and text fields on the right as well as a
 * "Calculate" button on the bottom-right. Some extra parameters are set which affect the appearance of the GUI window
 * before an event trigger is registered with the button.  When the button is pressed, the data that was input into the
 * text fields are converted to numerical values and are used in the calculation for investment future value:
 * futureValue = investmentAmount * (1 + monthlyInterestRate)^(years * 12)
 * When the calculation is complete, the result is formatted to appear as money and made to appear in the final text
 * field.
 */
public class InvestmentValueCalculator extends Application {

    private TextField tfInvestmentAmount = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfFutureValue = new TextField();
    private Button btCalculate = new Button("Calculate");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the UI elements
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        // Add labels to left-side column
        gridPane.add(new Label("Investment Amount:"), 0, 0);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 2);
        gridPane.add(new Label("Future value:"), 0, 3);

        // Add text fields and button to right-side column
        gridPane.add(tfInvestmentAmount, 1, 0);
        gridPane.add(tfNumberOfYears, 1, 1);
        gridPane.add(tfAnnualInterestRate, 1, 2);
        gridPane.add(tfFutureValue, 1, 3);
        gridPane.add(btCalculate, 1, 4);

        // Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
        tfFutureValue.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        // Process events
        btCalculate.setOnAction(e -> calculateInvestmentValue());

        // Create a scene and place it in the stage
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Investment-Value Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void calculateInvestmentValue() {
        // Get values from text fields
        double investmentAmount = Double.parseDouble(tfInvestmentAmount.getText());
        int numberOfYears = Integer.parseInt(tfNumberOfYears.getText());
        double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());

        double futureValue = investmentAmount * Math.pow((1 + (annualInterestRate / 1200)), (numberOfYears * 12));

        // Display future value amount
        tfFutureValue.setText(String.format("$%.2f", futureValue));
    }
}
