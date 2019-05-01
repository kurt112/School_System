package CONTROLLER_FILE;

import Alerts.AlertType;
import DataBase.DataBase_Commands;
import Data_Model.Books_DataModel;
import FXML_FILE.LoadFxml;
import com.jfoenix.controls.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextInputDialog;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.time.LocalDate;
import java.util.Optional;


/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 27, 2019
 * Time: 21: 38
 * User: orioque35
 */

public class BookRegister_Controller{

    public String isAbridge="";
    @FXML private ImageView Book_Image;
    @FXML private BorderPane Parent;
    private int id =0;
    @FXML private JFXTextField title,author,publisher,edition,copy,book_place,pages;
    @FXML private JFXButton submit, update;
    @FXML private JFXComboBox<String>genre;
    @FXML private DatePicker date_published;
    @FXML private JFXRadioButton rd_Abridged,rd_NotAbridged;

    private DateTimeFormatter Date_format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    @FXML private TextArea about;
    private String path ="";
    private Stage stage;
    public void initialize(int id){

        this.id = id;
        if(id ==0){

            update.setVisible(false);

        }else {
            submit.setVisible(false);
        }
        Add_genre();
        genre.valueProperty().addListener((observableValue, s, t1) -> {
            if(genre.getValue()=="Specify"){
                SpecifyClicked();
//            System.out.println(genre.getValue()=="Specify");
            }

        });

        if(rd_Abridged.isSelected()){
            Abridged_RadioButton_Clicked();
        }

        if(rd_NotAbridged.isSelected()){
            NotAbridged_RadioButton_Clicked();
        }
    }

   @FXML public void Upload_Photo_Clicked() {


       FileChooser fileChooser = new FileChooser();
       fileChooser.setTitle("Save Picture");
       fileChooser.getExtensionFilters().addAll(
               new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif")
       );

       File file = fileChooser.showOpenDialog(Parent.getScene().getWindow());
       if(file !=null){
           path = file.toString();
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
        LoadFxml loadFxml = new LoadFxml();
        try {

            int mycopy = Integer.parseInt(copy.getText());
            int page = Integer.parseInt(pages.getText());
            for (int i=0;i<mycopy;i++){
                DataBase_Commands.AddBook(genre.getValue(),title.getText(),author.getText(),publisher.getText(),date,edition.getText(),path,
                       book_place.getText(),about.getText(),page,isAbridge,"Available");
            }

            loadFxml.ReloadTable_Library();

        }catch (NumberFormatException e){

        }


    }
    @FXML public void Update_Clicked() {
        String date = Date_format.format(date_published.getValue());
        LoadFxml loadFxml = new LoadFxml();
        System.out.println(path);
        try {
            int page = Integer.parseInt(pages.getText());
            System.out.println("The id -> " + id);
            DataBase_Commands.Update_Book(genre.getValue(),title.getText(),author.getText(),publisher.getText(),date,edition.getText(),path,
                    book_place.getText(),about.getText(),page,isAbridge,id);

              loadFxml.ReloadTable_Library();
            stage =(Stage) Parent.getScene().getWindow();
            stage.close();
        }catch (NumberFormatException e){
            AlertType.Alert_Error(" Update Unsuccessful"," The page input is not valid ");
        }


   }

    private void Add_genre(){


        DataBase_Commands.Book_Genre_Item();
        DataBase_Commands.getBook_Genre_Item().add("Specify");
        genre.setItems(DataBase_Commands.getBook_Genre_Item());

    }

    private void SpecifyClicked(){
        TextInputDialog dialog = new TextInputDialog("Enter Value");

        dialog.setTitle("Enter Value");
        dialog.setHeaderText(null);
        dialog.setContentText(null);

        Optional<String> result = dialog.showAndWait();

        result.ifPresent(name -> {

//            genre.setValue(name);
//            genre.getItems().clear();
            DataBase_Commands.getBook_Genre_Item().add(name);
//            genre.setItems(DataBase_Commands.getBook_Genre_Item());
            genre.setValue(name);
        });
    }

//    @FXML public void Genre_Clicked() {
//
//
//
//
//
//    }

    public ImageView getBook_Image() {
        return Book_Image;
    }

    public BorderPane getParent() {
        return Parent;
    }

    public JFXComboBox<String> getGenre() {
        return genre;
    }

    public JFXTextField getTitle() {
        return title;
    }

    public JFXTextField getAuthor() {
        return author;
    }

    public JFXTextField getPublisher() {
        return publisher;
    }

    public JFXTextField getEdition() {
        return edition;
    }

    public JFXTextField getCopy() {
        return copy;
    }

    public JFXTextField getBook_place() {
        return book_place;
    }

    public JFXTextField getPages() {
        return pages;
    }

    public DatePicker getDate_published() {
        return date_published;
    }

    public JFXRadioButton getRd_Abridged() {
        return rd_Abridged;
    }

    public JFXRadioButton getRd_NotAbridged() {
        return rd_NotAbridged;
    }

    public TextArea getAbout() {
        return about;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
