package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


public class Controller2 {

    @FXML
    private Pane pane2;

    @FXML
    private Label dane;

    @FXML
    private TextField args2;

    @FXML
    private Button ok;

    @FXML
    private Label zle;

    @FXML
    private Label wiki;


    @FXML
    void initialize() {
        pane2.setStyle("-fx-background-color:" + Pierwsze.Stage);
        dane.setStyle("-fx-text-fill:" + Pierwsze.Czc);
        args2.setStyle("-fx-text-fill:" + Pierwsze.Czc);
        ok.setStyle("-fx-text-fill:" + Pierwsze.Czc);
        zle.setStyle("-fx-text-fill:" + Pierwsze.Czc);
        wiki.setStyle("-fx-text-fill:" + Pierwsze.Czc);

    }

    @FXML
    public void akcja2() {
        try {
            zle.setText("");
            String parameters = args2.getText();
            String[] parametersParts = parameters.split(" ");
            if (parametersParts.length != Pierwsze.args) throw new Exception();
            String wynik = "";
            int i = 0;
            while (i < parametersParts.length) {
                try {
                    int help = Integer.parseInt(parametersParts[i]);
                    wynik += help + "-" + Pierwsze.liczba(help) + " ";
                } catch (NumberFormatException e) {
                    wynik += parametersParts[i] + ": Nieprawdilowa dana ";
                }
                i++;
            }
            wiki.setText(wynik);

        } catch (Exception a) {
            zle.setText("Nieprawidlowa ilosc argumentow");
            wiki.setText("");

        }
    }


}









