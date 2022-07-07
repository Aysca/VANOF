
package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;

public class Masuk1Controller implements Initializable {
    
    OpenScene bukaScene = new OpenScene();
    
    @FXML
    private BorderPane mainPane;

    @FXML
    private void Action(ActionEvent event) {
//        Pane halaman = bukaScene.getPane("FXMLscene2");
        Pane halaman = bukaScene.getPane("FXMLDocument");
        mainPane.setCenter(halaman);
        System.out.println("You clicked me!");

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
