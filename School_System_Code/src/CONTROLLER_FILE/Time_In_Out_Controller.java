package CONTROLLER_FILE;
/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Time_In_Out_Controller {

    @FXML private Label Name, Time, Date;
    @FXML private ImageView picture;
    @FXML private GridPane parent1;
    private DateTimeFormatter Date_format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    private DateTimeFormatter Time_format = DateTimeFormatter.ofPattern("h : m : s : a");
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();

    String Time_Now = Time_format.format(localTime);
    String Date_Now = Date_format.format(localDate);


    public void initialize(){

        Time.setText(Time_Now);
        Date.setText(Date_Now);

        Runnable runnable = () -> {

            try {
                Thread.sleep(2000);
                Platform.runLater(() -> {

                    Stage stage = (Stage) parent1.getScene().getWindow();


                    stage.close();

                });
            }catch (InterruptedException e){

            }

        };

        new Thread(runnable).start();

    }

    public void setName(String name){
        Name.setText(name);
    }

    public void Set_Picture(String path){
        picture.setImage(new Image(path));
    }


}

