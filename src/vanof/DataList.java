package vanof;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataList {

    private ObservableList<Data> listData;

    public DataList() {
        listData = FXCollections.observableArrayList();
    }

    public ObservableList<Data> getData() {
        return this.listData;
    }

    public void setData(String nama, int nomor, String alamat, int usiaKandungan) {
        listData.add(new Data(nama, nomor, alamat, usiaKandungan));
    }

    public void setDummy() {
        listData.add(new Data("Ai", 678432, "Gamping,Nogotirto DIY", 8));
        listData.add(new Data("Kiate", 67834530, "Wates,Kulonprogo DIY", 5));
    }
}
