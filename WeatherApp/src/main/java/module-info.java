module com.example.weatherapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jsoup;


    opens com.example.weatherapp to javafx.fxml;
    exports com.example.weatherapp;
}