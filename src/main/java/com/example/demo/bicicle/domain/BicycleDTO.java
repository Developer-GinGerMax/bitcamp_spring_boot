package com.example.demo.bicicle.domain;

import lombok.Data;

@Data
public class BicycleDTO {
    // Bicycle Property
    private int gear;
    private String brand;
    private int speed;

    @Override
    public String toString() {
        return String.format("기어 : %d단 \n브랜드 : %s\n스피드 : %dkm",gear,brand,speed);
    }
}