package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private TextField primesAmount;
    @FXML
    private TextField noArgument;
    @FXML
    private TextArea showPrime;
    @FXML
    private Primes primes = new Primes();


    @FXML
    private void handleAction(ActionEvent event) {
        try {
            primes.createTabel(Integer.parseInt(primesAmount.getText()));
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("NOT AN INTEGEER");
            alert.setContentText("Try again!");
            alert.showAndWait();

        } catch (IllegalArgumentException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText(" illegal or inappropriate argument!");
            alert.setContentText("Try again!");
            alert.showAndWait();

        } catch (NegativeArraySizeException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText(" Out of range");
            alert.setContentText("Try again!");
            alert.showAndWait();

        }
    }


    @FXML
    private void handleAction2(ActionEvent event) {
        try {
            showPrime.setText(Integer.toString(primes.number(Integer.parseInt(noArgument.getText()))));
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText("NOT AN INTEGEER");
            alert.setContentText("Try again!");
            alert.showAndWait();

        } catch (IllegalArgumentException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText(" illegal or inappropriate argument!");
            alert.setContentText("Try again!");
            alert.showAndWait();

        } catch (NegativeArraySizeException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText(" Out of range");
            alert.setContentText("Try again!");
            alert.showAndWait();

        }
        catch (ArrayIndexOutOfBoundsException ex) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("ERROR");
            alert.setHeaderText(" Out of range");
            alert.setContentText("Try again!");
            alert.showAndWait();

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}