package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLDataChartController implements Initializable {

//    XYChart.Series<String, Integer> data = new XYChart.Series();
//
//    @FXML
//    private Label label;
//
//    @FXML
//    private BarChart mobil;
//
//    @FXML
//    private Button hapus;
//
//    @FXML
//    private Button tambah;
//
//    @FXML
//    private void handleButtonHapus(ActionEvent event) {
//        data.getData().remove(3);
//        System.out.println("KurangButton is cliked");
//    }
//
//    @FXML
//    private void handleButtonTambah(ActionEvent event) {
//        data.getData().add(new XYChart.Data<>("HatcBack", 400));
//        System.out.println("TambahButton is cliked");
//    }
//
//    @Override
//    public void initialize(URL url, ResourceBundle rb) {
//        // TODO
//
//        data.getData().add(new XYChart.Data<>("MPV", 300));
//        data.getData().add(new XYChart.Data<>("SUV", 200));
//        data.getData().add(new XYChart.Data<>("Sedan", 500));
//
//        mobil.getData().add(data);
//    }
    XYChart.Series<String, Integer> data = new XYChart.Series();

    @FXML
    private Label label;

    @FXML
    private BarChart Data;

    @FXML
    private Button hapus;

    @FXML
    private Button tambah;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        data.getData().add(new XYChart.Data<>("Balita", 343));
        data.getData().add(new XYChart.Data<>("Ibu Hamil", 202));
        Data.getData().add(data);

    }

}
