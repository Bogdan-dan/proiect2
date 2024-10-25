package com.example.demo;
public class Clienti {
    public int rating;
    public String comentariu;

    public Clienti(int rating,String comentariu){
        this.rating = rating;
        this.comentariu = comentariu;
    }

    public String getcomentariu() {
        return comentariu; // Getter for the comment
    }
}
