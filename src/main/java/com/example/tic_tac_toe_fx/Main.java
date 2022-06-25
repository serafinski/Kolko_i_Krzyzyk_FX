package com.example.tic_tac_toe_fx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Ładuje plik FXML,
 * pobiera kontroler,
 * tworzy nową scenę,
 * ustawia obsługę zdarzenia onKeyPressed sceny,
 * ustawia tytuł sceny,
 * wyznacza scenę i pokazuje scenę
 */
public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Inicjacja .fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("basicgame.fxml"));

        // Ładowanie .fxml
        Parent root = loader.load();

        // Pobranie kontrolera z .fxml.
        TicTacToeController controller = loader.getController();

        // Stworzenie nowej sceny
        Scene scene = new Scene(root,575,600);

        // Lambda służąca do ustalenia Numpad'a.
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

        //Ustawienie tytułu sceny.
        stage.setTitle("Kółko i krzyżyk!");

        // Ustawienie tego "co wystawia" scena.
        stage.setScene(scene);
        //Wyświetlenie sceny
        stage.show();
    }

    /**
     * Uruchomienie programu
     */
    public static void main(String[] args) {
        launch();
    }
}