package Data_Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student_Data_Model {

    private SimpleStringProperty First_Name = new SimpleStringProperty();
    private SimpleStringProperty Middle_Name = new SimpleStringProperty();
    private SimpleStringProperty Last_Name = new SimpleStringProperty();
    private SimpleStringProperty Address = new SimpleStringProperty();
    private SimpleStringProperty Phone_Number = new SimpleStringProperty();
    private SimpleStringProperty Cellphone_Number = new SimpleStringProperty();
    private SimpleStringProperty Email = new SimpleStringProperty();
    private SimpleLongProperty Lrn = new SimpleLongProperty();
    private SimpleStringProperty Sex = new SimpleStringProperty();
    private SimpleIntegerProperty Year_Level = new SimpleIntegerProperty();
    private SimpleStringProperty Section = new SimpleStringProperty();

    /**
     *Student Family Information;
     */

    private SimpleStringProperty Mother_First_Name  = new SimpleStringProperty();
    private SimpleStringProperty Mother_Middle_Name = new SimpleStringProperty();
    private SimpleStringProperty Mother_Last_Name = new SimpleStringProperty();
    private SimpleStringProperty Mother_Occupation = new SimpleStringProperty();

    private SimpleStringProperty Father_First_Name = new SimpleStringProperty();
    private SimpleStringProperty Father_Middle_Name = new SimpleStringProperty();
    private SimpleStringProperty Father_Last_Name = new SimpleStringProperty();
    private SimpleStringProperty Father_Occupation = new SimpleStringProperty();

    private SimpleIntegerProperty Total_Salary = new SimpleIntegerProperty();

    public Student_Data_Model(SimpleStringProperty first_Name, SimpleStringProperty middle_Name, SimpleStringProperty last_Name,
                              SimpleStringProperty address, SimpleStringProperty phone_Number, SimpleStringProperty cellphone_Number,
                              SimpleStringProperty email, SimpleLongProperty lrn, SimpleStringProperty sex, SimpleIntegerProperty year_Level,
                              SimpleStringProperty section, SimpleStringProperty mother_First_Name, SimpleStringProperty mother_Middle_Name,
                              SimpleStringProperty mother_Last_Name, SimpleStringProperty mother_Occupation, SimpleStringProperty father_First_Name,
                              SimpleStringProperty father_Middle_Name, SimpleStringProperty father_Last_Name, SimpleStringProperty father_Occupation,
                              SimpleIntegerProperty total_Salary) {

        First_Name = first_Name;
        Middle_Name = middle_Name;
        Last_Name = last_Name;
        Address = address;
        Phone_Number = phone_Number;
        Cellphone_Number = cellphone_Number;
        Email = email;
        Lrn = lrn;
        Sex = sex;
        Year_Level = year_Level;
        Section = section;
        Mother_First_Name = mother_First_Name;
        Mother_Middle_Name = mother_Middle_Name;
        Mother_Last_Name = mother_Last_Name;
        Mother_Occupation = mother_Occupation;
        Father_First_Name = father_First_Name;
        Father_Middle_Name = father_Middle_Name;
        Father_Last_Name = father_Last_Name;
        Father_Occupation = father_Occupation;
        Total_Salary = total_Salary;
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

    public String getAddress() {
        return Address.get();
    }

    public SimpleStringProperty addressProperty() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address.set(address);
    }

    public String getPhone_Number() {
        return Phone_Number.get();
    }

    public SimpleStringProperty phone_NumberProperty() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        this.Phone_Number.set(phone_Number);
    }

    public String getCellphone_Number() {
        return Cellphone_Number.get();
    }

    public SimpleStringProperty cellphone_NumberProperty() {
        return Cellphone_Number;
    }

    public void setCellphone_Number(String cellphone_Number) {
        this.Cellphone_Number.set(cellphone_Number);
    }

    public String getEmail() {
        return Email.get();
    }

    public SimpleStringProperty emailProperty() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email.set(email);
    }

    public long getLrn() {
        return Lrn.get();
    }

    public SimpleLongProperty lrnProperty() {
        return Lrn;
    }

    public void setLrn(long lrn) {
        this.Lrn.set(lrn);
    }

    public String getSex() {
        return Sex.get();
    }

    public SimpleStringProperty sexProperty() {
        return Sex;
    }

    public void setSex(String sex) {
        this.Sex.set(sex);
    }

    public int getYear_Level() {
        return Year_Level.get();
    }

    public SimpleIntegerProperty year_LevelProperty() {
        return Year_Level;
    }

    public void setYear_Level(int year_Level) {
        this.Year_Level.set(year_Level);
    }

    public String getSection() {
        return Section.get();
    }

    public SimpleStringProperty sectionProperty() {
        return Section;
    }

    public void setSection(String section) {
        this.Section.set(section);
    }

    public String getMother_First_Name() {
        return Mother_First_Name.get();
    }

    public SimpleStringProperty mother_First_NameProperty() {
        return Mother_First_Name;
    }

    public void setMother_First_Name(String mother_First_Name) {
        this.Mother_First_Name.set(mother_First_Name);
    }

    public String getMother_Middle_Name() {
        return Mother_Middle_Name.get();
    }

    public SimpleStringProperty mother_Middle_NameProperty() {
        return Mother_Middle_Name;
    }

    public void setMother_Middle_Name(String mother_Middle_Name) {
        this.Mother_Middle_Name.set(mother_Middle_Name);
    }

    public String getMother_Last_Name() {
        return Mother_Last_Name.get();
    }

    public SimpleStringProperty mother_Last_NameProperty() {
        return Mother_Last_Name;
    }

    public void setMother_Last_Name(String mother_Last_Name) {
        this.Mother_Last_Name.set(mother_Last_Name);
    }

    public String getMother_Occupation() {
        return Mother_Occupation.get();
    }

    public SimpleStringProperty mother_OccupationProperty() {
        return Mother_Occupation;
    }

    public void setMother_Occupation(String mother_Occupation) {
        this.Mother_Occupation.set(mother_Occupation);
    }

    public String getFather_First_Name() {
        return Father_First_Name.get();
    }

    public SimpleStringProperty father_First_NameProperty() {
        return Father_First_Name;
    }

    public void setFather_First_Name(String father_First_Name) {
        this.Father_First_Name.set(father_First_Name);
    }

    public String getFather_Middle_Name() {
        return Father_Middle_Name.get();
    }

    public SimpleStringProperty father_Middle_NameProperty() {
        return Father_Middle_Name;
    }

    public void setFather_Middle_Name(String father_Middle_Name) {
        this.Father_Middle_Name.set(father_Middle_Name);
    }

    public String getFather_Last_Name() {
        return Father_Last_Name.get();
    }

    public SimpleStringProperty father_Last_NameProperty() {
        return Father_Last_Name;
    }

    public void setFather_Last_Name(String father_Last_Name) {
        this.Father_Last_Name.set(father_Last_Name);
    }

    public String getFather_Occupation() {
        return Father_Occupation.get();
    }

    public SimpleStringProperty father_OccupationProperty() {
        return Father_Occupation;
    }

    public void setFather_Occupation(String father_Occupation) {
        this.Father_Occupation.set(father_Occupation);
    }

    public int getTotal_Salary() {
        return Total_Salary.get();
    }

    public SimpleIntegerProperty total_SalaryProperty() {
        return Total_Salary;
    }

    public void setTotal_Salary(int total_Salary) {
        this.Total_Salary.set(total_Salary);
    }
}
