package vanof;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FXMLDataBalitaController implements Initializable {

    PenggunaList data2;

    @FXML
    private TableView<IbuBalita> tvIbuBalita;

    @FXML
    private TableColumn<IbuBalita, Integer> tcNIK;

    @FXML
    private TableColumn<IbuBalita, String> tcNamaIbu;

    @FXML
    private TableColumn<IbuBalita, String> tcNamaBalita;

    @FXML
    private TableColumn<IbuBalita, Integer> tcUsiaBalita;

    @FXML
    private Label label;

    @FXML
    private TextField tfNIK;

    @FXML
    private TextField tfnamaBalita;

    @FXML
    private TextField tfnamaIbu;

    @FXML
    private TextField tfusiaBalita;

    @FXML
    private RadioButton rbibuHamil;

    @FXML
    private RadioButton rbibuBalita;

    @FXML
    private ChoiceBox cbNIK;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String namaBalita = tfnamaBalita.getText();
        String namaIbu = tfnamaIbu.getText();
        String usiaBalita = tfusiaBalita.getText();
        int usiaB = Integer.parseInt(usiaBalita);
        String NIK = tfNIK.getText();
        int nik = Integer.parseInt(NIK);

        data2.setIbuBalita(namaBalita, namaIbu, usiaB, nik);

        tvIbuBalita.setItems(data2.getIbuBalita());
        System.out.println("createButton is clicked");


        if (rbibuBalita.isSelected()); else if (rbibuHamil.isSelected());

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcNamaIbu.setCellValueFactory(new PropertyValueFactory<>("namaIbu"));
        tcNamaBalita.setCellValueFactory(new PropertyValueFactory<>("namaBalita"));
        tcUsiaBalita.setCellValueFactory(new PropertyValueFactory<>("usiaBalita"));
        tcNIK.setCellValueFactory(new PropertyValueFactory<>("NIK"));

        cbNIK.setValue("KIA");
        cbNIK.getItems().addAll("KIA", "KTP");


        data2 = new PenggunaList();
        data2.setDummy();
        tvIbuBalita.setItems(data2.getIbuBalita());
    }

}
