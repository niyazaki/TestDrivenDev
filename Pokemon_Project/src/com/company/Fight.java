package com.company;
import java.lang.Math;

public class Fight
{
    static private double  bonus;
    static private ConcretePokemon first;
    static private ConcretePokemon second;
    static private int pileOuFace;
    static public String winner;

    static void Attack(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        if (pokemon1.type.strenghts.contains(pokemon2.type.name))
        {
            bonus=2;

        }
        else if (pokemon1.type.weaknesses.contains(pokemon2.type.name))
        {
            bonus=0.5;
        }
        else if(pokemon1.type.immunities.contains(pokemon2.type.name))
        {
            bonus=0;
        }
        else
        {
            bonus=1;
        }
        int step = (int) (bonus * (pokemon1.atk-pokemon2.def));
        pokemon2.hp = (pokemon2.hp - step);
    }

    static String Winner(ConcretePokemon pokemon1, ConcretePokemon pokemon2)

    {
        while (pokemon1.hp > 0 & pokemon2.hp > 0) {
            if (pokemon1.spd > pokemon2.spd) {
                first = pokemon1;
                second = pokemon2;
            }
            if (pokemon1.spd < pokemon2.spd) {
                first = pokemon2;
                second = pokemon1;
            }
            if (pokemon1.spd == pokemon2.spd) {
                 pileOuFace = (int)(Math.random() * (2));
                 if(pileOuFace==0)
                 {
                     first = pokemon1;
                     second = pokemon2;
                 }
                 else
                     {
                     first = pokemon2;
                     second = pokemon1;
                 }
            }
            Attack(first, second);
            Attack(second, first);
        }
        if (pokemon2.hp<=0) {
            return pokemon1.name;
        }
        else
        {
            return  pokemon2.name;
        }

    }

    Fight(ConcretePokemon pokemon1, ConcretePokemon pokemon2){
        winner = Winner(pokemon1 ,pokemon2);
    }
}
