package com.company;

import java.util.HashSet;

public class ConcretePokemon extends PokemonBuilder {
    public String name;
    public int hp;
    public int atk;
    public int def;
    public int spd;
    public ConcreteType type;
    public HashSet strengths;
    public HashSet weaknesses;
    public HashSet immunities;


}
