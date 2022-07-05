
package vanof;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.BorderPane;

public class FXMLDocumentController_1 implements Initializable {
    
    OpenScene bukaScene = new OpenScene();
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void loginButtonAction(ActionEvent event) {
        Pane halaman = bukaScene.getPane("Masuk1");
        mainPane.setLeft(halaman);
        System.out.println("Button Masuk Is Clicked!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
