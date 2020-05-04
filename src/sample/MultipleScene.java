package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.awt.*;

public class MultipleScene extends Application {
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Switch windows");
        Label label = new Label("Welocome to the first scene");
        Button button1 = new Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, button1);
        scene1 = new Scene(layout1, 300,250);
        //window.setScene(scene1);
        //window.show();

        Label label1 = new Label("It is thesecond scene");
        Button button2 = new Button("Click, to the first scene");
        button2.setOnAction(e -> window.setScene(scene1));
        VBox layout2 = new VBox(10);
        layout2.getChildren().addAll(label1, button2);
        scene2 = new Scene(layout2, 400,400);
        window.setScene(scene1);
        window.show();

    }
}
