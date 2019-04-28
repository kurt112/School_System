package Data_Model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Kurt Lupin C. Orioque
 * Email Address: kurtorioque112@gmail.com
 * Date: 04 25, 2019
 * Time: 18: 23
 * User: orioque35
 */

public class Books_DataModel {

    private SimpleIntegerProperty id = new SimpleIntegerProperty();
    private SimpleStringProperty genre = new SimpleStringProperty();
    private SimpleStringProperty title = new SimpleStringProperty();
    private SimpleStringProperty author = new SimpleStringProperty();
    private SimpleStringProperty publisher = new SimpleStringProperty();
    private SimpleStringProperty date_published = new SimpleStringProperty();
    private SimpleStringProperty edition = new SimpleStringProperty();
    private SimpleStringProperty photo = new SimpleStringProperty();
    //    private SimpleIntegerProperty quantity = new SimpleIntegerProperty();
    private SimpleStringProperty location = new SimpleStringProperty();
    private SimpleStringProperty about = new SimpleStringProperty();
    private SimpleIntegerProperty pages = new SimpleIntegerProperty();
    private SimpleStringProperty abridged = new SimpleStringProperty();


    public Books_DataModel(int id, String genre,String title, String author, String publisher, String date_published, String edition, String photo,String about, String location,int pages, String abridged) {
        this.id.set(id);
        this.genre.set(genre);
        this.title.set(title);
        this.author.set(author);
        this.publisher.set(publisher);
        this.date_published.set(date_published);
        this.edition.set(edition);
        this.photo.set(photo);
        this.location.set(location);
        this.about.set(about);
        this.pages.set(pages);
        this.abridged.set(abridged);
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

    public String getGenre() {
        return genre.get();
    }

    public SimpleStringProperty genreProperty() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre.set(genre);
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

    public String getAuthor() {
        return author.get();
    }

    public SimpleStringProperty authorProperty() {
        return author;
    }

    public void setAuthor(String author) {
        this.author.set(author);
    }

    public String getPublisher() {
        return publisher.get();
    }

    public SimpleStringProperty publisherProperty() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher.set(publisher);
    }

    public String getDate_published() {
        return date_published.get();
    }

    public SimpleStringProperty date_publishedProperty() {
        return date_published;
    }

    public void setDate_published(String date_published) {
        this.date_published.set(date_published);
    }

    public String getEdition() {
        return edition.get();
    }

    public SimpleStringProperty editionProperty() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition.set(edition);
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

    public String getAbout() {
        return about.get();
    }

    public SimpleStringProperty aboutProperty() {
        return about;
    }

    public void setAbout(String about) {
        this.about.set(about);
    }

    public int getPages() {
        return pages.get();
    }

    public SimpleIntegerProperty pagesProperty() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages.set(pages);
    }

    public String getAbridged() {
        return abridged.get();
    }

    public SimpleStringProperty abridgedProperty() {
        return abridged;
    }

    public void setAbridged(String abridged) {
        this.abridged.set(abridged);
    }

    public String getPhoto() {
        return photo.get();
    }

    public SimpleStringProperty photoProperty() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo.set(photo);
    }
}
