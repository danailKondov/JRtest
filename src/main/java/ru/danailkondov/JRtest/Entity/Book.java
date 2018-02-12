package ru.danailkondov.JRtest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created 11.02.2018.
 * Аннотацией @Entity отмечаются классы, которые представляют собой сущности базы данных (Hibernate).
 */
@Entity
public class Book {

    /**
     * The @Id annotation marks a field as a primary key field. When a primary key field
     * is defined the primary key value is automatically injected into that field by ObjectDB.
     *
     * The @GeneratedValue annotation specifies that the primary key is automatically allocated by ObjectDB.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    private String description;

    private String autor;

    private String isbn;

    private int printYear;

    private boolean readAlready;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    public boolean isReadAlready() {
        return readAlready;
    }

    public void setReadAlready(boolean readAlready) {
        this.readAlready = readAlready;
    }
}
