package com.hackerrank.testassignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Games {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String platform;
    public int score;
    public String genre;
    public char editor_choice;

    public Games() {
    }

    public Games(String title, String platform, int score, String genre, char editor_choice) {
        this.title = title;
        this.platform = platform;
        this.score = score;
        this.genre = genre;
        this.editor_choice = editor_choice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public char getEditor_choice() {
        return editor_choice;
    }

    public void setEditor_choice(char editor_choice) {
        this.editor_choice = editor_choice;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", platform='" + platform + '\'' +
                ", score=" + score +
                ", genre='" + genre + '\'' +
                ", editor_choice=" + editor_choice +
                '}';
    }
}
