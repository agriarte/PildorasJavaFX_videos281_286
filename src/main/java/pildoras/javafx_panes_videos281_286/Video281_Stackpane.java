package pildoras.javafx_panes_videos281_286;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * StackPane: pruebas con disposición de rectágulos en StackPane
 * S(panel que apila elementos uno encima de otro)
 */
public class Video281_Stackpane extends Application {

    @Override
    public void start(Stage primaryStage) {

        Rectangle rec1 = new Rectangle(400, 400);
        rec1.setFill(Color.RED);
        Rectangle rec2 = new Rectangle(200, 200);
        rec2.setFill(Color.BLUE);
        Rectangle rec3 = new Rectangle(100, 100);
        rec3.setFill(Color.YELLOW);

        StackPane miStackPane = new StackPane(rec1, rec2, rec3);
        miStackPane.setAlignment(Pos.TOP_LEFT);

        miStackPane.setPadding(new Insets(20, 20, 50, 20));
        //ATENCION: setMargin es estático, no puede llamarse desde una instancia. Sin embargo, 
        //en el video281 lo llama desde una instancia. Seguramente versión de javafx muy antigua
        // arriba, abajo, izquierda, derecha
        StackPane.setMargin(rec3, new Insets(150,0,0,150));
        
         Scene scene = new Scene(miStackPane, 800, 600);

        primaryStage.setTitle("StackPane");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
