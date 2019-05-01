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

    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty first_name = new SimpleStringProperty();
    private SimpleStringProperty middle_name = new SimpleStringProperty();
    private SimpleStringProperty last_name = new SimpleStringProperty();
    private SimpleStringProperty street = new SimpleStringProperty();
    private SimpleStringProperty barangay = new SimpleStringProperty();
    private SimpleStringProperty municipality = new SimpleStringProperty();
    private SimpleStringProperty salary = new SimpleStringProperty();
    private SimpleStringProperty assign_section = new SimpleStringProperty();
    private SimpleStringProperty major = new SimpleStringProperty();
    private SimpleStringProperty position = new SimpleStringProperty();
    private SimpleStringProperty title = new SimpleStringProperty();
    private SimpleStringProperty faculty_location = new SimpleStringProperty();
    private SimpleStringProperty status = new SimpleStringProperty();


    public Teacher_DataModel(int id, String first_name, String middle_name,String last_name, String street,String barangay, String municipality, String salary, String assign_section, String major, String position, String title, String faculty_location,
                             String status) {

        this.id.set(id);
        this.title.set(title);
        this.status.set(status);

        this.first_name.set(first_name);
        this.middle_name.set(middle_name);
        this.last_name.set(last_name);

        this.street.set(street);
        this.barangay.set(barangay);
        this.municipality.set(municipality);

        this.salary.set(salary);
        this.assign_section.set(assign_section);
        this.major.set(major);
        this.position.set(position);


        this.faculty_location.set(faculty_location);

    }


    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getFirst_name() {
        return first_name.get();
    }

    public SimpleStringProperty first_nameProperty() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name.set(first_name);
    }

    public String getMiddle_name() {
        return middle_name.get();
    }

    public SimpleStringProperty middle_nameProperty() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name.set(middle_name);
    }

    public String getLast_name() {
        return last_name.get();
    }

    public SimpleStringProperty last_nameProperty() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name.set(last_name);
    }

    public String getStreet() {
        return street.get();
    }

    public SimpleStringProperty streetProperty() {
        return street;
    }

    public void setStreet(String street) {
        this.street.set(street);
    }

    public String getBarangay() {
        return barangay.get();
    }

    public SimpleStringProperty barangayProperty() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay.set(barangay);
    }

    public String getMunicipality() {
        return municipality.get();
    }

    public SimpleStringProperty municipalityProperty() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality.set(municipality);
    }

    public String getAssign_section() {
        return assign_section.get();
    }

    public SimpleStringProperty assign_sectionProperty() {
        return assign_section;
    }

    public void setAssign_section(String assign_section) {
        this.assign_section.set(assign_section);
    }

    public String getMajor() {
        return major.get();
    }

    public SimpleStringProperty majorProperty() {
        return major;
    }

    public void setMajor(String major) {
        this.major.set(major);
    }

    public String getPosition() {
        return position.get();
    }

    public SimpleStringProperty positionProperty() {
        return position;
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public String getTitle() {
        return title.get();
    }

    public SimpleStringProperty titleProperty() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getFaculty_location() {
        return faculty_location.get();
    }

    public SimpleStringProperty faculty_locationProperty() {
        return faculty_location;
    }

    public void setFaculty_location(String faculty_location) {
        this.faculty_location.set(faculty_location);
    }

    public String getSalary() {
        return salary.get();
    }

    public SimpleStringProperty salaryProperty() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary.set(salary);
    }

    public String getStatus() {
        return status.get();
    }

    public SimpleStringProperty statusProperty() {
        return status;
    }

    public void setStatus(String status) {
        this.status.set(status);
    }
}
