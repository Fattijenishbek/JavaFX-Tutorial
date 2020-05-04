package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.SocketTimeoutException;

public class Main3Lambda extends Application {
    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title for Lambda Action");
        Controller controller =new Controller("Fatima", "Bekmamatova");

        button=new Button();
        button.setText("Name");
        button.setOnAction(e -> {
            System.out.println(controller.getName());
            System.out.println("Is it your correct name?");
        });

        button2=new Button();
        button2.setText("Surname");
        button2.setOnAction(e -> System.out.println(controller.getSurname()));

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button2);

        Scene scene = new Scene(layout, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
