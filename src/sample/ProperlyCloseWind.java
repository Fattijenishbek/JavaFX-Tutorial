package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ProperlyCloseWind extends Application {
    Button button;
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        button = new Button("Close program");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        button.setOnAction(e -> closeProgram());

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();

    }

    private void closeProgram() {
        Boolean answer = ComunicationWind.display("Exit", "Sure, you about to Exit?");
        if(answer){
            window.close();}
    }
}
