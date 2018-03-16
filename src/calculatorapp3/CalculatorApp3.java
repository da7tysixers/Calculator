/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp3;

import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Emmanuel
 */
public class CalculatorApp3 extends Application {
    
    Calculator calculator = new Calculator();
    private TextField textField = new TextField();
    private String operand;
    
    private final String clear = "AC";
    
    @Override
    public void start(Stage primaryStage) {
        
        List<String> buttons = Arrays.asList("AC", "+/-", "%", "x", "7", "8", "9", "/", "4", "5", "6", "-", "1", "2", "3" , "+" , "0" , "." , "=");
        
        
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(30,20,30,20));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setMinWidth(400);
        pane.setPrefWidth(400);
        pane.setMaxWidth(400);
        
        textField.setEditable(false);
       textField.setAlignment(Pos.CENTER);
       textField.setMinSize(336,40);
       pane.getChildren().add(textField);
       
       for (String button : buttons) { // for .. each
           Button b = new Button(button);
           
           b.setMinSize(80, 50);
           if (button.equals("0")) {
               b.setMinSize(165, 50);
           }
           
           pane.getChildren().add(b);
           b.setOnAction((e) -> handleButtonClick(b.getText()));
       }
       
        Scene scene = new Scene(pane);
        
        primaryStage.setTitle("CalculatorApp 3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private void handleButtonClick(String text) {
        if (text.equalsIgnoreCase("AC"))
        {
            textField.clear();
            
            return;
        }
        
        if (text.equalsIgnoreCase("-") || text.equalsIgnoreCase("+") || text.equalsIgnoreCase("/") || text.equalsIgnoreCase("x") ) {
            operand = text;
        }        

        if (text.equalsIgnoreCase("="))
        {
            String[] splitValues = textField.getText().split(operand);

            int firstValue = Integer.parseInt(splitValues[0]);
            int secondValue = Integer.parseInt(splitValues[1]);

            int answer = 0;
            if (operand.equalsIgnoreCase("-")) {
                answer = calculator.subtract(firstValue, secondValue);
            }
            else if (operand.equalsIgnoreCase("+")) {
                answer = calculator.add(firstValue, secondValue);
            }
            else if (operand.equalsIgnoreCase("/")) {
                answer = calculator.divide(firstValue, secondValue);
            }
            else if (operand.equalsIgnoreCase("x")) {
                answer = calculator.multiply(firstValue, secondValue);
            }
            
            textField.appendText("=" + Integer.toString(answer));
            return;
        }
        
        textField.appendText(text);
    }
    
}
