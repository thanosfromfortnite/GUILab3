import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.FileWriter;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Text;

public class GameCode extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Stuff");

        Button buttonOne = new Button("click");
        Button buttonTwo = new Button("click two");
        Button buttonThree = new Button("click three");
        Button buttonFour = new Button("click four");
        TilePane tilePane = new TilePane();

        BackEnd game = new BackEnd();
        game.addNextPattern();
        Text t = new Text();
        display(t, game);

        // FileWriter highScore = new FileWriter("C:\\eggs.csv", true);
        // DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        EventHandler<ActionEvent> eventOne = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                buttonOne.setText("very cool");
                attempt(game, 0, t);
            }
        };
        EventHandler<ActionEvent> eventTwo = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                buttonTwo.setText("very cool");
                attempt(game, 1, t);
            }
        };
        EventHandler<ActionEvent> eventThree = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                buttonThree.setText("very cool");
                attempt(game, 2, t);
            }
        };
        EventHandler<ActionEvent> eventFour = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {
                buttonFour.setText("very cool");
                attempt(game, 3, t);
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

        tilePane.getChildren().add(t);

        Scene scene = new Scene(tilePane, 200, 200);

        primaryStage.setWidth(800);
        primaryStage.setHeight(600);
        primaryStage.setScene(scene);

        primaryStage.show();

    }

    private boolean attempt(BackEnd game, int num, Text t) {
        if (game.returnPartOfPattern(game.returnScore()) == num) {
            game.addScore(1);
            game.addNextPattern();
            display(t, game);
            return true;
        } else {
            return false;
        }
    }

    private void display(Text t, BackEnd game) {
        String str = "";
        for (int i = 0; i < game.returnPattern().size(); i ++) {
            str += game.returnPartOfPattern(i) + ", ";
        }
        t.setText(str);
    }
}
