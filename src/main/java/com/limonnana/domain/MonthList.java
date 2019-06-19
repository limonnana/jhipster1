package com.limonnana.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.time.Month;

public class MonthList {

    private Long id;
    private Month name;
    private int year;
    private int from;
    private int untill;
    private Map<Integer, List<UnitOfCalendar>> m = new TreeMap<>();


    public MonthList getCurrentMonth() {
        MonthList month = new MonthList();
        LocalDateTime now = LocalDateTime.now();
        int yearCurrent = now.getYear();
        int day = now.getDayOfMonth();
        month.setName(now.getMonth());
        month.setFrom(day);
        month.setUntill(LocalDate.now().lengthOfMonth());
        month.setYear(yearCurrent);

        for (int i = day; i <= month.getUntill(); i++) {
            List<UnitOfCalendar> units = new ArrayList<>();
            month.getM().put(i, units);
        }

        return month;
    }

    public Month getName() {
        return name;
    }

    public void setName(Month name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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

    public Map<Integer, List<UnitOfCalendar>> getM() {
        return m;
    }

    public void setM(Map<Integer, List<UnitOfCalendar>> m) {
        this.m = m;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
