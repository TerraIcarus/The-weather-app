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
       // weather.weatherDay();
       // weather.weatherNight();
        weather.wind();

        weather.DateToday();

        weather.weekWind1();
        weather.weekWind2();
        weather.weekWind3();
        weather.weekWind4();
        weather.weekWind5();
        weather.weekWind6();
        weather.weekWind7();

        weather.TodayTemp1();
        weather.TodayTemp2();
        weather.TodayTemp3();
        weather.TodayTemp4();
        weather.TodayTemp5();
        weather.TodayTemp6();
        weather.TodayTemp7();
        weather.TodayTemp8();

        weather.TodayWind1();
        weather.TodayWind2();
        weather.TodayWind3();
        weather.TodayWind4();
        weather.TodayWind5();
        weather.TodayWind6();
        weather.TodayWind7();
        weather.TodayWind8();

        weather.TodayRain1();
        weather.TodayRain2();
        weather.TodayRain3();
        weather.TodayRain4();
        weather.TodayRain5();
        weather.TodayRain6();
        weather.TodayRain7();
        weather.TodayRain8();

        launch();
    }
}