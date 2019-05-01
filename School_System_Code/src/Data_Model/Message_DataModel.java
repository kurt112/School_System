package Data_Model;

import javafx.beans.property.SimpleStringProperty;

public class Message_DataModel {

    private SimpleStringProperty sender_name = new SimpleStringProperty();
    private SimpleStringProperty receiver_name = new SimpleStringProperty();
    private SimpleStringProperty receiver_number = new SimpleStringProperty();
    private SimpleStringProperty message=  new SimpleStringProperty();
    private SimpleStringProperty date = new SimpleStringProperty();

    public Message_DataModel(String sender_name, String receiver_name,String receiver_number
    , String message, String date){

        this.sender_name.set(sender_name);
        this.receiver_name.set(receiver_name);
        this.receiver_number.set(receiver_number);
        this.message.set(message);
        this.date.set(date);


    }


    public String getSender_name() {
        return sender_name.get();
    }

    public SimpleStringProperty sender_nameProperty() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name.set(sender_name);
    }

    public String getReceiver_name() {
        return receiver_name.get();
    }

    public SimpleStringProperty receiver_nameProperty() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name.set(receiver_name);
    }

    public String getReceiver_number() {
        return receiver_number.get();
    }

    public SimpleStringProperty receiver_numberProperty() {
        return receiver_number;
    }

    public void setReceiver_number(String receiver_number) {
        this.receiver_number.set(receiver_number);
    }

    public String getMessage() {
        return message.get();
    }

    public SimpleStringProperty messageProperty() {
        return message;
    }

    public void setMessage(String message) {
        this.message.set(message);
    }

    public String getDate() {
        return date.get();
    }

    public SimpleStringProperty dateProperty() {
        return date;
    }

    public void setDate(String date) {
        this.date.set(date);
    }
}
