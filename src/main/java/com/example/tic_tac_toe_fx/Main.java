package com.example.tic_tac_toe_fx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("title_view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 500, 500);

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("title_view.fxml")));
        Group group = new Group(root);
        Scene scene = new Scene(group,600,600, Color.BLACK);

        stage.getIcons().add(new Image("D:\\PJATK\\Semestr_2\\GUI\\Tic_Tac_Toe_FX\\src\\main\\resources\\graphics\\logo.jpg"));
        stage.setTitle("Ultimate Tic-Tac-Toe!");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}