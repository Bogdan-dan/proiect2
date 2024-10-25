/*package com.example.demo;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;


public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Random Rn = new Random();
        Camere[] Camera = new Camere[10];
        Vector<String> Coment;
        Coment = new Vector<>();
        Coment.add(0, "Nu mi-a placut!");
        Coment.add(1, "Camera foarte murdara.");
        Coment.add(2, "Patul era rupt, nu recomand.");
        Coment.add(3, "Un pic de dezordine dar in rest okay.");
        Coment.add(4, "Camera era okay doar ca baia era foarte mica.");
        Coment.add(5, "Camera a fost decenta, singura problema era ca nu a mers televizorul.");
        Coment.add(6, "Mi-a placut foarte mult camera,foarte curata!!");
        Coment.add(7, "O priveliste de nota 10,recomand.");
        Coment.add(8, "Patul extrem de moale , am dormit foarte bine in el,si baia superba.");

        int nrclienti = 600;
        Clienti[] Client = new Clienti[600];
        Rezervare[] Rezervarec = new Rezervare[5];

        for (int i = 0; i < 600; i++) {
            int nrrating = Rn.nextInt(5 - 1 + 1) + 1;
            if (nrrating >= 1 && nrrating < 3) {
                int nrcom = Rn.nextInt(2);
                Client[i] = new Clienti(nrrating, Coment.get(nrcom));
            } else if (nrrating >= 3 && nrrating < 4) {
                int nrcom = Rn.nextInt(5 - 3 + 1) + 3;
                Client[i] = new Clienti(nrrating, Coment.get(nrcom));
            } else if (nrrating >= 4 && nrrating <= 5) {
                int nrcom = Rn.nextInt(8 - 4 + 1) + 4;
                Client[i] = new Clienti(nrrating, Coment.get(nrcom));
            }
        } // generarea clientiilor

        for (int j = 0; j < 300; j++) {
            int k;
            for (int i = 0; i < 5; i++) {
                int total = 0;
                int Vala = Rn.nextInt(2);
                if (Vala == 1) {
                    Camera[i] = new Camere(100 + i, 1, true, 50);
                    for (k = j; k < j + 30 && k < Client.length; k++) {
                        total += Client[k].rating;
                        Camere.setClientistoric(Client[k]);
                    }
                } else {
                    Camera[i] = new Camere(100 + i, 1, false, 50);
                    for (k = j; k < j + 30 && k < Client.length; k++) {
                        total += Client[k].rating;
                        Camere.setClientistoric(Client[k]);
                    }
                }
                Camera[i].setRating(total / 30);
                j = k;
            }
        } // Camere de o pers

        for (int j = 300; j < 600; j++) {
            for (int i = 5; i < 10; i++) {
                int total = 0;
                int k;
                int Vala = Rn.nextInt(2);
                if (Vala == 1) {
                    Camera[i] = new Camere(200 + i, 2, true, 100);
                    for (k = j; k < j + 30 && k < Client.length; k++) {
                        total += Client[k].rating;
                        Camere.setClientistoric(Client[k]);
                    }
                } else {
                    Camera[i] = new Camere(200 + i, 2, false, 100);
                    for (k = j; k < j + 30 && k < Client.length; k++) {
                        total += Client[k].rating;
                        Camere.setClientistoric(Client[k]);
                    }
                }
                Camera[i].setRating(total / 30);
                j = k;
            }
        }// Camere de 2 pers
    }
}*/