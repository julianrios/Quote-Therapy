package com.julianrios.cherry.model;


import javax.persistence.Entity;

/**
 * A quote object that stores author, quote, and/or publication title based on the quote data obtained or given.
 */
@Entity
public class Quote {

    private String author;
    private String quote;
    private String publication;

    public Quote(String author, String quote, String publication) {
        this.author = author;
        this.quote = quote;
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }
}
