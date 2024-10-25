package com.example.demo;
import java.util.Random;

public class info {
    public static void infocamera(Camere Camera,int nrc){
                System.out.println("Info : Camera de "+Camera.nrpers+" pers,pret = "+Camera.pret+" , rating-ul : "+Camera.ratingfinal);
            if(Camera.valabil){
                System.out.print(" si este libera.");
            }
            else{
                System.out.print(" si nu este libera.");
            }

            Random rn = new Random();
            System.out.println("\nNiste review-uri de la Clienti : ");

            for(int i=0;i<3;i++) {
                int nr = rn.nextInt(29);
                System.out.println("\n- " + Camera.clientistoric.get(nr).getcomentariu());
            }
        }
    }
