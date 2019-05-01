package DataBase;

import Alerts.AlertType;
import Data_Model.Books_DataModel;
import Data_Model.Teacher_DataModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 24, 2019
 * Time: 18: 24
 * User: orioque35
 */

public class DataBase_Commands {


//////////////////////////////////////////////////////
    /**
     * Database Path
     */

    private static final String Db_Name = "SCHOOL_INFORMATION.db";
    private static final String Db_Path = "jdbc:sqlite:C:\\Users\\orioque35\\Desktop\\School_System\\School_System_Code\\src\\DataBase\\"+ Db_Name;
    private static Connection conn;
    private static ResultSet resultSet;


    /**
     * End of Database path
     */
////////////////////////////////////////////////////////


////////////////////////////////////////////////////////
    /**
     * DATABASE TABLE FIELD
     */

    /**
     * SCHOOL LIBRARY BOOKS FIELD
     */

    private static final String BOOK_ID = "BOOK_ID";
    private static final String BOOK_GENRE = "BOOK_GENRE";
    private static final String BOOK_TITLE = "BOOK_TITLE";
    private static final String BOOK_AUTHOR = "BOOK_AUTHOR";
    private static final String BOOK_PUBLISHER = "BOOK_PUBLISHER";
    private static final String BOOK_DATE_PUBLISHED = "BOOK_DATE_PUBLISHED";
    private static final String BOOK_EDITION = "BOOK_EDITION";
    private static final String BOOK_QUANTITY_PAGES = "BOOK_QUANTITY_PAGES";
    private static final String BOOK_LOCATION = "BOOK_LOCATION";
    private static final String BOOK_PHOTO = "BOOK_PHOTO";
    private static final String BOOOK_ABRIDGED = "BOOK_ABRIDGED";
    private static final String Book_ISSUED = "Issued";
    private static final String Book_Available = "Available";

    /**
     *  END OF SCHOOL LIBRARY
     */
////////////////////////////////////////////////////////

////////////////////////////////////////////////////////
    /**
     * START OF SCHOOL SECTION
     */

    private static final String SECTION_ID = "SECTION_ID";
    private static final String SECTION_NAME = "SECTION_NAME";
    private static final String SECTION_ASSIGN_TEACHER = "SECTION_ASSIGN_TEACHER";
    private static final String SECTION_LOCATION = "SECTION_LOCATION";
    private static final String SECTION_VOLUME = "SECTION_VOLUME";
    private static final String SECTION_GRADE = "SECTION_GRADE";

    /**
     * END OF SCHOOL SECTION
     */
////////////////////////////////////////////////////////

////////////////////////////////////////////////////////
    /**
     * START OF STUDENT_PERSONAL_INFORMATION
     */
    private static final String STUDENT_INFORMATION_ID = "STUDENT_INFORMATION_ID";
    /**
     * END OF STUDENT_PERSONAL_INFORMATION
     */
/////////////////////////////////////////////////////////
    /**
     * START OF STUDENT_SCHOOL_INFORMATION
     */
//    private static final String SCHOOL_INFORMATION_ID = STUDENT_INFORMATION_ID;
//    private static final String STUDENT_SECTION = "STUDENT_SECTION";
//    private static final String STUDENT_ADVISER = "STUDENT_ADVISER";
//    private static final String STUDENT_LOCATION = "STUDENT_LOCATION";
    /**
     * END OF STUDENT_SCHOOL_INFORMATION;
     */
////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////
    /**
     * START OF TEACHER PERSONAL INFORMATION
     */
//    private static final String TEACHER_INFORMATION_ID = "TEACHER_INFORMATION_ID";
//    private static final String TEACHER_LAST_NAME = "TEACHER_LAST_NAME";
//    private static final String TEACHER_FIRST_NAME = "TEACHER_FIRST_NAME";
//    private static final String TEACHER_MIDDLE_NAME = "TEACHER_MIDDLE_NAME";
//    private static final String TEACHER_STREET_ADDRESS = "TEACHER_STREET_ADDRESS";
//    private static final String TEACHER_BARANGAY_ADDRESS = "TEACHER_BARANGAY_ADDRESS";
//    private static final String TEACHER_MUNICIPALITY_ADDRESS = "TEACHER_MUNICIPALITY_ADDRESS";

    /**
     * END OF TEACHER PERSONAL INFORMATION
     */
////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////
    /**
     * START OF TEACHER SCHOOL INFORMATION
     */
//    private static final String TEACHER_SCHOOL_ID = TEACHER_INFORMATION_ID;
//    private static final String TEACHER_SALARY = "TEACHER_SALARY";
//    private static final String TEACHER_ASSIGN_SECTION = "TEACHER_ASSIGN_SECTION";
//    private static final String TEACHER_MAJOR = "TEACHER_MAJOR";
//    private static final String TEACHER_POSITION = "TEACHER_POSITION";
//    private static final String TEACHER_TITLE = "TEACHER_TITLE";
//    private static final String TEACHER_FACULTY_LOCAITON = "TEACHER_FACULTY_LOCATION";
    /**
     * END OF TEACHER SCHOOL INFORMATION
     */
////////////////////////////////////////////////////////


