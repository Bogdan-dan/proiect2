package com.example.demo;
public class Rezervare {

    private String Nume;
    private int ID;
    private int nrcamera;
    private int Termen;

    public Rezervare(int nrcamera,int Termen,int ID,String Nume){
        this.nrcamera = nrcamera;
        this.Termen = Termen;
        this.ID = ID;
        this.Nume=Nume;
    }

    public String GetNume(){
        return Nume;
    }

    public int GetID(){
        return ID;
    }

    public int Getnrcamera(){
        return nrcamera;
    }

    public int GetTermen(){
        return Termen;
    }
}
