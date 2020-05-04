package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage stage) throws Exception{
        stage.setTitle("Title of the window");
        button =new Button();
        button.setText("Click here");

        button.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300,250);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(actionEvent.getSource()==button){
            System.out.println("Hello World");
        }
    }
}
