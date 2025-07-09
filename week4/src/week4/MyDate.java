/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author TanDungNguyen
 */
public class MyDate {
    private int year, month, day;
    private static final String[] MONTHS = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    private static final String[] DAYS = {
        "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
    };
    private static final int[] DAYS_IN_MONTHS = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12) return false;
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) maxDay = 29;
        return day >= 1 && day <= maxDay;
    }
    public static int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (day + 13 * (month + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7;
    }
    public MyDate nextDay() {
        int d = day + 1, m = month, y = year;
        int maxDay = DAYS_IN_MONTHS[m - 1];
        if (m == 2 && isLeapYear(y)) maxDay = 29;
        if (d > maxDay) {
            d = 1;
            m++;
            if (m > 12) {
                m = 1;
                y++;
            }
        }
        return new MyDate(y, m, d);
    }
    public MyDate previousDay() {
        int d = day - 1, m = month, y = year;
        if (d < 1) {
            m--;
            if (m < 1) {
                m = 12;
                y--;
            }
            d = DAYS_IN_MONTHS[m - 1];
            if (m == 2 && isLeapYear(y)) d = 29;
        }
        return new MyDate(y, m, d);
    }
    public MyDate nextMonth() {
        int m = month + 1, y = year;
        if (m > 12) {
            m = 1;
            y++;
        }
        int maxDay = DAYS_IN_MONTHS[m - 1];
        if (m == 2 && isLeapYear(y)) maxDay = 29;
        int d = Math.min(day, maxDay);
        return new MyDate(y, m, d);
    }
    public MyDate previousMonth() {
        int m = month - 1, y = year;
        if (m < 1) {
            m = 12;
            y--;
        }
        int maxDay = DAYS_IN_MONTHS[m - 1];
        if (m == 2 && isLeapYear(y)) maxDay = 29;
        int d = Math.min(day, maxDay);
        return new MyDate(y, m, d);
    }
    public MyDate nextYear() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year + 1)) maxDay = 29;
        int d = Math.min(day, maxDay);
        return new MyDate(year + 1, month, d);
    }
    public MyDate previousYear() {
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year - 1)) maxDay = 29;
        int d = Math.min(day, maxDay);
        return new MyDate(year - 1, month, d);
    }
    public String toString() {
        int dow = getDayOfWeek(year, month, day);
        return String.format("%s %d %s %d", DAYS[dow], day, MONTHS[month - 1], year);
    }
}

