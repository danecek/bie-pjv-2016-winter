/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semaphor.control.Controller;
import semaphor.view.SemaphorPanel;

/**
 *
 * @author danecek
 */
public class Semaphor extends Application {

    @Override
    public void start(Stage primaryStage) {

        SemaphorPanel s = new SemaphorPanel(40, Color.RED, Color.YELLOW, Color.GREEN);
        SemaphorPanel s2 = new SemaphorPanel(40, Color.RED, Color.YELLOW, Color.GREEN);
        
        BorderPane bp = new BorderPane();
        bp.setLeft(s);
        bp.setRight(s2);
        Button nextButton;
        HBox buttons = new HBox(10, nextButton = new Button("Next"), new Button("Green"));
        bp.setBottom(buttons);
        Controller controller = new Controller() ;
        controller.addObserver(s);
        controller.addObserver(s2);
        nextButton.setOnAction(new EventHandler<ActionEvent>() {  

            @Override
            public void handle(ActionEvent event) {
                controller.next();
            }
        });

        Scene scene = new Scene(bp);

        primaryStage.setTitle("Semaphor");
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
