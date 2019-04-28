package DataBase;

import Data_Model.Books_DataModel;

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
    private static final String Db_Path = "jdbc:sqlite:C:\\Users\\orioque35\\Desktop\\School_System\\Barcode\\src\\DataBase\\" + Db_Name;
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
    private static final String SCHOOL_INFORMATION_ID = STUDENT_INFORMATION_ID;
    private static final String STUDENT_SECTION = "STUDENT_SECTION";
    private static final String STUDENT_ADVISER = "STUDENT_ADVISER";
    private static final String STUDENT_LOCATION = "STUDENT_LOCATION";
    /**
     * END OF STUDENT_SCHOOL_INFORMATION;
     */
////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////
    /**
     * START OF TEACHER PERSONAL INFORMATION
     */
    private static final String TEACHER_INFORMATION_ID = "TEACHER_INFORMATION_ID";
    private static final String TEACHER_LAST_NAME = "TEACHER_LAST_NAME";
    private static final String TEACHER_FIRST_NAME = "TEACHER_FIRST_NAME";
    private static final String TEACHER_MIDDLE_NAME = "TEACHER_MIDDLE_NAME";
    private static final String TEACHER_STREET_ADDRESS = "TEACHER_STREET_ADDRESS";
    private static final String TEACHER_BARANGAY_ADDRESS = "TEACHER_BARANGAY_ADDRESS";
    private static final String TEACHER_MUNICIPALITY_ADDRESS = "TEACHER_MUNICIPALITY_ADDRESS";

    /**
     * END OF TEACHER PERSONAL INFORMATION
     */
////////////////////////////////////////////////////////

/////////////////////////////////////////////////////////
    /**
     * START OF TEACHER SCHOOL INFORMATION
     */
    private static final String TEACHER_SCHOOL_ID = TEACHER_INFORMATION_ID;
    private static final String TEACHER_SALARY = "TEACHER_SALARY";
    private static final String TEACHER_ASSIGN_SECTION = "TEACHER_ASSIGN_SECTION";
    private static final String TEACHER_MAJOR = "TEACHER_MAJOR";
    private static final String TEACHER_POSITION = "TEACHER_POSITION";
    private static final String TEACHER_TITLE = "TEACHER_TITLE";
    private static final String TEACHER_FACULTY_LOCAITON = "TEACHER_FACULTY_LOCATION";
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

    private static final String SCHOOL_LIBRARY_BOOKS = "SCHOOL_LIBRARY_BOOKS";
    private static final String SCHOOL_SECTION = "SCHOOL_SECTION";
    private static final String STUDENT_PERSONAL_INFORMATION = "STUDENT_PERSONAL_INFORMATION";
    private static final String STUDENT_SCHOOL_INFORMATION = "STUDENT_SCHOOL_INFORMATION";
    private static final String TEACHER_PERSONAL_INFORMATION = "TEACHER_PERSONAL_INFORMATINO";
    private static final String TEACHER_SCHOOL_INFORMATION = "TEACHER_SCHOOL_INFORMATION";

    /**
     * End of DATABASE TABLE
     */

    /**
     * Start of Observable List
     */
    private static ObservableList<Books_DataModel> Books = FXCollections.observableArrayList();
    private static ObservableList<String> Book_Genre_Item = FXCollections.observableArrayList();

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

    private static Statement Create_Statement() throws SQLException {
        Statement statement = conn.createStatement();

        return statement;
    }


    public static ObservableList<Books_DataModel> get_Books(String value, int number) throws SQLException {

        Table_Query(value, number);

        return Books;
    }

    private static void Table_Query(String value, int number) throws SQLException {
        open();

        resultSet = Create_Statement().executeQuery("SELECT * FROM " + SCHOOL_LIBRARY_BOOKS );


        Insert_Book_Data(resultSet);
        resultSet.close();


        close();


        //        if (value.equals("null")) {
//
//            if (number == 0) {
//
//
//            }
//
//        }


    }

/*
    else if (number == 1) {

        resultSet = Create_Statement().executeQuery("SELECT * FROM " + SCHOOL_LIBRARY_BOOKS + " WHERE " + BOOK_QUANTITY + " != 0");

    }

} else {

        if (number == 0) {

        resultSet = Create_Statement().executeQuery("SELECT * FROM " + SCHOOL_LIBRARY_BOOKS + " WHERE " + BOOK_GENRE
        + " = '" + value + "' AND " + BOOK_QUANTITY + " == 0");

        } else if (number == 1) {

        resultSet = Create_Statement().executeQuery("SELECT * FROM " + SCHOOL_LIBRARY_BOOKS + " WHERE " + BOOK_GENRE
        + " = '" + value + "' AND " + BOOK_QUANTITY + " != 0");

        }
*/


private static void Insert_Book_Data(ResultSet resultSet) throws SQLException {
//        Book_Genre_Item.clear();
        Books.clear();
        while (resultSet.next()) {

            int id = resultSet.getInt(1);
            String genre = resultSet.getString(2);
            String title = resultSet.getString(3);
            String author = resultSet.getString(4);
            String publisher = resultSet.getString(5);
            String date_published = resultSet.getString(6);
            String edition = resultSet.getString(7);
            String quantity = resultSet.getString(8);
            String location = resultSet.getString(9);
            String about = resultSet.getString(10);
            int quantity_pages = resultSet.getInt(11);
            String abridged = resultSet.getString(12);

            Books.add(new Books_DataModel(id, genre, title, author, publisher, date_published, edition
                    , quantity, location, about, quantity_pages, abridged));

        }

    }
        public static ObservableList Book_Genre_Item () throws SQLException {
            Book_Genre_Item.clear();
            Book_Genre_Item.add("All");
            open();

            resultSet = Create_Statement().executeQuery("SELECT * FROM " + SCHOOL_LIBRARY_BOOKS);

            while (resultSet.next()) {

                String genre = resultSet.getString(2);
                Book_Genre_Item.add(genre);

            }

            resultSet.close();

            close();

            return Book_Genre_Item;
        }

        public static ObservableList Choice_Box(String value,int number) throws SQLException {

            Table_Query(value, number);


            return Books;

        }

        public static void AddBook(String genre, String title,String author, String publisher, String datepublished
        , String edition, String photo, String location, String about, int pages,String abridged, String available){
            open();


            try (Statement statement = Create_Statement()){

                statement.execute("INSERT INTO " + SCHOOL_LIBRARY_BOOKS + "(BOOK_GENRE,BOOK_TITLE,BOOK_AUTHOR" +
                        ", BOOK_PUBLISHER,BOOK_DATE_PUBLISHED,BOOK_EDITION,BOOK_PHOTO, BOOK_LOCATION,BOOK_ABOUT, BOOK_QUANTITY_PAGES" +
                        ",BOOK_ABRIDGED,BOOK_AVAILABLE) VALUES ( '" + genre + "' , '"+ title +"' , '"+ author + "' , '"+ publisher +"'" +
                        ", '"+datepublished+"' , '"+ edition +"', '"+ photo + "', '"+ location +"' , '"+ about +"', '"+pages +"'"+
                        ", '"+ abridged+"', '"+ available +"'"+")");
                System.out.println("success");
            }catch (SQLException e){
                e.printStackTrace();
            }

            close();


        }

        public static ObservableList<Books_DataModel> getBooks () {
            return Books;
        }

        public static ObservableList<String> getBook_Genre_Item () {
            return Book_Genre_Item;
        }
    }

