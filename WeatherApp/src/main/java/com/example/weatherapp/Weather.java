package com.example.weatherapp;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Weather {
   // private String URL; сменить со владимира на др города
   static String URLnow ="https://www.gismeteo.ru/weather-vladimir-4350/now/";
   static String URLweek ="https://www.gismeteo.ru/weather-vladimir-4350/10-days/";
    static String URL ="https://www.gismeteo.ru/weather-vladimir-4350/";

    public static String weatherNow(){
        String elm =null;
        try
        {
            Document document = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weatherNow = document.selectFirst("div.maxt>span.unit.unit_temperature_c");
            for (Element element : weatherNow.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String DateToday(){
        String elm =null;
        try
        {
            Document document = Jsoup.connect(URLnow)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weatherNow = document.selectFirst("div.now-localdate");
            for (Element element : weatherNow.select("div")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }
    public static String weatherDay(){
        String elm =null;
        try
        {
            Document document = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weatherNow = document.selectFirst("div.maxt>span.unit.unit_temperature_c");
            for (Element element : weatherNow.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weatherNight(){
        String elm =null;
        try
        {
            Document document = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weatherNow = document.selectFirst("div.mint>span.unit.unit_temperature_c");
            for (Element element : weatherNow.select("span")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s");
            for (Element element : weekTemperature.select("span")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.maxt>span.unit.unit_temperature_c").get(1);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.maxt>span.unit.unit_temperature_c").get(2);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.maxt>span.unit.unit_temperature_c").get(3);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.maxt>span.unit.unit_temperature_c").get(4);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.maxt>span.unit.unit_temperature_c").get(5);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.maxt>span.unit.unit_temperature_c").get(6);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.maxt>span.unit.unit_temperature_c").get(7);
            for (Element element : weekTemperature.select("span")) {
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("div.widget-row.widget-row-days-date>a.row-item").get(1);
            for (Element element : weekDate.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("div.widget-row.widget-row-days-date>a.row-item").get(2);
            for (Element element : weekDate.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("div.widget-row.widget-row-days-date>a.row-item").get(3);
            for (Element element : weekDate.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("div.widget-row.widget-row-days-date>a.row-item").get(4);
            for (Element element : weekDate.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("div.widget-row.widget-row-days-date>a.row-item").get(5);
            for (Element element : weekDate.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("div.widget-row.widget-row-days-date>a.row-item").get(6);
            for (Element element : weekDate.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("div.widget-row.widget-row-days-date>a.row-item").get(7);
            for (Element element : weekDate.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity>div.row-item").get(1);
            for (Element element : weekTemperature.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity>div.row-item").get(2);
            for (Element element : weekTemperature.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity>div.row-item").get(3);
            for (Element element : weekTemperature.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity>div.row-item").get(4);
            for (Element element : weekTemperature.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity>div.row-item").get(5);
            for (Element element : weekTemperature.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity>div.row-item").get(6);
            for (Element element : weekTemperature.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity>div.row-item").get(7);
            for (Element element : weekTemperature.select("div")){
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.mint>span.unit.unit_temperature_c").get(1);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.mint>span.unit.unit_temperature_c").get(2);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.mint>span.unit.unit_temperature_c").get(3);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.mint>span.unit.unit_temperature_c").get(4);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.mint>span.unit.unit_temperature_c").get(5);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.mint>span.unit.unit_temperature_c").get(6);
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
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.mint>span.unit.unit_temperature_c").get(7);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }


    public static String weekWind1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s").get(1);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekWind2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s").get(2);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekWind3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s").get(3);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekWind4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s").get(4);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekWind5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s").get(5);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekWind6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s").get(6);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String weekWind7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URLweek)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed>div.row-item> span.wind-unit.unit.unit_wind_m_s").get(7);
            for (Element element : weekTemperature.select("span")){
                elm = element.text();

            }
        } catch (Exception e) {

        }
        return elm;
    }

    public static String TodayTemp1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("div.values>div.value>span.unit.unit_temperature_c");
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayTemp2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.values>div.value>span.unit.unit_temperature_c").get(1);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayTemp3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.values>div.value>span.unit.unit_temperature_c").get(2);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayTemp4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.values>div.value>span.unit.unit_temperature_c").get(3);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayTemp5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.values>div.value>span.unit.unit_temperature_c").get(4);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayTemp6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.values>div.value>span.unit.unit_temperature_c").get(5);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayTemp7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.values>div.value>span.unit.unit_temperature_c").get(6);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayTemp8(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.values>div.value>span.unit.unit_temperature_c").get(7);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }


    public static String TodayWind1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s");
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayWind2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s").get(1);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayWind3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s").get(2);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayWind4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s").get(3);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayWind5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s").get(4);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayWind6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s").get(5);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayWind7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s").get(6);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayWind8(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-wind-speed> div.row-item> span.wind-unit.unit.unit_wind_m_s").get(7);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }


    public static String TodayRain1(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("div.widget-row.widget-row-humidity> div.row-item");
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayRain2(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity> div.row-item").get(1);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayRain3(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity> div.row-item").get(2);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayRain4(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity> div.row-item").get(3);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayRain5(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity> div.row-item").get(4);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayRain6(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity> div.row-item").get(5);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayRain7(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity> div.row-item").get(6);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String TodayRain8(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("div.widget-row.widget-row-humidity> div.row-item").get(7);
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

    public static String Rain(){
        String elm =null;
        try
        {
            Document docOne = Jsoup.connect(URL)
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("div.widget-row.widget-row-humidity> div.row-item");
            for (Element element : weekTemperature.select("div")){
                elm = element.text();
            }
        } catch (Exception e) {
        }
        return elm;
    }

}
