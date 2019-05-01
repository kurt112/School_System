package FXML_FILE;

import CONTROLLER_FILE.*;
import Data_Model.Books_DataModel;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class LoadFxml {

    public LoadFxml(){

    }
    private Stage stage;
    private Parent parent;
    private FXMLLoader fxmlLoader;

    private String Register_Student  = "Register_Student_Ui.fxml";
    private String Top_Up_Alert = "Top_Up_Alert.fxml";
    private String Main_Home_ = "Main_Home_Ui.fxml";
    private String Time_in_Out = "Time_In_Out.fxml";
    private String Message = "Message_Ui.fxml";
    private String DashBoad_Ui_Path = "Dash_Board_Ui.fxml";
    private String BookRegister_Alert = "BookRegister_Ui.fxml";
    private String BookLibrary = "Library_Ui.fxml";


    private void LoadUi(JFXButton button,String path){

        stage = (Stage) button.getScene().getWindow();
        stage.close();

        stage = new Stage();

        try {

            parent = FXMLLoader.load(getClass().getResource(path));

        }catch (IOException e){

        }
        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void Load_DashBoard(JFXButton button){

        LoadUi(button,DashBoad_Ui_Path);

    }

    public void Register_Student(JFXButton button){

        LoadUi(button,Register_Student);



    }

    public void Register_Controller(JFXTextField input){
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(Register_Student));

        try {

            fxmlLoader.load();

        }catch (IOException e){
            e.printStackTrace();
        }

        Register_Student_Controller register_student_controller1 = fxmlLoader.getController();
        register_student_controller1.setValue(input);
//          return register_student_controller = fxmlLoader.getController();

    }


    public  void Load_Top_up (Parent parent, Label label){
        Alert(parent,Top_Up_Alert, StageStyle.DECORATED);
    }

    private void Alert(Parent parent, String path,StageStyle stageStyle){

        fxmlLoader = new FXMLLoader(getClass().getResource(path));
        stage = new Stage();
        stage.initOwner(parent.getScene().getWindow());

        try {
            parent = fxmlLoader.load();
        }catch (IOException e){
            e.printStackTrace();
        }

        Scene scene = new Scene(parent);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Top up");
        stage.initStyle(stageStyle);

        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void ReloadTable_Library(){
        fxmlLoader = new FXMLLoader(getClass().getResource(BookLibrary));
        try {
            fxmlLoader.load();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void BookRegister_Alert(Parent parent){

        Alert(parent,BookRegister_Alert,StageStyle.DECORATED);
        BookRegister_Controller bookRegister_controller = fxmlLoader.getController();
        bookRegister_controller.initialize(0);


    }

    public void BookRegister_Aler_Update(Parent parent, Books_DataModel books_dataModel){
        Alert(parent,BookRegister_Alert,StageStyle.UNDECORATED);
        BookRegister_Controller bookRegister_controller = fxmlLoader.getController();

        bookRegister_controller.getAbout().setText(books_dataModel.getAbout());
        bookRegister_controller.getAuthor().setText(books_dataModel.getAuthor());
        bookRegister_controller.getEdition().setText(books_dataModel.getEdition());
        bookRegister_controller.getPages().setText(""+books_dataModel.getPages());
        bookRegister_controller.getTitle().setText(books_dataModel.getTitle());
        bookRegister_controller.getBook_place().setText(books_dataModel.getLocation());
        bookRegister_controller.getPublisher().setText(books_dataModel.getPublisher());

        File file = new File(books_dataModel.getPhoto());
        bookRegister_controller.getBook_Image().setImage(new Image(file.toURI().toString()));

        if (books_dataModel.getAbridged().equals("FALSE")){
            bookRegister_controller.getRd_Abridged().setSelected(false);
        }else if(books_dataModel.getAbridged().equals("TRUE")){

            bookRegister_controller.getRd_Abridged().setSelected(true);

        }

        bookRegister_controller.getDate_published().setValue(LOCAL_DATE(books_dataModel.getDate_published()));
        bookRegister_controller.initialize(books_dataModel.getId());
        bookRegister_controller.setPath(books_dataModel.getPhoto());
        bookRegister_controller.getGenre().setValue(books_dataModel.getGenre());


    }
    private LocalDate LOCAL_DATE (String dateString){
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");

        return  LocalDate.parse(dateString, formatter);
    }


    public void Load_Time_In(Parent parent){

       Alert(parent,BookRegister_Alert,StageStyle.DECORATED);
//        Time_In_Out_Controller time_in_out1 = fxmlLoader.getController();
//        time_in_out1.setName("kurt");

    }
 
}
