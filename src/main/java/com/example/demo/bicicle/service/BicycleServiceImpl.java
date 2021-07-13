package com.example.demo.bicicle.service;

import com.example.demo.bicicle.domain.BicycleDTO;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BicycleServiceImpl implements BicycleService{
    private BicycleDTO bicycle;
    private ArrayList<BicycleDTO> bicycles;
    public BicycleServiceImpl(){
        bicycle = new BicycleDTO();
        bicycles = new ArrayList<>();
    }

    @Override
    public void add(BicycleDTO bicycle) {
        bicycles.add(bicycle);
    }

    @Override
    public int count() {
        return bicycles.size();
    }

    @Override
    public List<BicycleDTO> show() {
        return bicycles;
    }

    @Override
    public String changingGear(String change) {
        return bicycle.toString()+ change +" 기어바꿈";
    }

    @Override
    public String changingPedalCadence(String cadence) {
        return bicycle.toString()+ cadence +" 케이던스";
    }

    @Override
    public String applyingBreaks(String brake) {
        return "브레이크를 잡았다";
    }
}
