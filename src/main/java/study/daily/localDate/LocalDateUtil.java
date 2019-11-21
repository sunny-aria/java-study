package study.daily.localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * 描述：LocalDate 获取周，月开始时间
 *
 * @author hd
 * @date 2019-11-21 11:53
 **/
public class LocalDateUtil {
    private final static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final static DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 将字符串按照格式转为日期
     * @param date
     * @param formatter
     * @return
     */
    public static LocalDate parseStrDate(String date,String formatter){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formatter);
        return LocalDate.parse(date,dtf);
    }

    /**
     * 将日期格化式
     * @param localDate
     * @param formatter
     * @return
     */
    public static String formatLocalDate(LocalDate localDate,String formatter){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formatter);
        return localDate.format(dtf);
    }

    /**
     * 获取 00:00:00
     * @return
     */
    public static String dayStartTime(String date){
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.parse(date,dtf), LocalTime.MIN);
        return localDateTime.format(df);
    }

    /**
     * 获取 23：59：59
     * @return
     */
    public static String dayEndTime(String date){
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.parse(date,dtf), LocalTime.MAX);
        return localDateTime.format(df);
    }

    /**
     * 获取 12:00:00
     * @return
     */
    public static String dayMiddleTime(String date){
        LocalDateTime localDateTime = LocalDateTime.of(LocalDate.parse(date,dtf), LocalTime.NOON);
        return localDateTime.format(df);
    }

    /**
     * 获取周开始日期
     * @param date
     * @return
     */
    public static String firstDayOfWeek(String date){
        TemporalAdjuster FIRST_OF_WEEK =
                TemporalAdjusters.ofDateAdjuster(localDate -> localDate.minusDays(localDate.getDayOfWeek().getValue()- DayOfWeek.MONDAY.getValue()));
        return dtf.format(LocalDate.parse(date,dtf).with(FIRST_OF_WEEK));
    }

    /**
     * 获取周结束日期
     * @param date
     * @return
     */
    public static String endDayOfWeek(String date){
        TemporalAdjuster LAST_OF_WEEK =
                TemporalAdjusters.ofDateAdjuster(localDate -> localDate.plusDays(DayOfWeek.SUNDAY.getValue() - localDate.getDayOfWeek().getValue()));
        return dtf.format(LocalDate.parse(date,dtf).with(LAST_OF_WEEK));
    }

    /**
     * 获取月开始日期
     * @param date
     * @return
     */
    public static String firstDayOfMonth(String date){
        LocalDate inputDate = LocalDate.parse(date,dtf);
        return dtf.format(inputDate.with(TemporalAdjusters.firstDayOfMonth()));
    }

    /**
     * 获取月结束日期
     * @param date
     * @return
     */
    public static String endDayOfMonth(String date){
        LocalDate inputDate = LocalDate.parse(date,dtf);
        return dtf.format(inputDate.with(TemporalAdjusters.lastDayOfMonth()));
    }

    /**
     * 获取下个月开始日期
     * @param date
     * @return
     */
    public static String firstDayOfNextMonth(String date){
        LocalDate inputDate = LocalDate.parse(date,dtf);
        return  dtf.format(inputDate.with(TemporalAdjusters.firstDayOfNextMonth()));
    }

    /**
     * 获取下个年开始日期
     * @param date
     * @return
     */
    public static String firstDayOfNextYear(String date){
        LocalDate inputDate = LocalDate.parse(date,dtf);
        return  dtf.format(inputDate.with(TemporalAdjusters.firstDayOfNextYear()));
    }

    public static void main(String[] args) {
        System.out.println(firstDayOfNextMonth("2019-11-19"));
    }
}
