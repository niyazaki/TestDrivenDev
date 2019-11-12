package com.company;

import org.junit.jupiter.api.Test;

import java.util.Timer;

import static org.junit.jupiter.api.Assertions.*;

class FightTest {

    @Test
    void attack() {
        ConcretePokemon pikachu = new PokemonBuilder("Pikachu", new ConcreteType("Electric"), new Stats(35,55,40,90));
        ConcretePokemon squirtle = new PokemonBuilder("Squirtle", new ConcreteType("Water"), new Stats(50,48,65,43));
        Fight.Attack(pikachu, squirtle);
        assertEquals(50, pikachu.hp);
    }

    @Test
    void winner() {
        ConcretePokemon pikachu = new PokemonBuilder("Pikachu", new ConcreteType("Electric"), new Stats(35,55,40,90));
        ConcretePokemon squirtle = new PokemonBuilder("Squirtle", new ConcreteType("Water"), new Stats(10,48,65,43));
        assertEquals("Pikachu", Fight.Winner(pikachu, squirtle));

    }
    @Test
    void metrics() {
        long start = System.nanoTime();
        //winner();
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.print(timeElapsed);

    }
}