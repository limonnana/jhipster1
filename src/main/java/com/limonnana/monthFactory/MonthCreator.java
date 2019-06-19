package com.limonnana.monthFactory;

import com.limonnana.domain.*;
import com.limonnana.domain.MonthList;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class MonthCreator {

    private static final int MIN = 1;
    private static final int MAX = 8;
    private static final int HOW_MANY_RESERVATIONS_PER_DAY_ARE_ALLOWED = 7;


    public static void main(String[] args){

        MonthCreator mc = new MonthCreator();
        MonthList monthList = mc.getMockTestListReservations();
        System.out.println(monthList.getM().values().toArray());
 /*
        LocalDateTime today =  LocalDateTime.now();     //Today

        MonthList monthList = new MonthList();
        monthList = monthList.getCurrentMonth(14);
        Map m =  monthList.getM();
        UnitOfCalendar u = new UnitOfCalendarI();

        m.forEach((key, value) -> {
            Integer keyMap = (Integer) key;
            UnitOfCalendar[] uc = (UnitOfCalendar[])value;
            for(int i=0;i<uc.length;i++){
                UnitOfCalendar unit = new UnitOfCalendarI();
                    unit.setUserId("dogName_user_" + i);
                uc[i] = unit;
                }


         //   System.out.println("Key : " + key + " Value : " + (UnitOfCalendar)value);
        });



        //monthList = monthList.getMonth(java.time.MonthList.SEPTEMBER, 2019,30);

      //  today = monthList.getNextMonth();

       // today = monthList.getMonthForward(6);

        System.out.println(monthList.toString());

    //    System.out.println(today.getDayOfMonth() + " " + (today.getMonth()+" ") + today.getYear());

    */



    }

    public MonthList getMockTestListReservations(){

        MonthList monthList = new MonthList();
        monthList = monthList.getCurrentMonth();
        monthList.setId(1L);
        Map m =  monthList.getM();
        UnitOfCalendar u = new UnitOfCalendarI();

        m.forEach((key, value) -> {
            Integer keyMap = (Integer) key;
            List<UnitOfCalendar> uc = (List<UnitOfCalendar>)value;
            for(int i=0;i<HOW_MANY_RESERVATIONS_PER_DAY_ARE_ALLOWED;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
                if((i % randomNum) == 0){
                    UnitOfCalendar unit = new UnitOfCalendarI();
                    unit.setUserId("dogName_user_" + i);
                    uc.add(unit);
                }
            }
            //   System.out.println("Key : " + key + " Value : " + (UnitOfCalendar)value);
        });

        return monthList;
    }
    

    public MonthArrayOrder getMockTestReservations(){

        MonthArrayOrder monthArrayOrder = new MonthArrayOrder();
        monthArrayOrder = monthArrayOrder.getCurrentMonth(14);
        Map m =  monthArrayOrder.getM();
        UnitOfCalendar u = new UnitOfCalendarI();

        m.forEach((key, value) -> {
            Integer keyMap = (Integer) key;
            UnitOfCalendar[] uc = (UnitOfCalendar[])value;
            for(int i=0;i<uc.length;i++){
                int randomNum = ThreadLocalRandom.current().nextInt(MIN, MAX + 1);
                if((i % randomNum) == 0){
                    UnitOfCalendar unit = new UnitOfCalendarI();
                    unit.setUserId("dogName_user_" + i);
                    uc[i] = unit;
                }
            }
            //   System.out.println("Key : " + key + " Value : " + (UnitOfCalendar)value);
        });

        return monthArrayOrder;
    }


}
