package com.example.demo.util.domain;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class UtilDTO {
    // Today Time 메소드
    private LocalDate today;
    private LocalTime currentTime;
}