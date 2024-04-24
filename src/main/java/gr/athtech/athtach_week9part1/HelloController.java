package gr.athtech.athtach_week9part1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML private TextField num1;
    @FXML private TextField num2;
    @FXML private TextField result;

//    private Operation operation = new Operation();

    public void add(ActionEvent actionEvent) {
        result.setText(Operation.add(num1.getText(), num2.getText()));
    }
}