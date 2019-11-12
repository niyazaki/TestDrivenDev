package com.company;

import java.util.HashSet;

public class PokemonBuilder {

    PokemonBuilder(String name, ConcreteType type, Stats stats) {
        ConcretePokemon pokemon = new ConcretePokemon();
        pokemon.name = name;
        pokemon.hp = stats.hp;
        pokemon.atk = stats.atk;
        pokemon.def = stats.def;
        pokemon.spd = stats.spd;
        pokemon.type = type;
        pokemon.strengths = type.strenghts;
        pokemon.weaknesses = type.weaknesses;
        pokemon.immunities = type.immunities;
    }
}
