package Data_Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 25, 2019
 * Time: 17: 02
 * User: orioque35
 */

public class Section_DataModel {

    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty  name = new SimpleStringProperty();
    private SimpleStringProperty  assing_teacher = new SimpleStringProperty();
    private SimpleStringProperty  location = new SimpleStringProperty();
    private SimpleIntegerProperty volume = new SimpleIntegerProperty();
    private SimpleIntegerProperty grade = new SimpleIntegerProperty();

    public Section_DataModel(SimpleIntegerProperty id, SimpleStringProperty name, SimpleStringProperty assing_teacher, SimpleStringProperty location, SimpleIntegerProperty volume, SimpleIntegerProperty grade) {
        this.id = id;
        this.name = name;
        this.assing_teacher = assing_teacher;
        this.location = location;
        this.volume = volume;
        this.grade = grade;
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

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getAssing_teacher() {
        return assing_teacher.get();
    }

    public SimpleStringProperty assing_teacherProperty() {
        return assing_teacher;
    }

    public void setAssing_teacher(String assing_teacher) {
        this.assing_teacher.set(assing_teacher);
    }

    public String getLocation() {
        return location.get();
    }

    public SimpleStringProperty locationProperty() {
        return location;
    }

    public void setLocation(String location) {
        this.location.set(location);
    }

    public int getVolume() {
        return volume.get();
    }

    public SimpleIntegerProperty volumeProperty() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume.set(volume);
    }

    public int getGrade() {
        return grade.get();
    }

    public SimpleIntegerProperty gradeProperty() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade.set(grade);
    }
}
