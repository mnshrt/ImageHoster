package com.upgrad.ImageHoster.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Comment")
public class Comment implements Serializable {
    // These annotations auto-increments the id column for us whenever
    // a new Image object is stored into the database
    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Image image;

    @Column
    private String text;

    @Column
    private String username;

    public Comment(String text, String username, Image image) {

        this.text = text;
        this.username = username;
        this.image = image;
    }

    public Comment() {
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
