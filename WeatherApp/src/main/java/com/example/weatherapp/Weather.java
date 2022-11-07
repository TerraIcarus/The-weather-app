package com.example.weatherapp;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Weather {
   // private String URL; сменить со владимира на др города


    public String weatherNow(){
        try
        {
            Document document = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/now/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();

            Elements weatherNow = document.select("div.HhSR.GyfK");
            for (Element element : weatherNow.select("div")){
                System.out.println(element.text());}

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
            for (Element element : wind.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature1(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.selectFirst("span.AY6t");
            for (Element element : weekTemperature.select("span")){
                System.out.println(element.text());}
        }

        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature2(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(1);
            for (Element element : weekTemperature.select("span")){
                System.out.println(element.text());}
        }

        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature3(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(2);
            for (Element element : weekTemperature.select("span")){
                System.out.println(element.text());}
        }

        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature4(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(3);
            for (Element element : weekTemperature.select("span")){
                System.out.println(element.text());}
        }

        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature5(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(4);
            for (Element element : weekTemperature.select("span")){
                System.out.println(element.text());}
        }

        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature6(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(5);
            for (Element element : weekTemperature.select("span")){
                System.out.println(element.text());}
        }

        catch (Exception e)
        {

        }
        return null;
    }

    public String weekTemperature7(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekTemperature = docOne.select("span.AY6t").get(6);
            for (Element element : weekTemperature.select("span")){
                System.out.println(element.text());}
        }

        catch (Exception e)
        {

        }
        return null;
    }






    public String weekDays1(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.selectFirst("span.B3rb");
            for (Element element : weekDays.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDays2(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(1);
            for (Element element : weekDays.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDays3(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(2);
            for (Element element : weekDays.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDays4(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(3);
            for (Element element : weekDays.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDays5(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(4);
            for (Element element : weekDays.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDays6(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(5);
            for (Element element : weekDays.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDays7(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDays = docOne.select("span.B3rb").get(6);
            for (Element element : weekDays.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }








    public String weekDate1(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.selectFirst("span.PADa");
            for (Element element : weekDate.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDate2(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(1);
            for (Element element : weekDate.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDate3(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(2);
            for (Element element : weekDate.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDate4(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(3);
            for (Element element : weekDate.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDate5(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(4);
            for (Element element : weekDate.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDate6(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(5);
            for (Element element : weekDate.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

    public String weekDate7(){
        try
        {
            Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                    .userAgent("Chrome/106.0.0.0 Safari/537.36")
                    .referrer("http://www.google.com")
                    .get();
            Element weekDate = docOne.select("span.PADa").get(6);
            for (Element element : weekDate.select("span")){
                System.out.println(element.text());}
        }
        catch (Exception e)
        {

        }
        return null;
    }

}
