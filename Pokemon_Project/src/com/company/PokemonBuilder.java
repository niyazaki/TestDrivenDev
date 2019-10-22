package com.company;

import java.util.HashSet;

public class PokemonBuilder {
    public String name;
    public int hp;
    public int atk;
    public int def;
    public int spd;
    public HashSet strengths;
    public HashSet weaknesses;
    public HashSet immunities;

    PokemonBuilder(String name, ConcreteType type, Stats stats) {
        this.name = name;
        this.hp = stats.hp;
        this.atk = stats.atk;
        this.def = stats.def;
        this.spd = stats.spd;
        this.strengths = type.strengths;
        this.weaknesses = type.weaknesses;
        this.immunities = type.immunities;
    }
}
