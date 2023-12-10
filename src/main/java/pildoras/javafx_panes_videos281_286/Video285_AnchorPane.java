/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_panes_videos281_286;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video285_AnchorPane extends Application {

    @Override
    public void start(Stage primaryStage) {

        //boton ARRIBA y sus anclas
        Button botonArriba = new Button("Arriba");
        AnchorPane.setTopAnchor(botonArriba, 20.0);
        AnchorPane.setLeftAnchor(botonArriba, 100.0);
        AnchorPane.setRightAnchor(botonArriba, 100.0);

        //boton  DERECHA y sus anclas
        Button botonDer = new Button("Derecha");
        AnchorPane.setTopAnchor(botonDer, 30.0);
        AnchorPane.setRightAnchor(botonDer, 20.0);
        AnchorPane.setBottomAnchor(botonDer, 30.0);

        //boton ABAJO y sus anclas
        Button botonAbajo = new Button("Abajo");
        AnchorPane.setBottomAnchor(botonAbajo, 20.0);
        AnchorPane.setLeftAnchor(botonAbajo, 100.0);
        AnchorPane.setRightAnchor(botonAbajo, 100.0);

        //boton IZQUIERDA y sus anclas
        Button botonIzq = new Button("Izquierda");
        AnchorPane.setTopAnchor(botonIzq, 30.0);
        AnchorPane.setLeftAnchor(botonIzq, 20.0);
        AnchorPane.setBottomAnchor(botonIzq, 30.0);

        AnchorPane miAnchorPane = new AnchorPane(botonAbajo, botonArriba, botonDer, botonIzq);

        Scene scene = new Scene(miAnchorPane, 400, 250);

        primaryStage.setTitle("Ejemplo de AnchorPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
