package DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoTest {
  public static void main(String[] args) throws ParseException {
    DateUtils dateUtils = new DateUtils();
    Date date = new Date();
    String stringDate = dateUtils.dateToString(date, "yyyy年");
    System.out.println(stringDate);

    Date dateDate = dateUtils.stringToDate(stringDate, "yyyy年");
    System.out.println(dateDate);
  }

}
