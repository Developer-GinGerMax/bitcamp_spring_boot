package com.example.demo.bicicle.controller;

import com.example.demo.bicicle.domain.BicycleDTO;
import com.example.demo.bicicle.service.BicycleService;
import com.example.demo.bicicle.service.BicycleServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class BicycleController {
    private BicycleService bicycleService;
    public BicycleController(){
        bicycleService = new BicycleServiceImpl();
    }
    public void add(BicycleDTO bicycle){
        bicycleService.add(bicycle);
    }
    public int count(){
        return bicycleService.count();
    }
    public void show(){
        System.out.println("자전거의 수 : "+bicycleService.count());
        System.out.println(bicycleService.show());
    }
    public String changingGear(String change){
        return bicycleService.changingGear(change);
    }
    public String changingPedalCadence(String cadence){
        return bicycleService.changingPedalCadence(cadence);
    }
    public String applyingBreaks(String brake){
        return bicycleService.applyingBreaks(brake);
    }
}