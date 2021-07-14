package com.example.demo.util.service;

import java.time.LocalDate;
import java.time.LocalTime;

public interface UtilService {
    String randomNumber(int digits);

    LocalDate today();
    LocalTime currentTime();
    String todayAndCurrentTime();
    String randomNumber();
}
