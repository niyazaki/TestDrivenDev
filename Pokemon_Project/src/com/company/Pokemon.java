package com.company;

public class Pokemon {
    private String name;
    private TypeBuilder type;
    private int hp;
    private int attack;
    private int defense;
    private int speed;

    Pokemon(String name, TypeBuilder type, int hp, int attack, int defense, int speed) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }
}
