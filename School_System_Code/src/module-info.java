module Barcode {
    //Components of Javafx
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.swt;
    requires javafx.media;
    requires javafx.swing;



    //For UI
    requires com.jfoenix;
//    requires ConnectCodeBarcodeFontLibrary;
    //requires fontawesomefx;

    //Jar to Db
    requires sqlite.jdbc;
    requires java.sql;
    //requires javafx.controls.com.sun.javafx.scene.control.behavior;

    //I created Packages

    opens Pictures;
    opens Main;
    opens Data_Model;
    opens CONTROLLER_FILE;
    opens CssFile;
    opens DataBase;
    opens FXML_FILE;
    opens Alerts;



}