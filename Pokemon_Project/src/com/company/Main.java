package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        ConcretePokemon pikachu = new PokemonBuilder("Pikachu", new ConcreteType("Electric"), new Stats(35,55,40,90));
        ConcretePokemon squirtle = new PokemonBuilder("Squirtle", new ConcreteType("Water"), new Stats(44,48,65,43));

        Fight fight1 = new Fight(pikachu, squirtle);

        System.out.print(fight1.winner);
    }

}
