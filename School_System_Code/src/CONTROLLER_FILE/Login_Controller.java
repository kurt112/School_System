package CONTROLLER_FILE;

import Alerts.AlertType;
import DataBase.DataBase_Commands;
import FXML_FILE.LoadFxml;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class Login_Controller {
    LoadFxml loadFxml = new LoadFxml();
    @FXML
    private Label barcode;
    @FXML private GridPane parent1;
    @FXML private JFXButton Generate_ID;
    private String full_Name = "Sample Barcode";
    @FXML private JFXTextField Text_Field;
    @FXML private JFXPasswordField Password_Field;
    @FXML private ImageView Logo_Login;
    public void initialize(){
        DataBase_Commands.Teacher_Table_Query();

        Password_Field.focusedProperty().addListener((observableValue, aBoolean, t1) -> {
            if(t1){
                File file = new File("C:\\Users\\orioque35\\Desktop\\School_System\\Barcode\\src\\Pictures\\Login_Logo_Password.png");
                Logo_Login.setImage(new Image(file.toURI().toString()));
            }
        });

        Text_Field.focusedProperty().addListener((observableValue, aBoolean, t1) -> {
            if(t1){
                File file = new File("C:\\Users\\orioque35\\Desktop\\School_System\\Barcode\\src\\Pictures\\Login_Logo_UserName.png");
                Logo_Login.setImage(new Image(file.toURI().toString()));
            }
        });





    }

    public void Login(){

//       loadFxml.Register_Student(Generate_ID);
        loadFxml.Load_DashBoard(Generate_ID);
    }
}
