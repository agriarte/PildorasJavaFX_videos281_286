/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.javafx_panes_videos281_286;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video282_TilePane extends Application {

    @Override
    public void start(Stage primaryStage) {

        TilePane miTilePane = new TilePane();

        miTilePane.setPadding(new Insets(10));
        
        //separacion entre elementos del Pane
        miTilePane.setHgap(10);
        miTilePane.setVgap(10);

        //crear 12 rectangulos
        for (int i = 1; i < 13; i++) {
            Rectangle r = new Rectangle(100, 100);
            r.setFill(Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            Label miLabel = new Label("Cuadrado: " + i);
            //crear StackPane para apilar 2 elementos uno encima de otro. Se agregan en capas uno sobre otro respetando el orden
            StackPane miStackPane = new StackPane(r, miLabel);
            //agregar al TilePane el StackPane con parejas de label + rectangle
            miTilePane.getChildren().add(miStackPane);
        }

        Scene scene = new Scene(miTilePane, 800, 600);
        scene.setFill(Color.DARKSLATEGREY);

        primaryStage.setTitle("TilePane");
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
