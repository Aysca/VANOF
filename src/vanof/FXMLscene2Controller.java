package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLscene2Controller implements Initializable {

    DataList data;



    @FXML
    private ChoiceBox tfBox;

    @FXML
    private TableView<Data> tvPosyandu;

    @FXML
    private TableColumn<Data, String> tcName;

    @FXML
    private TableColumn<Data, Integer> tcNomor;

    @FXML
    private TableColumn<Data, String> tcAlamat;

    @FXML
    private TableColumn<Data, Integer> tcUsiaKandungan;

    @FXML
    private TextField tfName;

    @FXML
    private TextField tfNomor;

    @FXML
    private TextField tfAlamat;

    @FXML
    private TextField tfUsia;

    @FXML
    private void Actionbutton(ActionEvent event) {

        String nama = tfName.getText();
        String no = tfNomor.getText();
        String Alamat = tfAlamat.getText();
        String usiaKandungan = tfUsia.getText();
        int usiakandungan2 = Integer.parseInt(usiaKandungan);
        int no2 = Integer.parseInt(no);
        data.setData(nama, no2, Alamat, usiakandungan2);
        tvPosyandu.setItems(data.getData());
        System.out.println("CreateButton is cliked");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfBox.setValue(10);
        tfBox.getItems().addAll(10,25,50,100);
        tcName.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tcNomor.setCellValueFactory(new PropertyValueFactory<>("nomor"));
        tcAlamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        tcUsiaKandungan.setCellValueFactory(new PropertyValueFactory<>("usiaKandungan"));

        data = new DataList();
        data.setDummy();
        tvPosyandu.setItems(data.getData());
    }

}
