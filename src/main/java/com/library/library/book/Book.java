package com.library.library.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String author;
    private String isbn;
    private String genre;
    private String publisher;
    private Integer year;
    private Integer pages;
    private String language;
}
