package FXML_FILE;

import CONTROLLER_FILE.Register_Student_Controller;
import CONTROLLER_FILE.Time_In_Out_Controller;
import CONTROLLER_FILE.Top_Up_Controller;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
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

    private void LoadUi(JFXButton button,String path)throws  IOException{

        stage = (Stage) button.getScene().getWindow();
        stage.close();

        stage = new Stage();

        parent = FXMLLoader.load(getClass().getResource(path));

        Scene scene = new Scene(parent);

        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void Load_DashBoard(JFXButton button) throws IOException{

        LoadUi(button,DashBoad_Ui_Path);

    }

    public void Register_Student(JFXButton button)throws  IOException{

        LoadUi(button,Register_Student);



    }

    public void Register_Controller(JFXTextField input) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(Register_Student));
        fxmlLoader.load();
        Register_Student_Controller register_student_controller1 = fxmlLoader.getController();
        register_student_controller1.setValue(input);
//          return register_student_controller = fxmlLoader.getController();

    }


    public  void Load_Top_up (Parent parent, Label label)throws  IOException{
        Alert(parent,Top_Up_Alert, StageStyle.DECORATED);
    }

    public void Alert(Parent parent, String path,StageStyle stageStyle)throws  IOException{

        fxmlLoader = new FXMLLoader(getClass().getResource(path));
        stage = new Stage();
        stage.initOwner(parent.getScene().getWindow());
        parent = fxmlLoader.load();
        Scene scene = new Scene(parent);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.setTitle("Top up");
        stage.initStyle(stageStyle);

        stage.centerOnScreen();
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public void BookRegister_Alert(Parent parent)throws  IOException{

        Alert(parent,BookRegister_Alert,StageStyle.DECORATED);
    }


    public void Load_Time_In(Parent parent) throws IOException{

       Alert(parent,Time_in_Out,StageStyle.DECORATED);
        Time_In_Out_Controller time_in_out1 = fxmlLoader.getController();
        time_in_out1.setName("kurt");

    }
 
}
