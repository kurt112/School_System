package CONTROLLER_FILE;

import DataBase.DataBase_Commands;
import FXML_FILE.LoadFxml;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
//import net.connectcode.Code128Auto;

import java.io.File;
import java.io.IOException;
/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class Register_Student_Controller {


    @FXML private JFXTextField First_Name, Middle_Name, Last_Name, Street_Address,
                               Mother_First_Name, Mother_Middle_Name,Mother_Last_Name,Mother_Occupation,
                               Father_First_Name, Father_Middle_Name, Father_Last_Name, Father_Occupation,
                               Cell_Phone_Number, Phone_Number, Email_Address, Lrn;
    @FXML private Label Barcode_ID,Amount;
    @FXML private JFXButton Next_Button_ID,Top_Up_Id;
    @FXML private ImageView Student_Image;
    @FXML private BorderPane border;
    @FXML private JFXComboBox Year_Level_ComboBox, Section_ComboBox, Salary_ComboBox;
    @FXML private JFXRadioButton Male_RadioButton,Female_RadioButton;
    private ObservableList<String> Year_Level_List = FXCollections.observableArrayList("1","2","3","4","5","6");
    private ObservableList<String> Section_List = FXCollections.observableArrayList("Anahaw","Narra", "Santol", "Mannga");
    private ObservableList<String> Salary_List = FXCollections.observableArrayList("1 - 2000", "2000 - 10000","10000 - 20000", "20000 - 80000");
    private String sex = "";
    private Stage stage;
    private Parent parent;
    public void initialize(){

        Year_Level_ComboBox.setItems(Year_Level_List);
        Section_ComboBox.setItems(Section_List);
        Salary_ComboBox.setItems(Salary_List);

        Add_Barcode(First_Name,Last_Name);
        Add_Focused_Property(First_Name);
        Add_Focused_Property(Last_Name);
        Add_Focused_Property(Middle_Name);
        Add_Focused_Property(Street_Address);

        Add_Focused_Property(Mother_First_Name);
        Add_Focused_Property(Mother_Middle_Name);
        Add_Focused_Property(Mother_Last_Name);
        Add_Focused_Property(Mother_Occupation);

        Add_Focused_Property(Father_First_Name);
        Add_Focused_Property(Father_Middle_Name);
        Add_Focused_Property(Father_Last_Name);
        Add_Focused_Property(Father_Occupation);

        Add_Focused_Property(Cell_Phone_Number);
        Add_Focused_Property(Phone_Number);
        Add_Focused_Property(Email_Address);

        AutoFill(Mother_Last_Name);
        AutoFill(Father_Last_Name);

        Add_Focused_Property(Lrn);

        Check_Email(Email_Address);


        Cell_Phone_Number.textProperty().addListener((observableValue, s, t1) -> {
            if(!t1.isEmpty()){
                Validate_Number_Field(Cell_Phone_Number);
            }
        });
    }


    public void Add_Focused_Property(JFXTextField field){

        RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator();
        requiredFieldValidator.setMessage(field.getPromptText() + " is Empty");

        field.focusedProperty().addListener((observableValue, aBoolean, t1) -> {
            if(!t1){
                field.getValidators().add(requiredFieldValidator);
                field.validate();
            if(!field.getText().isEmpty() || !field.getText().trim().isEmpty()){
                field.setStyle("-fx-prompt-text-fill: #3009bf;");

            }else{
                field.setStyle("-fx-prompt-text-fill: red;");

            }

            }
        });

    }

    public void Add_Barcode(JFXTextField field, JFXTextField field2){


        field.textProperty().addListener((observableValue, s, t1) -> {

            if(t1.isEmpty() || t1.trim().isEmpty()){

            }else{

                if(!field2.getText().trim().isEmpty() || !field2.getText().isEmpty()) {
                    Barcode_ID .setText(field.getText() + field2.getText());

                }
            }

        });

        field2.textProperty().addListener((observableValue, s, t1) -> {

            if(t1.isEmpty() || t1.trim().isEmpty() && field.getText().trim().isEmpty() || field.getText().isEmpty()){

            }else{
                Barcode_ID .setText(field.getText() + field2.getText());

            }


        });


    }

    @FXML public void Next_Button_Clicked() {

        System.out.println("im clicked");
        initialize();
    }

    @FXML public void Upload_Photo_Clicked() {

            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Save Picture");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif")
            );

            File file = fileChooser.showOpenDialog(border.getScene().getWindow());
            if(file !=null){

                Student_Image.setImage(new Image(file.toURI().toString()));

            }
    }

    @FXML public void Female_RadioButton_Clicked() {
//        System.out.println(Male_RadioButton.isPressed());
//        sex = "Female";

        if(Male_RadioButton.isSelected()){

        }
    }

    @FXML public void Male_RadioButton_Clicked() {

//        System.out.println(Male_RadioButton.isArmed());
        if( Male_RadioButton.isSelected()){
            System.out.println("Im already pressed");
        }else{
            System.out.println("im click");
        }
        sex = "Male";

    }

    private long Validate_Number_Field(JFXTextField textField){

        NumberValidator numberValidator = new NumberValidator();
        RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator();

        textField.getValidators().add(requiredFieldValidator);
        textField.getValidators().add(numberValidator);
        numberValidator.setMessage("Number Only");


        textField.focusedProperty().addListener((observableValue, aBoolean, t1) -> {
            if(!t1){
                requiredFieldValidator.setMessage(textField.getPromptText() + " is Empty");
                textField.validate();
            }
        });

        try {
            long convert = Long.parseLong(textField.getText());

            textField.textProperty().addListener((observableValue, s, t1) -> {
                if(t1.trim().isEmpty() || t1.isEmpty()){
                    textField.setStyle("-fx-prompt-text-fill:red;");
                }else{
                    textField.setStyle("-fx-prompt-text-fill: #3009bf;");
                }
            });

            return convert;

        }catch (NumberFormatException e){

            textField.validate();

        }

        return 0;

    }

    public void Check_Email(JFXTextField textField) {
        RequiredFieldValidator requiredFieldValidator = new RequiredFieldValidator();
        textField.getValidators().add(requiredFieldValidator);
        requiredFieldValidator.setMessage("Not invalid Email");

        textField.focusedProperty().addListener((observableValue, aBoolean, t1) -> {

            for(int i=0; i<textField.getText().length();i++){

                String containing =  String.valueOf(textField.getText().charAt(i));


                if(!containing.equals("@")){

                    textField.validate();

                }

            }
        });

    }


    public void AutoFill(JFXTextField Last_Name2){

        Last_Name.textProperty().addListener((observableValue, s, t1) -> {

            if(!t1.trim().isEmpty() || !t1.isEmpty()){
                Last_Name2.setText(Last_Name.getText());
                Last_Name2.setStyle("-fx-prompt-text-fill:red;");
            }else{
                Last_Name.setStyle("-fx-prompt-text-fill:red;");
            }


        });

    }

    @FXML public void Top_Up_Clicked() throws IOException {

       LoadFxml loadFxml = new LoadFxml();
       loadFxml.Load_Top_up(border, Amount);
//       FXMLLoader Top_up =loadFxml.Load_Top_up(border, Amount);
//
//       Top_Up_Controller top_up_controller = Top_up.getController();


    }

    public void setValue(JFXTextField value){
        System.out.println(value.getText());
      Amount.textProperty().bindBidirectional(value.textProperty());
    }

}
