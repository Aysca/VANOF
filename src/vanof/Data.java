package vanof;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Data {

    private SimpleStringProperty nama;
    private SimpleIntegerProperty nomor;
    private SimpleStringProperty alamat;
    private SimpleIntegerProperty usiaKandungan;

    public Data(String nama, int nomor, String alamat, int usiaKandungan) {
        this.nama = new SimpleStringProperty(nama);
        this.nomor = new SimpleIntegerProperty(nomor);
        this.alamat = new SimpleStringProperty(alamat);
        this.usiaKandungan = new SimpleIntegerProperty(usiaKandungan);
    }
        public String getNama() {
        return nama.get();

    }

    public void setNama(String nm) {
        this.nama.set(nm);
    }

    public int getNomor() {
        return nomor.get();
    }

    public void setNomor(int nm) {
        this.nomor.set(nm);
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String nm) {
        this.alamat.set(nm);
    }
    
    public int getUsiaKandungan() {
        return usiaKandungan.get();
    }

    public void setUsiaKandungan(int nm) {
        this.usiaKandungan.set(nm);
    }
}