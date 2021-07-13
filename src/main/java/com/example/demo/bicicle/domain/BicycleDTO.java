package com.example.demo.bicicle.domain;

import lombok.Data;

@Data
public class BicycleDTO {
    // Bicycle Property
    private String gear;
    private String brand;
    private String speed;

    @Override
    public String toString() {
        return String.format("기어 : %s단 \n 케이던스 : %s\n 브레이크 : %s km",gear,brand,speed);
    }
}