/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxhw;

import java.util.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXHW extends Application {

    @Override
    public void start(Stage primaryStage) {
        Text t = new Text();
        Button btn = new Button("Say time");
        btn.setOnAction(new // ButtonHandler()
                EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                t.setText(new Date().toString());
            }
        }
        );

        Pane root = new VBox(20);
        root.setPadding(new Insets(20));
        
        root.getChildren().addAll(t, btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Time");
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
