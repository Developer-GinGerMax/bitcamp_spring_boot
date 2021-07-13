package com.example.demo.Calcu.service;

import com.example.demo.Calcu.domain.CalcuDTO;

public interface CalcuService {
    int add(CalcuDTO calcu);
    int subtract(CalcuDTO calcu);
    int multiple(CalcuDTO calcu);
    int device(CalcuDTO calcu);
    int remain(CalcuDTO calcu);
    int [] sequence3(CalcuDTO calcu);

}