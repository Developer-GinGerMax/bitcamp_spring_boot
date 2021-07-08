package com.example.demo.dog.domain;

public class DogDTO {
    // Dog
    private String name;
    private String color;
    private String bread;
    private String hungry;

    // Name Set
    public void setName(String name) {
        this.name = name;
    }

    // Name Get
    public String getName() {
        return this.name;
    }

    // Color Set
    public void setColor(String color) {
        this.color = color;
    }

    // Color Get
    public String getColor() {
        return this.color;
    }

    // Bread Set
    public void setBread(String bread) {
        this.bread = bread;
    }

    // Bread Get
    public String getBread() {
        return this.bread;
    }

    // Hungry Set
    public void setHungry(String hungry) {
        this.hungry = hungry;
    }

    // Hungry Get
    public String getHungry() {
        return this.hungry;
    }

    @Override
    public String toString() {
        return String.format("이름은 %s, 색은 %s, 품종은 %s, 배고픔은 %s 임다", name, color, bread, hungry);
    }
}
