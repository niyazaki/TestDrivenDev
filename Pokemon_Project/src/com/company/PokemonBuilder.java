package com.company;

import java.util.HashSet;
import java.util.Scanner;

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
    public ConcretePokemon CreatePokemon(){
        Scanner myObj = new Scanner(System.in);
        String pokemonName;
        String pokemonType;
        int pokemonHp;
        int pokemonAtk;
        int pokemonDef;
        int pokemonSpd;

        System.out.println("Enter Pokemon Name");
        pokemonName = myObj.nextLine();

        System.out.println("Enter Pokemon Type");
        pokemonType = myObj.nextLine();

        System.out.println("Enter Pokemon HP (Health Points)");
        pokemonHp = myObj.nextInt();
        System.out.println("Enter Pokemon Attack");
        pokemonAtk = myObj.nextInt();
        System.out.println("Enter Pokemon Defense");
        pokemonDef = myObj.nextInt();
        System.out.println("Enter Pokemon Speed");
        pokemonSpd = myObj.nextInt();

        ConcretePokemon newPokemon = new PokemonBuilder(pokemonName, new ConcreteType(pokemonType), new Stats(pokemonHp, pokemonAtk, pokemonDef, pokemonSpd));
        return newPokemon
    }
}
