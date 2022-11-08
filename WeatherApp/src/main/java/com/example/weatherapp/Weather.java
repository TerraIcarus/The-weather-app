package com.example.weatherapp;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Weather {
   // private String URL; сменить со владимира на др города

    public static String weatherNow(){
        String elm =null;
        try
        {
            Document document = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/now/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();

            Elements weatherNow = document.select("div.HhSR.GyfK");
            for (Element element : weatherNow.select("div")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String wind(){
        String elm =null;
        try
        {
            Document document = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/now/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();

            Element wind = document.select("span.VaOz.d2qU").get(1);
            for (Element element : wind.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static  String weekTemperature1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("span.AY6t");

            for (Element element : weekTemperature.select("span")) {
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperature2() {
        String elm = null;
        try {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(1);
            for (Element element : weekTemperature.select("span")) {
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperature3(){
        String elm = null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(2);
            for (Element element : weekTemperature.select("span")) {
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperature4(){
        String elm = null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(3);
            for (Element element : weekTemperature.select("span")) {
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperature5(){
        String elm = null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(4);
            for (Element element : weekTemperature.select("span")) {
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperature6(){
        String elm = null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(5);
            for (Element element : weekTemperature.select("span")) {
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperature7(){
        String elm = null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(6);
            for (Element element : weekTemperature.select("span")) {
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }






    public static String weekDays1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.selectFirst("span.B3rb");
            for (Element element : weekDays.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDays2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(1);
            for (Element element : weekDays.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDays3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(2);
            for (Element element : weekDays.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDays4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(3);
            for (Element element : weekDays.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDays5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(4);
            for (Element element : weekDays.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDays6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(5);
            for (Element element : weekDays.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDays7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(6);
            for (Element element : weekDays.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }








    public static String weekDate1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.selectFirst("span.PADa");
            for (Element element : weekDate.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDate2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(1);
            for (Element element : weekDate.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDate3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(2);
            for (Element element : weekDate.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDate4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(3);
            for (Element element : weekDate.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDate5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(4);
            for (Element element : weekDate.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDate6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(5);
            for (Element element : weekDate.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekDate7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(6);
            for (Element element : weekDate.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekRain1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("span.F5CX");
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekRain2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.F5CX").get(1);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekRain3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.F5CX").get(2);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekRain4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.F5CX").get(3);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekRain5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.F5CX").get(4);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekRain6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.F5CX").get(5);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekRain7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.F5CX").get(6);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperatureNIGHT1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("span.wVqS");
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperatureNIGHT2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.wVqS").get(1);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperatureNIGHT3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.wVqS").get(2);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperatureNIGHT4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.wVqS").get(3);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperatureNIGHT5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.wVqS").get(4);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperatureNIGHT6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.wVqS").get(5);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekTemperatureNIGHT7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.wVqS").get(6);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

}
