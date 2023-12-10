package pildoras.javafx_panes_videos281_286;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Video283_ScrollPane_v2_RECOMENDADO extends Application {

    @Override
    public void start(Stage primaryStage) {

        TilePane miTilePane = new TilePane();

        miTilePane.setPadding(new Insets(10));
        miTilePane.setHgap(10);
        miTilePane.setVgap(10);

        for (int i = 1; i < 13; i++) {
            Rectangle r = new Rectangle(100, 100);
            r.setFill(Color.rgb((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            Label miLabel = new Label("Cuadrado: " + i);
            StackPane miStackPane = new StackPane(r, miLabel);
            miTilePane.getChildren().add(miStackPane);
        }

        ScrollPane miScrollPane = new ScrollPane(miTilePane);
        miScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER); // Deshabilitar la barra de desplazamiento horizontal

        StackPane miStackPane2 = new StackPane(miScrollPane);

        Scene scene = new Scene(miStackPane2, 800, 600);
        scene.setFill(Color.DARKSLATEGREY);

        //ESTO NO ES DEL CURSO
        //Con este Listener la disposición de los elementos se hace de manera adaptativa al tamaño de la ventana.
        //Mucho mejor solución que el método del video       
        primaryStage.widthProperty().addListener((obs, oldVal, newVal) -> {
            // Ajustar el ancho del TilePane al ancho de la ventana
            miTilePane.setPrefWidth(newVal.doubleValue());
        });

        primaryStage.setTitle("TilePane");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
