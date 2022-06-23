package com.example.tic_tac_toe_fx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("title_view.fxml")));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("basicgame.fxml"));
        Parent root = loader.load();
        TicTacToeController controller = loader.getController();
        Scene scene = new Scene(root,575,600);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                switch (event.getCode()) {
                    case NUMPAD7 -> controller.klawisze(7);
                    case NUMPAD8 -> controller.klawisze(8);
                    case NUMPAD9 -> controller.klawisze(9);
                    case NUMPAD4 -> controller.klawisze(4);
                    case NUMPAD5 -> controller.klawisze(5);
                    case NUMPAD6 -> controller.klawisze(6);
                    case NUMPAD1 -> controller.klawisze(1);
                    case NUMPAD2 -> controller.klawisze(2);
                    case NUMPAD3 -> controller.klawisze(3);
                }
            }
        });

        stage.setTitle("Kółko i krzyżyk!");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}