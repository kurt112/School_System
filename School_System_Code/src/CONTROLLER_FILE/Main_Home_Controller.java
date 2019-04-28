package CONTROLLER_FILE;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */
public class Main_Home_Controller{

    @FXML private Label Time,Date;
    private DateTimeFormatter Date_format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    private DateTimeFormatter Time_format = DateTimeFormatter.ofPattern("h : m : s : a");
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.now();

    String Time_now = Time_format.format(localTime);
    String Date_Now = Date_format.format(localDate);

    public void  initialize() {


        Runnable task = () -> {
            try {
                while (true){
                    Thread.sleep(1000);
                    Platform.runLater(() -> {

                        LocalDate localDate = LocalDate.now();
                        LocalTime localTime = LocalTime.now();

                        Time.setText(Time_format.format(localTime));
                        Date.setText(Date_format.format(localDate));


                        this.Time_now = Time_now;
                        this.Date_Now = Date_Now;
                    });

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        new Thread(task).start();

        try {
            Thread.sleep(5000);
            System.out.println(Time_now);
            System.out.println(Date_Now);
        }catch (InterruptedException e){

        }

    }


}
