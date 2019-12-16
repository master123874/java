package iotest.算法测试;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

import javafx.geometry.Insets;

public class DisplayClock extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a clock and a label
        ClockPane[] clocks = new ClockPane[12];

        clocks[0] = new ClockPane();
        for(int i=1;i<clocks.length;i++)  {
            clocks[i] = new ClockPane(clocks[0].getHour()+i,clocks[0].getMinute(), clocks[0].getSecond());
            clocks[i].setWidth(100);
            clocks[i].setHeight(100);
        }

        // Place clock and label in border pane
        GridPane clockPane = new GridPane();

        clockPane.setAlignment(Pos.CENTER);
        clockPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        clockPane.setHgap(5.5);
        clockPane.setVgap(5.5);

        int k=0;
        for(int i=0 ;i<3 ; i++)
            for(int j=0; j<4 ;j++)
            {
                clockPane.add(clocks[k], j,i);
                k++;
            }


        BorderPane bpane = new BorderPane();
        bpane.setCenter(clockPane);

        // Create a scene and place it in the stage
        Scene scene = new Scene(bpane);
        primaryStage.setTitle("DisplayClock"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}



