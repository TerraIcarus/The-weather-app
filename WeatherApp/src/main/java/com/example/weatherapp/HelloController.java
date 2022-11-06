package com.example.weatherapp;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ComboBox<String> spisokV;
    @FXML
    private Label textCity;

    @FXML //изменение названия города
    void onHelloButtonClick(ActionEvent event) {
        String s = spisokV.getSelectionModel().getSelectedItem().toString();
        textCity.setText(s);
    }

    /* С ним и без него работает
    @FXML
    private TextField textInput;*/

   /* public HelloController() {
    }*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        spisokV.setItems(FXCollections.observableArrayList("Москва", "Санкт-Петербург", "Нижний Новгород", "Владимир", "Владивосток"));
    }

  /* С ним и без него работает
    @FXML
    void getComboBoxInfo(ActionEvent event){
        System.out.println(spisokV.getValue());
    }*/

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}