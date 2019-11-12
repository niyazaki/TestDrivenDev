package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FightTest {

    @Test
    void attack() {
        ConcretePokemon Salamèche = new ConcretePokemon() ;
        ConcretePokemon Bulbizar = new ConcretePokemon() ;
        Fight.Attack(Salamèche, Bulbizar);
        assertEquals(50, Salamèche.hp());
    }

    @Test
    void winner() {
        ConcretePokemon Pikachu = new ConcretePokemon() ;
        ConcretePokemon Bulbizar = new ConcretePokemon() ;
        assertEquals("Pikachu", Fight.Winner(Pikachu, Bulbizar));

    }
}