    /**
     *  END OF DATABASE TABLE FIELD
     */


    /**
     * Data Base Table
     */

//    private static final String SCHOOL_LIBRARY_BOOKS = "SCHOOL_LIBRARY_BOOKS";
//    private static final String SCHOOL_SECTION = "SCHOOL_SECTION";
//    private static final String STUDENT_PERSONAL_INFORMATION = "STUDENT_PERSONAL_INFORMATION";
//    private static final String STUDENT_SCHOOL_INFORMATION = "STUDENT_SCHOOL_INFORMATION";
//    private static final String TEACHER_PERSONAL_INFORMATION = "TEACHER_PERSONAL_INFORMATINO";
//    private static final String TEACHER_SCHOOL_INFORMATION = "TEACHER_SCHOOL_INFORMATION";

    /**
     * End of DATABASE TABLE
     */

    /**
     * Start of Observable List
     */

    private static ObservableList<Books_DataModel> Books = FXCollections.observableArrayList();
    private static ObservableList<String> Book_Genre_Item = FXCollections.observableArrayList();
    private static ObservableList<Teacher_DataModel>Teacher_Data = FXCollections.observableArrayList();

    /**
     * End of Observable List
     */

    private DataBase_Commands() {

    }

    private static boolean open() {

        try {
            conn = DriverManager.getConnection(Db_Path);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();

            return false;
        }

    }

    private static void close() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Statement Create_Statement() {

        try {
            Statement statement = conn.createStatement();
            return statement;

        }catch(SQLException e){

            e.printStackTrace();

        }

        return null;
    }

    /*
     *
     *
     *
     *
     * Start of Query in Books
     *
     *
     *
     *
     *
     */

    public static ObservableList<Books_DataModel> get_Books(String value, int number){

        Books_TableQuery(value, number);

        return Books;
    }

    private static void Books_TableQuery(String value, int number) {
        open();

        try {

            if (value.equals("null")) {

                if (number == 0) {
                    resultSet = Create_Statement().executeQuery("SELECT * FROM SCHOOL_LIBRARY_BOOKS WHERE BOOK_AVAILABLE = '"+Book_ISSUED+"'");

                } else if (number == 1) {
                    resultSet = Create_Statement().executeQuery("SELECT * FROM SCHOOL_LIBRARY_BOOKS WHERE BOOK_AVAILABLE = '"+Book_Available+"'");
                }

            } else{

                if(number==0){

                    resultSet=Create_Statement().executeQuery("SELECT * FROM SCHOOL_LIBRARY_BOOKS WHERE BOOK_AVAILABLE = '"+Book_ISSUED+"'"+
                            "AND BOOK_GENRE = '" + value +"'");

                }else if(number==1){

                    resultSet=Create_Statement().executeQuery("SELECT * FROM SCHOOL_LIBRARY_BOOKS WHERE BOOK_AVAILABLE = '"+Book_Available+"'"+
                            "AND BOOK_GENRE = '" + value +"'");
                }
            }

            Insert_Book_Data(resultSet);
            resultSet.close();
        }catch (SQLException e){
            e.printStackTrace();
        }


        close();

    }




    private static void Insert_Book_Data(ResultSet resultSet){

        Books.clear();

        try {
            while (resultSet.next()) {

                int id = resultSet.getInt(1);
                String genre = resultSet.getString(2);
                String title = resultSet.getString(3);
                String author = resultSet.getString(4);
                String publisher = resultSet.getString(5);
                String date_published = resultSet.getString(6);
                String edition = resultSet.getString(7);
                int quantity = resultSet.getInt(8);
                String location = resultSet.getString(9);
                String about = resultSet.getString(10);
                String photo = resultSet.getString(11);
                String abridged = resultSet.getString(12);
                String avail = resultSet.getString(13);
                Books.add(new Books_DataModel(id,genre,title,author,publisher,date_published,edition,photo
                        ,about,location,quantity,abridged,avail));

            }

        }catch (SQLException e){

        }

    }
    public static ObservableList Book_Genre_Item () {
        Book_Genre_Item.clear();

        open();

       try {
           resultSet = Create_Statement().executeQuery("SELECT * FROM SCHOOL_LIBRARY_BOOKS");
           while (resultSet.next()) {

               String genre = resultSet.getString(2);

               if(!Book_Genre_Item.contains(genre)) Book_Genre_Item.add(genre);



           }

           resultSet.close();

       }catch (SQLException e){

       }


        close();

        return Book_Genre_Item;
    }

