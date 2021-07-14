package com.example.demo.util.service;

import com.example.demo.util.domain.UtilDTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class UtilServiceImpl implements UtilService{

    @Override
    public String randomNumber() {
        return null;
    }

    @Override
    public String todayAndCurrentTime() {
        return String.format("%s %s",today(),currentTime());
    }
    UtilDTO util = new UtilDTO();

    @Override
    public String randomNumber(int digits) {
        String result = "";
        for(int i = 0; i<digits; i++){
            result += (int) Math.random() * 10000 + 1000;
        }
        return "";
    }
    @Override
    public LocalDate today() {
        util.setToday(LocalDate.now());
        return util.getToday();
    }
    @Override
    public LocalTime currentTime() {
        util.setCurrentTime(LocalTime.now());
        return util.getCurrentTime();
    }
}
