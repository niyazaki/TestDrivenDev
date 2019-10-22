package com.company;
import java.lang.Math;

public class Fight
{
    private String name;
    private TypeBuilder type;
    private int pv;
    private int attack;
    private int defense;
    private int speed;
    private double bonus;
    private Pokemon first;
    private Pokemon second;
    private int pileOuFace;

    void Attack(Pokemon pokemon1, Pokemon pokemon2) {
        pokemon1.typeAffinities.get("key");
        if (pokemon1.strengths.contains(pokemon2.type))
        {
            bonus=2;

        }
        if (pokemon1.weaknesses.contains(pokemon2.type))
        {
            bonus=0.5;
        }
        if(pokemon1.immunities.contains(pokemon2.type))
        {
            bonus=0;
        }
        else
        {
            bonus=1;
        }
        int step = (int) (bonus * (pokemon1.attack-pokemon2.defense));
        pokemon2.hp = (pokemon2.hp - step);
    }

    String Winner(Pokemon pokemon1, Pokemon pokemon2)
    {
        while (pokemon1.hp > 0 & pokemon2.hp > 0) {
            if (pokemon1.speed > pokemon2.speed) {
                first = pokemon1;
                second = pokemon2;
            }
            if (pokemon1.speed < pokemon2.speed) {
                first = pokemon2;
                second = pokemon1;
            }
            if (pokemon1.speed == pokemon2.speed) {
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
            return (String) pokemon1.name;
        }
        else
        {
            return (String) pokemon2.name;
        }

    }

}
