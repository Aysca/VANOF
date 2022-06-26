/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanof;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PenggunaList {
//private ObservableList<IbuHamil> listIbuHamil;

    private ObservableList<IbuBalita> listIbuBalita;

    public PenggunaList() {
//    listIbuHamil = FXCollections.observableArrayList();
        listIbuBalita = FXCollections.observableArrayList();

    }

//public ObservableList<IbuHamil> getIbuHamil(){
//    return this.listIbuHamil;
//}
    public ObservableList<IbuBalita> getIbuBalita() {
        return this.listIbuBalita;
    }

//public void setIbuHamil(String nama, int usiaKandungan, int NIK){
//    listIbuHamil.add(new IbuHamil(nama, usiaKandungan, NIK));
//}
    public void setIbuBalita(String namaBalita, String namaIbu, int usiaBalita, int NIK) {
        listIbuBalita.add(new IbuBalita(namaBalita, namaIbu, usiaBalita, NIK));
    }

    public void setDummy() {
//    listIbuHamil.add(new IbuHamil("siti", 4, 1234));
        listIbuBalita.add(new IbuBalita("senja", "jingga", 5, 5678));
    }
}
