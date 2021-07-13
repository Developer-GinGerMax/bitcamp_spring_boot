package com.example.demo.bicicle.service;

import com.example.demo.bicicle.domain.BicycleDTO;
import java.util.List;

public interface BicycleService {
    void add(BicycleDTO bicycle);
    int count();
    List<BicycleDTO> show();
    String changingGear(String change);
    String changingPedalCadence(String cadence);
    String applyingBreaks(String brake);
}