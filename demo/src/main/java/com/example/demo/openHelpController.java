package com.example.demo;

import com.example.demo.*;
import com.example.demo.Camere;
import com.example.demo.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import javafx.scene.control.Label;



public class openHelpController {



    @FXML
    public Label r1,r2,r3,r4;
    @FXML
    public Label p1,p2,p3,p4;


    @FXML

    private void initialize(){
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
            if (nrrating <= 2) {
                int nrcom = Rn.nextInt(2);
                Client[i] = new Clienti(nrrating, Coment.get(nrcom));
            } else if (nrrating==3) {
                int nrcom = Rn.nextInt(5 - 3 + 1) + 3;
                Client[i] = new Clienti(nrrating, Coment.get(nrcom));
            } else if (nrrating == 4 || nrrating == 5) {
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
        if (r1 == null || r2 == null || r3 == null || r4 == null) {
            System.err.println("One or more labels are not initialized!");
            return; // Exit if any label is null to avoid NullPointerException
        }
        r1.setText(String.valueOf(Camera[1].ratingfinal));
        r2.setText(String.valueOf(Camera[2].ratingfinal));
        r3.setText(String.valueOf(Camera[3].ratingfinal));
        r4.setText(String.valueOf(Camera[6].ratingfinal));
        p1.setText(Camera[0].pret + "/npt");
        p2.setText(Camera[1].pret + " /npt");
        p3.setText(Camera[2].pret + " /npt");
        p4.setText(Camera[6].pret + " /npt");
    }

    public void openHelp() throws IOException{
        FXMLLoader fxmlLoaderh = new FXMLLoader(openHelpController.class.getResource("help.fxml"));
        Scene scene = new Scene(fxmlLoaderh.load(), 600, 400);
        Stage stageh = new Stage();
        stageh.setTitle("Help");
        stageh.setScene(scene);
        stageh.show();
    }
    public void openRez() throws IOException{
        FXMLLoader fxmlLoaderh = new FXMLLoader(openHelpController.class.getResource("rez.fxml"));
        Scene scene = new Scene(fxmlLoaderh.load(), 600, 400);
        Stage stageh = new Stage();
        stageh.setTitle("Rezervare!");
        stageh.setScene(scene);
        stageh.show();
    }

    public void openUtilizator() throws IOException{
        FXMLLoader fxmlLoaderh = new FXMLLoader(openHelpController.class.getResource("util.fxml"));
        Scene scene = new Scene(fxmlLoaderh.load(), 457, 296);
        Stage stageh = new Stage();
        stageh.setTitle("Despre Utilizator!");
        stageh.setScene(scene);
        stageh.show();
    }
    }

