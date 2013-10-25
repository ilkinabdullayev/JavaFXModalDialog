/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbasic;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author IlkinA
 */
public class MainController implements Initializable {
    private Stage primaryStage;
    
    @FXML
    private Label label;

    @FXML
    private void handleButtonAction(ActionEvent event) throws Exception{
        System.out.println("You clicked me!");
        FXMLLoader fl = new FXMLLoader();
        fl.setLocation(getClass().getResource("modal.fxml"));
        fl.load();
        Parent root = fl.getRoot();
       
        Stage modal_dialog = new Stage(StageStyle.DECORATED);
        modal_dialog.initModality(Modality.WINDOW_MODAL);
        modal_dialog.initOwner(primaryStage);
        Scene scene = new Scene(root);
       
        MainController t1 = (MainController)fl.getController();
        t1.setStage(modal_dialog);
        modal_dialog.setScene(scene);
        modal_dialog.show();
    
    }

    public void setStage(Stage temp){
        primaryStage = temp;
    }
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
