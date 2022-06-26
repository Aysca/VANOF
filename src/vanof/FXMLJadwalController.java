/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class FXMLJadwalController implements Initializable {

    JadwalList jadwal;

    @FXML
    private TableView<Jadwal> tvJadwal;

    @FXML
    private TableColumn<Jadwal, Integer> tcNo;

    @FXML
    private TableColumn<Jadwal, String> tcHari;

    @FXML
    private TableColumn<Jadwal, String> tcPosyandu;

    @FXML
    private TableColumn<Jadwal, String> tcAlamat;
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcNo.setCellValueFactory(new PropertyValueFactory<>("no"));
        tcHari.setCellValueFactory(new PropertyValueFactory<>("hari"));
        tcPosyandu.setCellValueFactory(new PropertyValueFactory<>("posyandu"));
        tcAlamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));
        
        jadwal = new JadwalList();
        jadwal.display();
        tvJadwal.setItems(jadwal.getJadwal());
        
        
       
        
        

    }

}
