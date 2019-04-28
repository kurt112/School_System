package Data_Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 25, 2019
 * Time: 16: 55
 * User: orioque35
 */

public class Teacher_DataModel {

    private SimpleIntegerProperty ID = new SimpleIntegerProperty();
    private SimpleStringProperty First_Name = new SimpleStringProperty();
    private SimpleStringProperty Middle_Name = new SimpleStringProperty();
    private SimpleStringProperty Last_Name = new SimpleStringProperty();
    private SimpleStringProperty Street = new SimpleStringProperty();
    private SimpleStringProperty Barangay = new SimpleStringProperty();
    private SimpleStringProperty Municipality = new SimpleStringProperty();
    private SimpleIntegerProperty Salary = new SimpleIntegerProperty();
    private SimpleStringProperty Assign_Section = new SimpleStringProperty();
    private SimpleStringProperty Major = new SimpleStringProperty();
    private SimpleStringProperty Position = new SimpleStringProperty();
    private SimpleStringProperty Title = new SimpleStringProperty();
    private SimpleStringProperty Faculty_Location = new SimpleStringProperty();


    public Teacher_DataModel(SimpleIntegerProperty ID, SimpleStringProperty first_Name, SimpleStringProperty middle_Name, SimpleStringProperty last_Name, SimpleStringProperty street, SimpleStringProperty barangay, SimpleStringProperty municipality, SimpleIntegerProperty salary, SimpleStringProperty assign_Section, SimpleStringProperty major, SimpleStringProperty position, SimpleStringProperty title, SimpleStringProperty faculty_Location) {
        this.ID = ID;
        First_Name = first_Name;
        Middle_Name = middle_Name;
        Last_Name = last_Name;
        Street = street;
        Barangay = barangay;
        Municipality = municipality;
        Salary = salary;
        Assign_Section = assign_Section;
        Major = major;
        Position = position;
        Title = title;
        Faculty_Location = faculty_Location;
    }

    public int getID() {
        return ID.get();
    }

    public SimpleIntegerProperty IDProperty() {
        return ID;
    }

    public void setID(int ID) {
        this.ID.set(ID);
    }

    public String getFirst_Name() {
        return First_Name.get();
    }

    public SimpleStringProperty first_NameProperty() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.First_Name.set(first_Name);
    }

    public String getMiddle_Name() {
        return Middle_Name.get();
    }

    public SimpleStringProperty middle_NameProperty() {
        return Middle_Name;
    }

    public void setMiddle_Name(String middle_Name) {
        this.Middle_Name.set(middle_Name);
    }

    public String getLast_Name() {
        return Last_Name.get();
    }

    public SimpleStringProperty last_NameProperty() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.Last_Name.set(last_Name);
    }

    public String getStreet() {
        return Street.get();
    }

    public SimpleStringProperty streetProperty() {
        return Street;
    }

    public void setStreet(String street) {
        this.Street.set(street);
    }

    public String getBarangay() {
        return Barangay.get();
    }

    public SimpleStringProperty barangayProperty() {
        return Barangay;
    }

    public void setBarangay(String barangay) {
        this.Barangay.set(barangay);
    }

    public String getMunicipality() {
        return Municipality.get();
    }

    public SimpleStringProperty municipalityProperty() {
        return Municipality;
    }

    public void setMunicipality(String municipality) {
        this.Municipality.set(municipality);
    }

    public int getSalary() {
        return Salary.get();
    }

    public SimpleIntegerProperty salaryProperty() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary.set(salary);
    }

    public String getAssign_Section() {
        return Assign_Section.get();
    }

    public SimpleStringProperty assign_SectionProperty() {
        return Assign_Section;
    }

    public void setAssign_Section(String assign_Section) {
        this.Assign_Section.set(assign_Section);
    }

    public String getMajor() {
        return Major.get();
    }

    public SimpleStringProperty majorProperty() {
        return Major;
    }

    public void setMajor(String major) {
        this.Major.set(major);
    }

    public String getPosition() {
        return Position.get();
    }

    public SimpleStringProperty positionProperty() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position.set(position);
    }

    public String getTitle() {
        return Title.get();
    }

    public SimpleStringProperty titleProperty() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title.set(title);
    }

    public String getFaculty_Location() {
        return Faculty_Location.get();
    }

    public SimpleStringProperty faculty_LocationProperty() {
        return Faculty_Location;
    }

    public void setFaculty_Location(String faculty_Location) {
        this.Faculty_Location.set(faculty_Location);
    }
}
