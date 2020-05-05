package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CommunicationMain extends Application {
    Stage window;
    Button button;
    StackPane layout;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window=primaryStage;
        button=new Button("Click");
        button.setOnAction(e -> {
            boolean result = ComunicationWind.display("Comunication Title", "Do you want to close it?");
            System.out.println(result);
        });

        layout = new StackPane();
        layout.getChildren().add(button);

        scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();



    }
}
