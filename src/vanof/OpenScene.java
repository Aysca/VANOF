package vanof;

import java.net.URL;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


class OpenScene {
    private Pane halaman;
    
    public Pane getPane(String namaFile){
        try{
            URL fileHalaman = VANOF.class.getResource("/vanof/" + namaFile+".fxml");
            
            if (fileHalaman==null){
                throw  new java.io.FileNotFoundException("Halaman tidak ditemukan");
            }
            halaman = FXMLLoader.load(fileHalaman);
        } catch (Exception e){
            System.out.println("Tidak ditemukan dihalaman tersebut");
        }
        return halaman;
    }
    
    
}
