package com.example.demo.dog.controller;

import com.example.demo.dog.domain.DogDTO;
import com.example.demo.dog.service.DogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
@RequiredArgsConstructor
public class DogController {

    private final DogService dogService;
    private final ArrayList<DogDTO> dogs;

    public void addDog(DogDTO dog){
        dogs.add(dog);
    }

    public String barking(String bark) {
        return dogService.barking(bark);
    }

    public String fetching(String target) {
        return dogService.fetching(target);
    }

    public String waggingTail() {
        return dogService.waggingTail();
    }
}