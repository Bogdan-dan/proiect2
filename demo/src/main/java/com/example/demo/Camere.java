package com.example.demo;
import java.util.Vector;

public class Camere {

    public int nrcamera;
    public int nrpers;
    public boolean valabil;
    public double pret;
    public int ratingfinal;
    static Vector<Clienti> clientistoric;

    public Camere(int nrcamera,int nrpers,boolean valabil, double pret) {
        this.nrcamera = nrcamera;
        this.nrpers = nrpers;
        this.valabil = valabil;
        this.pret = pret;
        this.clientistoric = new Vector<>();
    }

    public void setRating(int ratingfinal){
        this.ratingfinal = ratingfinal;
    }

    public static void setClientistoric(Clienti client) {
        clientistoric.add(client);
    }

    public int getrating(){
        return ratingfinal;
    }

}