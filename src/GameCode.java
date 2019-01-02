import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
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

        Button buttonOne = new Button("click");
        Button buttonTwo = new Button("click two");
        Button buttonThree = new Button("click three");
        Button buttonFour = new Button("click four");

        TilePane tilePane = new TilePane();

        BackEnd game = new BackEnd();
        game.addNextPattern();
        game.addNextPattern();
        game.addNextPattern();
        game.addNextPattern();

        EventHandler<ActionEvent> eventOne = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                buttonOne.setText("very cool");
                System.out.println(game.returnPartOfPattern(0));
            }
        };
        EventHandler<ActionEvent> eventTwo = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                buttonTwo.setText("very cool");
                System.out.println(game.returnPartOfPattern(1));
            }
        };
        EventHandler<ActionEvent> eventThree = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                buttonThree.setText("very cool");
                System.out.println(game.returnPartOfPattern(2));
            }
        };
        EventHandler<ActionEvent> eventFour = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                buttonFour.setText("very cool");
                System.out.println(game.returnPartOfPattern(3));
            }
        };
        buttonOne.setOnAction(eventOne);
        buttonTwo.setOnAction(eventTwo);
        buttonThree.setOnAction(eventThree);
        buttonFour.setOnAction(eventFour);

        tilePane.getChildren().add(buttonOne);
        tilePane.getChildren().add(buttonTwo);
        tilePane.getChildren().add(buttonThree);
        tilePane.getChildren().add(buttonFour);

        Scene scene = new Scene(tilePane, 200, 200);

        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setScene(scene);

        primaryStage.show();
    }
}
