package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class ComunicationWind {
    static boolean answer;

    public static boolean display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);

        Label label = new Label();
        label.setText(message);

        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            window.close();
            answer = true;
        });
        Button noButton = new Button("No");
        noButton.setOnAction(e -> {
            window.close();
            answer = false;
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        return answer;

    }
}
