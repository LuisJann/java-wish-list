package org.exercise.java;

import java.util.List;
import java.util.Random;

public class ChristmasLetter {
    private String name;
    private String addres;

    private List<String> christmasLetter;

    private boolean goodBoy;


    Random rand = new Random();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public List<String> getChristmasLetter() {
        return christmasLetter;
    }

    public void setChristmasLetter(List<String> christmasLetter) {
        this.christmasLetter = christmasLetter;
    }

    public void send(){
        if (christmasLetter.size()>5){
            throw new RuntimeException("La lettera può avere massimo 5 desideri");
        }
        if (!goodBoy){
            throw new RuntimeException("Quest'anno sei stato un bimbo cattivo :(");
        }
        System.out.println("Ciao " + this.name + " Buon Natale!");
        System.out.println("Ci vediamo a " + this.addres);
        System.out.println("Ti porterò: " + this.christmasLetter);
    }

    public ChristmasLetter(String name, String addres, List<String> christmasLetter) {
        this.name = name;
        this.addres = addres;
        this.christmasLetter = christmasLetter;
        this.goodBoy = rand.nextBoolean();
    }

    @Override
    public String toString() {
        return "ChristmasLetter{" +
                "name='" + name + '\'' +
                ", addres='" + addres + '\'' +
                ", christmasLetter=" + christmasLetter +
                '}';
    }
}
