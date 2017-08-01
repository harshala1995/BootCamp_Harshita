/**
 * Created by marwahh on 7/25/2017.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

class YearValues {

    public static final int y1 = 2015;
    public static final int y2 = 2016;
    public static final int y3 = 2017;
    public static final int y4 = 2018;
    public static final int y5 = 2019;
    public static final int y6 = 2020;
}


enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
enum Month{
    jan, feb, mar, apr, may, jun, jul, aug, sept, oct, nov, dec
}
enum Year{
    y1, y2, y3, y4, y5, y6
}


@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
@interface Timestamp{
    Day day();
    Month month();
    Year year();
}