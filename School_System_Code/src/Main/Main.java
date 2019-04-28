package Main;


import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{



        String path = "Login_Ui.fxml";
        Parent root = FXMLLoader.load(getClass().getResource(path));
            primaryStage.setTitle("BarCode Sample");
            primaryStage.setScene(new Scene(root));
        primaryStage.show();
        primaryStage.centerOnScreen();


}

    public static void main(String[] args) {
        launch(args);
//        DataBase_Commands.open();
//        DataBase_Commands.Register_Student("kurt","Concepcion","Oriqoue","EasterView", 93812,
//                1234,"kurtorioque112@gmail.com",911312832,"Female",2,"Mahogany", "Andr"
//        ,"Concepcion", "Orioque","I don't know", "Burt","Avenido"
//        ,"Orioque","wla na", 1234, "true",9999);

//        DataBase_Commands.Insert_Table_Student();
    }
}
