package CONTROLLER_FILE;

import DataBase.DataBase_Commands;
import FXML_FILE.LoadFxml;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.InputMismatchException;
/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class Top_Up_Controller {

    @FXML private JFXTextField Amount_Value;
    @FXML private JFXButton Top_Up_Id;
    public void initialize(){

        //DataBase_Commands.Check_Number_Only(Amount_Value    );

    }

    public JFXTextField getAmount_Value(){

        return Amount_Value;
    }



    @FXML public void Cancel_Clicked() {
        Stage stage = (Stage) Amount_Value.getScene().getWindow() ;
        stage.close();
    }

    @FXML public void Top_Up_Clicked()throws IOException {
        LoadFxml loadFxml = new LoadFxml();
        loadFxml.Register_Controller(Amount_Value);
    }

    public JFXButton getTop_Up_Id(){
        return Top_Up_Id;
    }
}
