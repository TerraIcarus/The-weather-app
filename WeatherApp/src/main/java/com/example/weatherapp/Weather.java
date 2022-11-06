package com.example.weatherapp;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Weather {
   // private String URL;
    public String weatherNow(){
        try
        {
            Document document = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/now/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();

            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();

            Elements weatherNow = document.select("div.HhSR.GyfK");
//            Parser pars = new Parser(weatherNow);
//            //System.out.println(pars);
            System.out.println(weatherNow);
        }catch (Exception e)
        {

        }
        return null;
    }

    public String wind(){
        try
        {
            Document document = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/now/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();

            Element wind = document.selectFirst("span.VaOz.d2qU");
            System.out.println(wind);
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Elements weekTemperature = docOne.select("span.AY6t");
            System.out.println(weekTemperature);
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDays(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Elements weekDays = docOne.select("span.B3rb");
            System.out.println(weekDays);
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDate(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Elements weekDate = docOne.select("span.PADa");
            System.out.println(weekDate);

        }
        catch (Exception e)
        {

        }
        return null;
    }

}
