import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Normalize {
    public static String normalize(String string)
    {
        Pattern pattern =Pattern.compile("");
        Matcher matcher = pattern.matcher(string);
        if (matcher.find())
        {
            return matcher.group();
        }
        else {
            return null;
        }
    }
}
