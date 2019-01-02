import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;

public class GameCode extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Stuff");

        VBox vbox = new VBox(new Label("A JavaFX Label"));
        Scene scene = new Scene(vbox);

        Button button = new Button("click");

        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
