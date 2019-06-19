package com.limonnana.domain;

public class UnitOfCalendarI implements UnitOfCalendar {

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return  userId;
    }
}
