package vanof;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.FileInputStream;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataList {

    private ObservableList<Data> listData;
    
    private String vanofFile;

    public DataList() {
        listData = FXCollections.observableArrayList();
        vanofFile = "IbuHamil.xml";
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
    
    public void loadXMLFile(){
        try {
            XStream xs = new XStream(new StaxDriver());
            FileInputStream input = new FileInputStream(vanofFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
