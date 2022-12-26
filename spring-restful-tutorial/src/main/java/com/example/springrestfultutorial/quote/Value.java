package com.example.springrestfultutorial.quote;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private long id;
    private String quote;

    public Value(){
    }

    public long getId() {
        return id;
    }

    public String getQuote() {
        return quote;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", quote='" + quote + '\'' +
                '}';
    }
}
