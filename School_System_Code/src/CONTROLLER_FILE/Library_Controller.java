package CONTROLLER_FILE;

import DataBase.DataBase_Commands;
import Data_Model.Books_DataModel;
import FXML_FILE.LoadFxml;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.SQLException;
import java.util.function.Predicate;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class Library_Controller {

    @FXML private TableView<Books_DataModel> Library_Table;
    @FXML private TableColumn<Books_DataModel,String> genre,
            title,author,publisher,date_published,edition,path
            ,about,availability,abridged;

    @FXML private JFXRadioButton RB_Available, RB_Not_Available;

    @FXML private JFXComboBox<String> Genre_Choice_Box;

    @FXML private JFXTextField Search_TextField;

    @FXML private TableColumn<Books_DataModel,Integer> pages;
    FilteredList filter  = new FilteredList(DataBase_Commands.getBooks(),e -> true);
    @FXML private VBox parent;
//    @FXML private JFXButton Add_ID;
    private FXMLLoader fxmlLoader;
    private Stage stage;


    private static int number =1;
    String value = "null";

    public void initialize() throws SQLException {
        pages.setVisible(false);
        abridged.setVisible(false);
        about.setVisible(false);
        edition.setVisible(false);
        date_published.setVisible(false);
        publisher.setVisible(false);
        DataBase_Commands.getBooks().clear();
        Add_Item_TableView();
        RB_Available.setSelected(true);
        setCellValue();
//        Add_Item_TableView();
        Add_Genre();
        System.out.println("youw");
        Genre_Choice_Box.valueProperty().addListener((observableValue, o, t1) -> {


                if(Genre_Choice_Box.getValue()== null || Genre_Choice_Box.getValue().equals("All")){

                    value = "null";

                   }else {
                    value = Genre_Choice_Box.getValue();

                }
                Search_TextField.setText("");
                Add_Item_TableView();


        });


    }

    public void Add_Item_TableView(){

        Library_Table.setItems(DataBase_Commands.get_Books(value,number));


    }

    public void Add_Genre() {
        System.out.println("im excuted");
        DataBase_Commands.Book_Genre_Item();
        DataBase_Commands.getBook_Genre_Item().add("All");
        Genre_Choice_Box.setItems(DataBase_Commands.getBook_Genre_Item());

    }

    private void setCellValue(){
        genre.setCellValueFactory(new PropertyValueFactory<>("genre"));
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        author.setCellValueFactory(new PropertyValueFactory<>("author"));
        publisher.setCellValueFactory(new PropertyValueFactory<>("publisher"));
        date_published.setCellValueFactory(new PropertyValueFactory<>("date_published"));
        edition.setCellValueFactory(new PropertyValueFactory<>("edition"));
        about.setCellValueFactory(new PropertyValueFactory<>("about"));
        path.setCellValueFactory(new PropertyValueFactory<>("location"));
        pages.setCellValueFactory(new PropertyValueFactory<>("pages"));
        abridged.setCellValueFactory(new PropertyValueFactory<>("abridged"));
        availability.setCellValueFactory(new PropertyValueFactory<>("available"));
    }


   @FXML public void Library_Table(MouseEvent mouseEvent) throws IOException{

        Books_DataModel books_dataModel = Library_Table.getSelectionModel().getSelectedItem();

        if(mouseEvent.getClickCount() == 2){

            LoadFxml loadFxml = new LoadFxml();
            loadFxml.BookRegister_Aler_Update(parent,books_dataModel);

        }

    }

    @FXML public void Not_Availble_RadioButton_Clicked() throws SQLException {
        Search_TextField.setText("");
        number=0;
        Add_Item_TableView();


    }

    @FXML public void Availble_RadioButton_Clicked() throws SQLException {
        Search_TextField.setText("");
        number=1;
        Add_Item_TableView();
    }

//    private boolean check_String(String value, String books_Val){
//
//        if(value.isEmpty() || value==null){
//            return true;
//        }else if(books_Val.toLowerCase().contains(value)){
//            return true;
//        }
//        return false;
//
//    }

//    private boolean check_Integer(String value, String books_val){
//
//        if(value.isEmpty() || value==null){
//            return true;
//        }else if(books_val.toLowerCase().contains(value)){
//            return true;
//        }
//        return false;
//
//
//    }

    public void setStyle_Black(TableColumn column){
        column.setStyle("-fx-text-fill:black;");
    }

    public void setStyle_Red(TableColumn column){
        column.setStyle("-fx-text-fill:red;");
    }
    public void Search_Table(KeyEvent keyEvent) {



    }
    @FXML public void Search_Table_Pressed(){

        Search_TextField.textProperty().addListener((observableValue, newValue, oldValue) -> {


                filter.setPredicate((Predicate<? super Books_DataModel>) (Books_DataModel books_dataModel) ->{

        String value = newValue.toLowerCase();

        if(value.isEmpty() || value==null){
//                    setStyle_Black(title);
            return true;
        }else if(books_dataModel.getTitle().toLowerCase().contains(value)){

            return true;
        }
        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getGenre().toLowerCase().contains(value)){
            return true;
        }
        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getAuthor().toLowerCase().contains(value)){
            return true;
        }
        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getPublisher().toLowerCase().contains(value)){
            return true;
        }
        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getDate_published().toLowerCase().contains(value)){
            return true;
        }
        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getEdition().toLowerCase().contains(value)){
            return true;
        }
        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getPhoto().toLowerCase().contains(newValue)){
            return true;
        }
        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getLocation().toLowerCase().contains(value)){
            return true;
        }

        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getAbout().toLowerCase().contains(value)){
            return true;
        }

        if(value.isEmpty() || value==null){
            return true;
        }else if(Integer.toString(books_dataModel.getPages()).toLowerCase().contains(value)){
            return true;
        }

        if(value.isEmpty() || value==null){
            return true;
        }else if(books_dataModel.getAbridged().toLowerCase().contains(value)){
            return true;
        }
        setStyle_Black(title);

        return false;
    });

    SortedList sortedList = new SortedList(filter);
            sortedList.comparatorProperty().bind(Library_Table.comparatorProperty());

            Library_Table.setItems(sortedList);


        });

    }
    private String BookRegister_Alert = "BookRegister_Ui.fxml";
    @FXML public void Add_Book(){

        LoadFxml loadFxml = new LoadFxml();

        loadFxml.BookRegister_Alert(parent);

//        loadFxml.BookRegister_Alert(parent.getParent());

    }

    /**
     *
     * Filetered List
     *
     * you can use this method if the method will not return any database querry
     *
     */


    /**
     *
     * End of Filtered List
     *
     * you can use this method if the method will not return any database querry
     *
     */
}
