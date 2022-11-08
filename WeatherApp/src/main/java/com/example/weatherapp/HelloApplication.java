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
        /*weather.weatherNow();
        weather.wind();*/

       // weather.weekTemperature1();
        /*weather.weekTemperature2();
        weather.weekTemperature3();
        weather.weekTemperature4();
        weather.weekTemperature5();
        weather.weekTemperature6();
        weather.weekTemperature7();

       weather.weekDays1();
       weather.weekDays2();
       weather.weekDays3();
       weather.weekDays4();
       weather.weekDays5();
       weather.weekDays6();
       weather.weekDays7();

       weather.weekDate1();
       weather.weekDate2();
       weather.weekDate3();
       weather.weekDate4();
       weather.weekDate5();
       weather.weekDate6();
       weather.weekDate7();*/

        weather.weekRain1();
        weather.weekRain2();
        weather.weekRain3();
        weather.weekRain4();
        weather.weekRain5();
        weather.weekRain6();
        weather.weekRain7();


        weather.weekTemperatureNIGHT1();
        weather.weekTemperatureNIGHT2();
        weather.weekTemperatureNIGHT3();
        weather.weekTemperatureNIGHT4();
        weather.weekTemperatureNIGHT5();
        weather.weekTemperatureNIGHT6();
        weather.weekTemperatureNIGHT7();



        launch();
    }
}