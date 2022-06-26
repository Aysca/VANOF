package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author ASUS
 */
public class FXMLDocumentController implements Initializable {

    OpenScene bukaScene = new OpenScene();

    @FXML
    private BorderPane mainPane;
    
    @FXML 
    private ImageView label;

    @FXML
    private void Action(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLscene2");
        mainPane.setCenter(halaman);
        System.out.println("You clicked me!");

    }

    @FXML
    private void Action2(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLJadwal");
        mainPane.setCenter(halaman);
        System.out.println("You clicked me!");

    }
    @FXML
    private void Action3(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLDataBalita");
        mainPane.setCenter(halaman);
        System.out.println("You clicked me!");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb){
    
       
    
    }
}
