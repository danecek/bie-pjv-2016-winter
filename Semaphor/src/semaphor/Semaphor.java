/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semaphor.control.Controller;
import semaphor.control.NextButton;
import semaphor.control.StartButton;
import semaphor.control.StopButton;
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
        Controller controller = new Controller() ;
        HBox buttons = new HBox(10, new NextButton(controller), 
                new StartButton(controller),
                new StopButton(controller)
        );
                

        bp.setBottom(buttons);

        controller.addObserver(s);
        controller.addObserver(s2);

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
