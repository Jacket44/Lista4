package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private TextField zakres;
    @FXML
    private Button przycisk;
    @FXML
    private TextField args;
    @FXML
    private Label label;
    @FXML
    private Label ad1;
    @FXML
    private Label ad2;
    @FXML
    private Pane pane1;

    @FXML
    void akcja(){
        String c = zakres.getText();
        String d = args.getText();

        try {
            label.setText("");
            int a = Integer.parseInt(c);
            int b = Integer.parseInt(d);
            try {
                label.setText("");
                if (a < 2) throw new Exception();
                Pierwsze.args = b;
                Pierwsze.tablica(a);
                try {
                    FXMLLoader loader = new FXMLLoader();
                    Parent root1 = loader.load(getClass().getResource("sample2.fxml").openStream());
                    Stage stage = new Stage();
                    stage.setResizable(false);
                    stage.setTitle("My New Stage Title");
                    stage.initOwner(przycisk.getScene().getWindow());
                    stage.initModality(Modality.WINDOW_MODAL);
                    stage.setScene(new Scene(root1, 400, 300));
                    stage.showAndWait();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                label.setText("Nieprawidlowy zakres:" + a);
            }
        } catch (NumberFormatException e) {
            label.setText("Nieprawidłowe dane: " + c + "\t" + d);
        }
    }

    @FXML
    void setGreen() {
        pane1.setStyle("-fx-background-color: green");
        Pierwsze.Stage = "green";
    }

    @FXML
    void setBlue() {
        pane1.setStyle("-fx-background-color: blue");
        Pierwsze.Stage = "blue";

    }

    @FXML
    void setStandard() {
        pane1.setStyle("-fx-background-color: white");
        Pierwsze.Stage = "white";
    }


    @FXML
    void setcRed() {
        ad1.setStyle("-fx-text-fill: red");
        ad2.setStyle("-fx-text-fill: red");
        zakres.setStyle("-fx-text-fill: red");
        args.setStyle("-fx-text-fill: red");
        przycisk.setStyle("-fx-text-fill: red");
        Pierwsze.Czc = "red";
    }

    @FXML
    void setcYellow() {
        ad1.setStyle("-fx-text-fill: orange");
        ad2.setStyle("-fx-text-fill: orange");
        zakres.setStyle("-fx-text-fill: orange");
        args.setStyle("-fx-text-fill: orange");
        przycisk.setStyle("-fx-text-fill: orange");
        Pierwsze.Czc = "yellow";
    }

    @FXML
    void setStandard2() {
        ad1.setStyle("-fx-text-fill:black");
        ad2.setStyle("-fx-text-fill: black");
        zakres.setStyle("-fx-text-fill: black");
        args.setStyle("-fx-text-fill: black");
        przycisk.setStyle("-fx-text-fill: black");
        Pierwsze.Czc = "black";
    }

}




















