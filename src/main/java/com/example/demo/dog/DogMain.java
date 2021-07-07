package com.example.demo.dog;

// state (name, color, breed, hungry) and behavior (barking, fetching, wagging tail)
import java.util.Scanner;

class Dog{
    // Dog
    private String name;
    private String color;
    private String bread;
    private String hungry;
    // Name Set
    public void setName(String name){
        this.name = name;
    }
    // Name Get
    public String getName(){
        return this.name;
    }
    // Color Set
    public void setColor(String color){
        this.color = color;
    }
    // Color Get
    public String getColor(){
        return this.color;
    }
    // Bread Set
    public void setBread(String bread){
        this.bread = bread;
    }
    // Bread Get
    public String getBread(){
        return this.bread;
    }
    // Hungry Set
    public void setHungry(String hungry){
        this.hungry = hungry;
    }
    // Hungry Get
    public String getHungry(){
        return this.hungry;
    }

    @Override
    public String toString() {
        return String.format ("이름은 %s, 색은 %s, 품종은 %s, 배고픔은 %s 임다",name,color,bread,hungry);
    }
}
public class DogMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();//스태틱 공간 위에서 만들어 진다, 어플이라고 보면 쉬움
        System.out.println("이름이 머야?");
        dog.setName(scanner.next());
        System.out.println("색이 머야?");
        dog.setColor(scanner.next());
        System.out.println("품종이 머야?");
        dog.setBread(scanner.next());
        System.out.println("배고파해?");
        dog.setHungry(scanner.next());
        System.out.printf(dog.toString());
    }
}