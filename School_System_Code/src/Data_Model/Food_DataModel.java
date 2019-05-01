package Data_Model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Food_DataModel {

    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty type = new SimpleStringProperty();
    private SimpleStringProperty name = new SimpleStringProperty();
    private SimpleStringProperty producer = new SimpleStringProperty();
    private SimpleStringProperty manufactured = new SimpleStringProperty();
    private SimpleStringProperty expiration = new SimpleStringProperty();
    private SimpleDoubleProperty amount = new SimpleDoubleProperty();


    public Food_DataModel(int id, String type, String name, String producer, String manufactured
    , String expiration, double amount){

        this.id.set(id);
        this.type.set(type);
        this.name.set(name);
        this.producer.set(producer);
        this.manufactured.set(manufactured);
        this.expiration.set(expiration);
        this.amount.set(amount);


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

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
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

    public String getProducer() {
        return producer.get();
    }

    public SimpleStringProperty producerProperty() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer.set(producer);
    }

    public String getManufactured() {
        return manufactured.get();
    }

    public SimpleStringProperty manufacturedProperty() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured.set(manufactured);
    }

    public String getExpiration() {
        return expiration.get();
    }

    public SimpleStringProperty expirationProperty() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration.set(expiration);
    }

    public double getAmount() {
        return amount.get();
    }

    public SimpleDoubleProperty amountProperty() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount.set(amount);
    }
}
