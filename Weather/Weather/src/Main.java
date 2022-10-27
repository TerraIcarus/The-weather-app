import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
            try
            {
                Document document = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/now/")
                        .userAgent("Chrome/106.0.0.0 Safari/537.36")
                        .referrer("http://www.google.com")
                        .get();
                /*Document doc = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/tomorrow/")
                        .userAgent("Chrome/106.0.0.0 Safari/537.36")
                        .referrer("http://www.google.com")
                        .get();*/
                Document docOne = Jsoup.connect("https://weather.rambler.ru/vo-vladimire/")
                        .userAgent("Chrome/106.0.0.0 Safari/537.36")
                        .referrer("http://www.google.com")
                        .get();
                Elements weatherNow = document.select("div.HhSR.GyfK"); //погода сейчас
                Elements wind = document.select("span.VaOz.d2qU"); //ветер давление новолуние магнитное поле
                // Elements tomorrow = doc.select("div.HhSR.GyfK"); //погода на завтра
                Elements tomorrowOne = docOne.select("span.AY6t"); //погода на неделю лол
                Elements what = docOne.select("span.B3rb"); //день недели
                Elements why = docOne.select("span.PADa"); //какой день
                System.out.println(weatherNow);
                System.out.println(" ");
                System.out.println(wind);
                System.out.println(" ");
                // System.out.println(tomorrow);
                //System.out.println(" ");
                System.out.println(tomorrowOne);
                System.out.println(" ");
                System.out.println(what);
                System.out.println(" ");
                System.out.println(why);


                Thread.sleep(1000);
            }
            catch (Exception e)
            {

            }
        }
    }
}