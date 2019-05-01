package Alerts;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Optional;

public final class AlertType {
    private AlertType(){

    }

    public static void Alert_Infromation(String title, String name){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText( name );
        alert.show();
    }

    public static void Alert_Error(String title, String name){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText( name );
        alert.show();
    }
    public static int Alert_Confrimation(String title, String name){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText( title );
        alert.setContentText( name );
        alert.show();

        if(ButtonType.OK.equals(alert.getButtonTypes()))return 1;

        return 0;


    }



}
