package com.limonnana.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class Month {

    private  java.time.Month name;
    private  int year;
    private  int from;
    private  int untill;
    private  int amountMaximunUnitsPerDay;
    private  Map<Integer, UnitOfCalendar[]> m  = new TreeMap<>();

    public Month(){}

    public Month getMonth(java.time.Month name, int year, int amountMaximunUnitsPerDay){

        Month month = new Month();
        LocalDate ld = LocalDate.of(year, name, 1);
        month.setFrom(1);
        month.setName(name);
        month.setUntill(ld.lengthOfMonth());
        month.setYear(year);
        for(int i=1;i<=month.getUntill();i++){
            UnitOfCalendar[] units = new UnitOfCalendar[amountMaximunUnitsPerDay];
            month.getM().put(i, units);
        }

        return month;
    }

    public Month getMonth(LocalDateTime day, int amountMaximunUnitsPerDay){

        Month month = new Month();
        LocalDateTime now = day;
        int yearCurrent = now.getYear();
        month.setName(now.getMonth());
        month.setFrom(1);
        month.setUntill(LocalDate.now().lengthOfMonth());
        month.setYear(yearCurrent);

        for(int i=1;i<=month.getUntill();i++){
            UnitOfCalendar[] units = new UnitOfCalendar[amountMaximunUnitsPerDay];
            month.getM().put(i, units);
        }

        return month;
    }

    public Month getCurrent(int amountMaximunUnitsPerDay){
        Month month = new Month();
        LocalDateTime now = LocalDateTime.now();
        int yearCurrent = now.getYear();
        int day = now.getDayOfMonth();
        month.setName(now.getMonth());
        month.setFrom(day);
        month.setUntill(LocalDate.now().lengthOfMonth());
        month.setYear(yearCurrent);

        for(int i=day;i<=month.getUntill();i++){
            UnitOfCalendar[] units = new UnitOfCalendar[amountMaximunUnitsPerDay];
            month.getM().put(i, units);
        }

        return month;
    }

    public LocalDateTime getMonthForward(int howManyMonthForward){

        LocalDateTime firstDayNextMonth = getNextMonth();
        int month = firstDayNextMonth.getMonth().getValue();
        int nextMonth = month + 1;
       // firstDayNextMonth.
        return firstDayNextMonth.plusMonths(howManyMonthForward);
    }

    public LocalDateTime getNextMonth(){
        LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        int untill = LocalDate.now().lengthOfMonth();
        int toEndOfThisMonth = (untill - day) + 1;

        return now.plusDays(toEndOfThisMonth);
    }


    public java.time.Month getName() {
        return name;
    }

    public void setName(java.time.Month name) {
        this.name = name;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getUntill() {
        return untill;
    }

    public void setUntill(int untill) {
        this.untill = untill;
    }



    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getAmountMaximunUnitsPerDay() {
        return amountMaximunUnitsPerDay;
    }

    public void setAmountMaximunUnitsPerDay(int amountMaximunUnitsPerDay) {
        this.amountMaximunUnitsPerDay = amountMaximunUnitsPerDay;
    }

    public Map<Integer, UnitOfCalendar[]> getM() {
        return m;
    }

    public void setM(Map<Integer, UnitOfCalendar[]> m) {
        this.m = m;
    }

    @Override
    public String toString() {
        String result = "";
        result = "month: " + name + " ," +
            " year: " + year + " , " +
            " from: " + from + " untill: " + untill + " mapSize: " + getM().size();
        return result;
    }
}
