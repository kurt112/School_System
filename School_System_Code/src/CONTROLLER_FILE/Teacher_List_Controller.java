package CONTROLLER_FILE;

import DataBase.DataBase_Commands;
import Data_Model.Books_DataModel;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class Teacher_List_Controller {

    @FXML private TableView Teacher_Table;
    @FXML private TableColumn<Books_DataModel, String> title, first_name,middle_name,last_name,street,
                                                       barangay, municipality,salary,assign_section,major,position,
                                                       faculty_location,teacher_status;

    public void initialize(){
        setCellValue();
        AddData_Table();
    }
    private void  setCellValue(){

        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        first_name.setCellValueFactory(new PropertyValueFactory<>("first_name"));
        middle_name.setCellValueFactory(new PropertyValueFactory<>("middle_name"));
        last_name.setCellValueFactory(new PropertyValueFactory<>("last_name"));
        street.setCellValueFactory(new PropertyValueFactory<>("street"));
        barangay.setCellValueFactory(new PropertyValueFactory<>("barangay"));
        municipality.setCellValueFactory(new PropertyValueFactory<>("municipality"));
        salary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        assign_section.setCellValueFactory(new PropertyValueFactory<>("assign_section"));
        major.setCellValueFactory(new PropertyValueFactory<>("major"));
        position.setCellValueFactory(new PropertyValueFactory<>("position"));
        faculty_location.setCellValueFactory(new PropertyValueFactory<>("faculty_location"));
        teacher_status.setCellValueFactory(new PropertyValueFactory<>("status"));
        salary.setVisible(false);
        street.setVisible(false);
        barangay.setVisible(false);
        municipality.setVisible(false);
        middle_name.setVisible(false);
        position.setVisible(false);
    }

    private void AddData_Table(){

        DataBase_Commands.Teacher_Table_Query();
        Teacher_Table.setItems(DataBase_Commands.getTeacher_Data());


    }




}
