package DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
  public static String dateToString(Date date, String format) {
    SimpleDateFormat formatDate = new SimpleDateFormat(format);
    return formatDate.format(date);
  }

  public static Date stringToDate(String s, String format) throws ParseException {
    SimpleDateFormat formatDate = new SimpleDateFormat(format);
    return formatDate.parse(s);
  }
}
