package com.example.demo;
import javafx.application.Application;
import com.example.demo.*;

import java.awt.*;
import java.util.Random;
import java.util.Vector;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;


public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 651, 446);
        stage.setTitle("Meniu Hotel !");
        stage.setScene(scene);
        stage.show();
    }


        public static void main (String[]args){

            launch();
        }
}