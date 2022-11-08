package com.example.weatherapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("bul.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Погода");
            stage.setScene(scene);
            stage.show();
    }
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.weatherDay();
        weather.weatherNight();
        weather.wind();

        weather.weekWind1();
        weather.weekWind2();
        weather.weekWind3();
        weather.weekWind4();
        weather.weekWind5();
        weather.weekWind6();
        weather.weekWind7();

        launch();
    }
}