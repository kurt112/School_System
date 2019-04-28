package FXML_FILE;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.IOException;
/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class Dash_Board_Controller {


    /**
     *Name of Vbox Item Changing
     */
    @FXML private VBox Vbox_Change;
    /**
     *End of Name of Vbox Item Changing
     */

    /**
     *
     * Declaring of Path of Ui
     *
     */
    private final String DashBoardItem_Statistic = "Dash_Board_Item_1(statistic).fxml";
    private final String Student_List_Ui = "Student_List_Ui.fxml";
    private final String Teacher_List_Ui = "Teacher_List_Ui.fxml";
    private final String Library_Ui = "Library_Ui.fxml";
    private final String Canteen_Ui = "Canteen_Ui.fxml";
    private final String SendMessage_Ui = "SendMessage_List_Ui.fxml";
    private final String Guidance_Ui = "Guidance_Ui.fxml";

    /**
     *
     * End Declaring of Path of Ui
     *
     */



    /**
     * Declaring of Runnable Ui
     */

    private Runnable Statistic_Item_Ui_Runnable = () -> Platform.runLater(() -> Dash_Board_Item(DashBoardItem_Statistic));
    private Runnable Student_List_Ui_Runnable = () -> Platform.runLater(() -> Dash_Board_Item(Student_List_Ui));
    private Runnable Teacher_List_Ui_Runnable = () -> Platform.runLater(() -> Dash_Board_Item(Teacher_List_Ui));
    private Runnable Library_Ui_Runnable = () -> Platform.runLater(() -> Dash_Board_Item(Library_Ui));
    private Runnable Canteen_Ui_Runnable = () -> Platform.runLater(() -> Dash_Board_Item(Canteen_Ui));
    private Runnable SendMessage_Ui_Runnable = () -> Platform.runLater(() -> Dash_Board_Item(SendMessage_Ui));
    private Runnable Guidance_Ui_Runnable = () -> Platform.runLater(() -> Dash_Board_Item(Guidance_Ui));

    /**
     * End of Declaring Runnable
     */


    /**
     * Declaring of Label in Ui
     */
    @FXML private Label StudentList_ID, TeacherList_ID,Home_ID, Guidance_ID,Library_ID,Canteen_ID,SendMessage_ID,Logout_ID;

    /**
     * End of Declaring of Label in Ui
     */


    /**
     * Declaring of Pane in Ui
     */
    @FXML private Pane StudentList_Button, TeacherList_Button, Home_Button,Guidance_Button,
                        Library_Button,Canteen_Button,SendMessage_Button,Logout_Button;
    /**
     * End of Declaring of Pane in Ui
     */

    private Thread New_Thread(Runnable runnable){
        Thread thread = new Thread(runnable);
        return thread;
    }


    public void initialize(){

        Dash_Board_Item(DashBoardItem_Statistic);


    }

    /**
     *
     *
     *
     *
     * Start of Changing item in Vbox
     *
     *
     *
     *
     *
     */

    private void Dash_Board_Item(String path){

        Vbox_Change.getChildren().clear();
        Vbox_Change.getChildren().setAll(New_Vbox(path));

    }


    private VBox New_Vbox(String path){

        VBox vBox = null;

        try {

            vBox = FXMLLoader.load(getClass().getResource(path));
            return vBox;

        }catch (IOException e){
            e.printStackTrace();
        }

        return vBox;

    }

    /**
     *
     *
     *
     *
     * End of Changing item in Vbox
     *
     *
     *
     *
     *
     */


    /**
     *
     *
     *
     *
     *
     *
     * Start of Function Button
     *
     *
     *
     *
     *
     *
     */

    @FXML public void Goto_TeacherList() {

        New_Thread(Teacher_List_Ui_Runnable).start();


    }

    @FXML public void Goto_StudentList() {

        New_Thread(Student_List_Ui_Runnable).start();

    }

    @FXML public void Goto_Home() {

        New_Thread(Statistic_Item_Ui_Runnable).start();

    }

    @FXML public void Goto_Guidance() {
        New_Thread(Guidance_Ui_Runnable).start();
    }

    @FXML public void Goto_Library() {
        New_Thread(Library_Ui_Runnable).start();
    }

    @FXML public void Goto_Canteen() {
        New_Thread(Canteen_Ui_Runnable).start();
    }

    @FXML public void Goto_SendMessage() {

        New_Thread(SendMessage_Ui_Runnable).start();

    }

    @FXML public void Goto_Logout() {

    }


    /**
     *
     *
     *
     *
     * End of Function Button
     *
     *
     *
     *
     */


    /**
     *
     *
     *
     *
     *
     *
     * Start of Design Button
     *
     *
     *
     *
     *
     *
     */

    @FXML public void Teacher_MouseExited() {

        TeacherList_ID.setText("Teacher List");
        TeacherList_Button.setPrefWidth(33);

    }

    @FXML public void Teacher_MouseEntered() {

        TeacherList_ID.setText("");
        TeacherList_Button.setPrefWidth(300);

    }

    @FXML public void Student_MouseExited() {

        StudentList_ID.setText("Student List");
        StudentList_Button.setPrefWidth(33);

    }

    @FXML public void Student_MouseEntered() {

        StudentList_ID.setText("");
        StudentList_Button.setPrefWidth(300);

    }

    @FXML public void Home_Entered() {
        Home_ID.setText("");
        Home_Button.setPrefWidth(300);
    }

    @FXML public void Home_MouseExited() {
        Home_ID.setText("Home");
        Home_Button.setPrefWidth(33);

    }

    @FXML public void Guidance_MouseExited() {
        Guidance_ID.setText("Guidance");
        Guidance_Button.setPrefWidth(33);
    }

   @FXML public void Guidance_MouseEntered() {
        Guidance_ID.setText("");
        Guidance_Button.setPrefWidth(300);
    }

    @FXML public void Library_MouseEntered(MouseEvent mouseEvent) {
        Library_ID.setText("");
        Library_Button.setPrefWidth(300);
    }

    @FXML public void Library_MouseExited(MouseEvent mouseEvent) {
        Library_ID.setText("Library");
        Library_Button.setPrefWidth(33);
    }

    @FXML public void Canteen_MouseEntered(MouseEvent mouseEvent) {
        Canteen_ID.setText("");
        Canteen_Button.setPrefWidth(300);
    }

    @FXML public void Canteen_MouseExited(MouseEvent mouseEvent) {
        Canteen_ID.setText("Canteen");
        Canteen_Button.setPrefWidth(33);
    }


    @FXML public void SendMessage_MouseEntered(MouseEvent mouseEvent) {
        SendMessage_ID.setText("");
        SendMessage_Button.setPrefWidth(300);
    }

    @FXML public void SendMessage_MouseExited(MouseEvent mouseEvent) {
        SendMessage_ID.setText("Send Message");
        SendMessage_Button.setPrefWidth(33);
    }

    @FXML public void Logout_MouseEntered(MouseEvent mouseEvent) {
        Logout_ID.setText("");
        Logout_Button.setPrefWidth(300);
    }

    @FXML  public void Logout_MouseExited(MouseEvent mouseEvent) {
        Logout_ID.setText("Logout");
        Logout_Button.setPrefWidth(33);
    }

    /**
     *
     *
     *
     *
     *
     * End of Deisgn Button
     *
     *
     *
     *
     */



}