    public static ObservableList Choice_Box(String value,int number) throws SQLException {

        Books_TableQuery(value, number);


        return Books;

    }

    public static void AddBook(String genre, String title,String author, String publisher, String datepublished
            , String edition, String photo, String location, String about, int pages,String abridged, String available){
        open();


        try (Statement statement = Create_Statement()){

            statement.execute("INSERT INTO SCHOOL_LIBRARY_BOOKS (BOOK_GENRE,BOOK_TITLE,BOOK_AUTHOR" +
                    ", BOOK_PUBLISHER,BOOK_DATE_PUBLISHED,BOOK_EDITION,BOOK_PHOTO, BOOK_LOCATION,BOOK_ABOUT, BOOK_QUANTITY_PAGES" +
                    ",BOOK_ABRIDGED,BOOK_AVAILABLE) VALUES ( '" + genre + "' , '"+ title +"' , '"+ author + "' , '"+ publisher +"'" +
                    ", '"+datepublished+"' , '"+ edition +"', '"+ photo + "', '"+ location +"' , '"+ about +"', '"+pages +"'"+
                    ", '"+ abridged+"', '"+ available +"'"+")");

        }catch (SQLException e){
            e.printStackTrace();
        }

        close();


    }

    public static void Update_Book(String genre, String title,String author, String publisher, String datepublished
            , String edition, String photo, String location, String about, int pages,String abridged, int id){

        open();


        try (Statement statement = Create_Statement()){

            statement.execute("UPDATE SCHOOL_LIBRARY_BOOKS SET BOOK_GENRE ='"+ genre +"' ,"
                    + " BOOK_TITLE ='"+ title+ "', BOOK_AUTHOR ='"+ author + "', "
                    + " BOOK_PUBLISHER ='"+ publisher + "', BOOK_DATE_PUBLISHED ='"+ datepublished+ "', "
                    + " BOOK_EDITION = '"+ edition + "', BOOK_QUANTITY_PAGES ='"+ pages+ "', "
                    + " BOOK_LOCATION ='"+ location+ "', BOOK_ABOUT ='"+ about+ "', "
                    + " BOOK_PHOTO ='"+ photo+ "', BOOK_ABRIDGED ='"+ abridged + "' WHERE BOOK_ID = " + id);


            AlertType.Alert_Infromation("Update Successful", " Changes Applied");
        }catch (SQLException e){
            e.printStackTrace();
            AlertType.Alert_Error(" Update Unsuccessful"," Missing inputs ");
        }

        close();


    }

    public static ObservableList<Books_DataModel> getBooks () {
        return Books;
    }

    public static ObservableList<String> getBook_Genre_Item () {
        return Book_Genre_Item;
    }

    /*
     *
     *
     *
     *
     * End of Query in Books
     *
     *
     *
     *
     *
     */




    /*
     *
     *
     *
     *
     * Start of Query in Teacher
     *
     *
     *
     *
     *
     */

    public static void Teacher_Table_Query(){
        open();
        Teacher_Data.clear();
        try {

            resultSet = Create_Statement().executeQuery("SELECT * FROM TEACHER_PERSONAL_INFORMATION INNER JOIN TEACHER_SCHOOL_INFORMATION\n" +
                    "ON TEACHER_SCHOOL_INFORMATION.TEACHER_INFORMATION_ID = TEACHER_PERSONAL_INFORMATION.TEACHER_INFORMATION_ID WHERE TEACHER_SCHOOL_INFORMATION.TEACHER_STATUS = 'Active'");
            while (resultSet.next()){

                String last_name = resultSet.getString(2);
                String first_name = resultSet.getString(3);
                String middle_name = resultSet.getString(4);
                String street = resultSet.getString(5);
                int id = resultSet.getInt(1);
                String barangay = resultSet.getString(6);
                String municiplaity = resultSet.getString(7);
                String salary = resultSet.getString(9);
                String assign_section = resultSet.getString(10);
                String major = resultSet.getString(11);
                String position= resultSet.getString(12);
                String title = resultSet.getString(13);
                String faculty_location = resultSet.getString(14);
                String status = resultSet.getString(15);

                Teacher_Data.add(new Teacher_DataModel(id,first_name,middle_name,last_name,street,barangay,municiplaity
               ,salary, assign_section,major,position,title,faculty_location, status));
            }

        }catch (SQLException e){

        }

        close();

    }

    public static ObservableList<Teacher_DataModel> getTeacher_Data() {
        return Teacher_Data;
    }

    /*
     *
     *
     *
     *
     * End of Query in Teach
     *
     *
     *
     *
     *
     */





}