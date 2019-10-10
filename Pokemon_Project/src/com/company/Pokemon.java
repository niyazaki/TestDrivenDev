package com.company;

public class Pokemon {
    private String name;
    private TypeBuilder type;
    private int pv;
    private int attack;
    private int defense;
    private int speed;

    Pokemon(String name, TypeBuilder type, int pv, int attack, int defense, int speed){
        this.name = name;
        this.type = type;
        this.pv = pv;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.type = type;
    }
}
