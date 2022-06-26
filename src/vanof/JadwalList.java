/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vanof;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class JadwalList {

    private ObservableList<Jadwal> listJadwal;

    public JadwalList() {
        listJadwal = FXCollections.observableArrayList();
    }

    public ObservableList<Jadwal> getJadwal() {
        return this.listJadwal;
    }

    public void setJadwal(int no, String hari, String posyandu, String alamat) {
        listJadwal.add(new Jadwal(no, hari, posyandu, alamat));
    }

    public void display() {
        listJadwal.add(new Jadwal(1, "Senin dan selasa Minggu pertama", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(2, "Senin dan selasa Minggu ke 2", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(3, "Senin dan selasa Minggu ke 3", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(4, "Senin dan selasa Minggu k3 4", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(5, "Senin dan selasa Minggu k3 1", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(6, "Senin dan selasa Minggu ke 2", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(7, "Senin dan selasa Minggu ke 5", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(8, "Senin dan selasa Minggu ke 3", "Sekar Melati", "Grobohan kaliwangi"));
        listJadwal.add(new Jadwal(9, "Senin dan selasa Minggu ke 6", "Sekar Melati", "Grobohan kaliwangi"));

    }

}
