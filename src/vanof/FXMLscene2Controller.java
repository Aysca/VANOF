package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

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
        tfBox.getItems().addAll(10, 25, 50, 100);
        TableView<Data> tvPosyandu = new TableView<Data>();
        tvPosyandu.setEditable(true);
        tcName.setCellValueFactory(new PropertyValueFactory<Data, String>("nama"));
        tcName.setCellFactory(TextFieldTableCell.forTableColumn());
        tcName.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Data, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Data, String> event) {
                Data data = event.getRowValue();
                data.setNama(event.getNewValue());
            }
        });
        tcNomor.setCellValueFactory(new PropertyValueFactory<Data, Integer>("nomor"));
        tcNomor.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tcNomor.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Data, Integer>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Data, Integer> event) {
                Data data = event.getRowValue();
                data.setNomor(event.getNewValue());
            }
        });
        tcAlamat.setCellValueFactory(new PropertyValueFactory<Data, String>("alamat"));
        tcAlamat.setCellFactory(TextFieldTableCell.forTableColumn());
        tcAlamat.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Data, String>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Data, String> event) {
                Data data = event.getRowValue();
                data.setAlamat(event.getNewValue());
            }
        });
        tcUsiaKandungan.setCellValueFactory(new PropertyValueFactory<Data, Integer>("usiaKandungan"));
        tcUsiaKandungan.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tcUsiaKandungan.setOnEditCommit(new EventHandler<TableColumn.CellEditEvent<Data, Integer>>() {
            @Override
            public void handle(TableColumn.CellEditEvent<Data, Integer> event) {
                Data data = event.getRowValue();
                data.setUsiaKandungan(event.getNewValue());
            }
        });
        
        tvPosyandu.getColumns().add(tcName);
        tvPosyandu.getColumns().add(tcNomor);
        tvPosyandu.getColumns().add(tcAlamat);
        tvPosyandu.getColumns().add(tcUsiaKandungan);
        tvPosyandu.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        data = new DataList();
        data.setDummy();
        tvPosyandu.setItems(data.getData());
    }

}
