package com.limonnana.monthFactory;

import com.limonnana.domain.Month;

import java.time.LocalDateTime;

public class MonthCreator {



    public static void main(String[] args){

        LocalDateTime today =  LocalDateTime.now();     //Today

        Month month = new Month();

        //month = month.getMonth(java.time.Month.SEPTEMBER, 2019,30);

      //  today = month.getNextMonth();

        today = month.getMonthForward(6);

      //  System.out.println(month.toString());

        System.out.println(today.getDayOfMonth() + " " + (today.getMonth()+" ") + today.getYear());



    }
}
