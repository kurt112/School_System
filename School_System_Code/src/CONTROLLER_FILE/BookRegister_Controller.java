package CONTROLLER_FILE;

import DataBase.DataBase_Commands;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;

import java.io.File;
import java.time.format.DateTimeFormatter;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 27, 2019
 * Time: 21: 38
 * User: orioque35
 */

public class BookRegister_Controller {

    public String isAbridge="";
    @FXML private ImageView Book_Image;
    @FXML private BorderPane Parent;

    @FXML
    private JFXTextField genre,title,author,publisher,edition,copy,location,pages;


    @FXML private JFXDatePicker date_published;
    @FXML private JFXRadioButton rd_Abridged,rd_NotAbridged;

    private DateTimeFormatter Date_format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    @FXML private TextArea about;
    String path ="";

   @FXML public void Upload_Photo_Clicked() {

       FileChooser fileChooser = new FileChooser();
       fileChooser.setTitle("Save Picture");
       fileChooser.getExtensionFilters().addAll(
               new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif")
       );

       File file = fileChooser.showOpenDialog(Parent.getScene().getWindow());
       if(file !=null){
           path = file.toURI().toString();
           Book_Image.setImage(new Image(file.toURI().toString()));

       }



    }



    @FXML public void Abridged_RadioButton_Clicked() {

        isAbridge="TRUE";

    }

    @FXML public void NotAbridged_RadioButton_Clicked() {

        isAbridge="FALSE";

    }

    @FXML public void AddButton_Clicked() {

       String date = Date_format.format(date_published.getValue());
        try {

            int mycopy = Integer.parseInt(copy.getText());

            for (int i=0;i<mycopy;i++){
                DataBase_Commands.AddBook(genre.getText(),title.getText(),author.getText(),publisher.getText(),date,edition.getText(),path,
                        location.getText(),about.getText(),1,isAbridge,"TRUE");
            }

        }catch (NumberFormatException e){

        }


    }
}
