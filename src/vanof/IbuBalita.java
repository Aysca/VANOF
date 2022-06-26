/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanof;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class IbuBalita {

    private SimpleStringProperty namaBalita;
    private SimpleStringProperty namaIbu;
    private SimpleIntegerProperty usiaBalita;
    private SimpleIntegerProperty NIK;

    public IbuBalita() {
        this("", "", 0, 0);
    }

    public IbuBalita(String namaBalita, String namaIbu, int usiaBalita, int NIK) {
        this.namaBalita = new SimpleStringProperty(namaBalita);
        this.namaIbu = new SimpleStringProperty(namaIbu);
        this.usiaBalita = new SimpleIntegerProperty(usiaBalita);
        this.NIK = new SimpleIntegerProperty(NIK);
    }

    public void SetNamaBalita(String nb) {
        this.namaBalita.set(nb);
    }

    public void SetNamaIbu(String ni) {
        this.namaIbu.set(ni);
    }

    public void SetUsiaBalita(int ub) {
        this.usiaBalita.set(ub);
    }

    public void SetNIK(int nik) {
        this.NIK.set(nik);
    }

    public String getNamaBalita() {
        return namaBalita.get();
    }

    public String getNamaIbu() {
        return namaIbu.get();
    }

    public int getUsiaBalita() {
        return usiaBalita.get();
    }

    public int getNIK() {
        return NIK.get();
    }

}
