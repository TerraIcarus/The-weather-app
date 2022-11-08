package com.example.weatherapp;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label Data_Tek;

    @FXML
    private Label Temp_Den;

    @FXML
    private Label Temp_Den_bud;

    @FXML
    private Label Temp_Den_bud1;

    @FXML
    private Label Temp_Den_bud2;

    @FXML
    private Label Temp_Den_bud3;

    @FXML
    private Label Temp_Den_bud4;

    @FXML
    private Label Temp_Den_bud5;

    @FXML
    private Label Temp_Den_bud6;

    @FXML
    private Label Temp_Den_bud7;

    @FXML
    private Label Temp_Nigt;

    @FXML
    private Label Temp_Nigt_bud;

    @FXML
    private Label Temp_Nigt_bud1;

    @FXML
    private Label Temp_Nigt_bud2;

    @FXML
    private Label Temp_Nigt_bud3;

    @FXML
    private Label Temp_Nigt_bud4;

    @FXML
    private Label Temp_Nigt_bud5;

    @FXML
    private Label Temp_Nigt_bud6;

    @FXML
    private Label Temp_Nigt_bud7;

    @FXML
    private Label Temper_Tek;

    @FXML
    private Label Veter;

    @FXML
    private Label Veter_bud;

    @FXML
    private Label Veter_bud1;

    @FXML
    private Label Veter_bud2;

    @FXML
    private Label Veter_bud3;

    @FXML
    private Label Veter_bud4;

    @FXML
    private Label Veter_bud5;

    @FXML
    private Label Veter_bud6;

    @FXML
    private Label Veter_bud7;

    @FXML
    private Label Vlagn;

    @FXML
    private Label Vlagn_bud;

    @FXML
    private Label Vlagn_bud1;

    @FXML
    private Label Vlagn_bud2;

    @FXML
    private Label Vlagn_bud3;

    @FXML
    private Label Vlagn_bud4;

    @FXML
    private Label Vlagn_bud5;

    @FXML
    private Label Vlagn_bud6;

    @FXML
    private Label Vlagn_bud7;

    @FXML
    private Label d1;

    @FXML
    private Label d2;

    @FXML
    private Label d3;

    @FXML
    private Label d4;

    @FXML
    private Label d5;

    @FXML
    private Label d6;

    @FXML
    private Label d7;

    @FXML
    private Button kn0;

    @FXML
    private Button kn12;

    @FXML
    private Button kn15;

    @FXML
    private Button kn18;

    @FXML
    private Button kn21;

    @FXML
    private Button kn23;

    @FXML
    private Button kn3;

    @FXML
    private Button kn6;

    @FXML
    private Button kn9;

    @FXML
    private ComboBox spisokV;

    @FXML
    private Label t0;

    @FXML
    private Label t12;

    @FXML
    private Label t15;

    @FXML
    private Label t18;

    @FXML
    private Label t21;

    @FXML
    private Label t23;

    @FXML
    private Label t3;

    @FXML
    private Label t6;

    @FXML
    private Label t9;

    @FXML
    private Label textCity;

    @FXML
    private Label time_bud;

    @FXML //изменение названия города
    void onHelloButtonClick(ActionEvent event) {
        String s = spisokV.getSelectionModel().getSelectedItem().toString();
        textCity.setText(s);
    }

    /* С ним и без него работает*/
    @FXML
    private TextField textInput;

    public HelloController() {
    }

    //список городов
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        //температура ДНЕМ на всю НЕДЕЛЮ
        spisokV.setItems(FXCollections.observableArrayList("Москва", "Санкт-Петербург", "Нижний Новгород", "Владимир", "Владивосток"));
        Temp_Den_bud1.setText(Weather.weekTemperature1().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temp_Den_bud1);
        Temp_Den_bud2.setText(Weather.weekTemperature2().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temp_Den_bud2);
        Temp_Den_bud3.setText(Weather.weekTemperature3().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temp_Den_bud3);
        Temp_Den_bud4.setText(Weather.weekTemperature4().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temp_Den_bud4);
        Temp_Den_bud5.setText(Weather.weekTemperature5().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temp_Den_bud5);
        Temp_Den_bud6.setText(Weather.weekTemperature6().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temp_Den_bud6);
        Temp_Den_bud7.setText(Weather.weekTemperature7().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temp_Den_bud7);


        //изменене ДАТЫ на всю НЕДЕЛЮ
        d1.setText(Weather.weekDate1().replaceAll("[u0000-u002fu003a-u003f]", " ").replaceAll(" +", " "));
        System.out.println(d1);
        d2.setText(Weather.weekDate2().replaceAll("[u0000-u002fu003a-u003f]", " ").replaceAll(" +", " "));
        System.out.println(d2);
        d3.setText(Weather.weekDate3().replaceAll("[u0000-u002fu003a-u003f]", " ").replaceAll(" +", " "));
        System.out.println(d3);
        d4.setText(Weather.weekDate4().replaceAll("[u0000-u002fu003a-u003f]", " ").replaceAll(" +", " "));
        System.out.println(d4);
        d5.setText(Weather.weekDate5().replaceAll("[u0000-u002fu003a-u003f]", " ").replaceAll(" +", " "));
        System.out.println(d5);
        d6.setText(Weather.weekDate6().replaceAll("[u0000-u002fu003a-u003f]", " ").replaceAll(" +", " "));
        System.out.println(d6);
        d7.setText(Weather.weekDate7().replaceAll("[u0000-u002fu003a-u003f]", " ").replaceAll(" +", " "));
        System.out.println(d7);


        //данные на СЕГОДНЯ температура текущ.
        Temper_Tek.setText(Weather.weatherNow().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Temper_Tek);
        //данные на СЕГОДНЯ ветер
        Veter.setText(Weather.wind().replaceAll("[^0-9°]", " ").replaceAll(" +", " "));
        System.out.println(Veter);



    }

  /* С ним и без него работает*/
    @FXML
    void getComboBoxInfo(ActionEvent event){
        System.out.println(spisokV.getValue());
    }

    @FXML
    void initialize() {
    }



}