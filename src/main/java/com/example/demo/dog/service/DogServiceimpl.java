package com.example.demo.dog.service;

import com.example.demo.dog.domain.DogDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DogServiceimpl implements DogService {
    private DogDTO dog;
    private ArrayList<DogDTO> dogs;

    @Override
    public String barking(String bark) {
        return dog.toString()+ bark + "짖는다";
    }

    @Override
    public String fetching(String target) {
        return dog.toString()+ target + "을 물어온다";
    }

    @Override
    public String waggingTail() {
        return "꼬리를 흔든다";
    }
}
