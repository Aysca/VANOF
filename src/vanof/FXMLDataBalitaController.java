package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

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
        TableView<IbuBalita> tvIbuBalita = new TableView<IbuBalita>();
        tvIbuBalita.setEditable(true);
//        TableColumn<IbuBalita, String> namaIbu = new TableColumn<IbuBalita, String>("namaIbu");
        tcNamaIbu.setCellValueFactory(new PropertyValueFactory<IbuBalita, String>("namaIbu"));
        tcNamaIbu.setCellFactory(TextFieldTableCell.forTableColumn());
        tcNamaIbu.setOnEditCommit(new EventHandler<CellEditEvent<IbuBalita, String>>() {
            @Override
            public void handle(CellEditEvent<IbuBalita, String> event) {
                IbuBalita ibuBalita = event.getRowValue();
                ibuBalita.SetNamaIbu(event.getNewValue());
            }
        });
        tcNamaBalita.setCellValueFactory(new PropertyValueFactory<IbuBalita, String>("namaBalita"));
        tcNamaBalita.setCellFactory(TextFieldTableCell.forTableColumn());
        tcNamaBalita.setOnEditCommit(new EventHandler<CellEditEvent<IbuBalita, String>>() {
            @Override
            public void handle(CellEditEvent<IbuBalita, String> event) {
                IbuBalita Balita = event.getRowValue();
                Balita.SetNamaBalita(event.getNewValue());
            }
        });
        tcUsiaBalita.setCellValueFactory(new PropertyValueFactory<IbuBalita, Integer>("usiaBalita"));
        tcUsiaBalita.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tcUsiaBalita.setOnEditCommit(new EventHandler<CellEditEvent<IbuBalita, Integer>>() {
            @Override
            public void handle(CellEditEvent<IbuBalita, Integer> event) {
                IbuBalita usiBalita = event.getRowValue();
                usiBalita.SetUsiaBalita(event.getNewValue());
            }
        });
        tcNIK.setCellValueFactory(new PropertyValueFactory<IbuBalita, Integer>("NIK"));
        tcNIK.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tcNIK.setOnEditCommit(new EventHandler<CellEditEvent<IbuBalita, Integer>>() {
            @Override
            public void handle(CellEditEvent<IbuBalita, Integer> event) {
                IbuBalita NIK = event.getRowValue();
                NIK.SetNIK(event.getNewValue());
            }
        });
        cbNIK.setValue("KIA");
        cbNIK.getItems().addAll("KIA", "KTP");

        tvIbuBalita.getColumns().add(tcNamaIbu);
        tvIbuBalita.getColumns().add(tcNamaBalita);
        tvIbuBalita.getColumns().add(tcUsiaBalita);
        tvIbuBalita.getColumns().add(tcNIK);
        tvIbuBalita.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        data2 = new PenggunaList();
        data2.setDummy();
        tvIbuBalita.setItems(data2.getIbuBalita());
    }
}
