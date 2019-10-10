package com.company;
import java.util.HashMap;

abstract class TypeBuilder {
    private HashMap<String, HashMap<String, Double>> affinities = new HashMap<>();

    TypeBuilder() {
        HashMap<String, Double> affinity = new HashMap<>();
        affinity.put("Normal", 1.);
        affinity.put("Fire", 1.);
        affinity.put("Water", 1.);
        affinity.put("Grass", 1.);
        affinity.put("Electric", 1.);
        affinity.put("Ice", 1.);
        affinity.put("Fighting", 1.);
        affinity.put("Poison", 1.);
        affinity.put("Ground", 1.);
        affinity.put("Flying", 1.);
        affinity.put("Psychic", 1.);
        affinity.put("Bug", 1.);
        affinity.put("Rock", 1.);
        affinity.put("Ghost", 1.);
        affinity.put("Dragon", 1.);

        //Normal
        affinities.put("Normal", affinity);
        affinities.get("Normal").put("Rock", 0.5);
        affinities.get("Normal").put("Ghost", 0.);

        //Fire
        affinities.put("Fire", affinity);
        affinities.get("Fire").put("Fire", 0.5);
        affinities.get("Fire").put("Water", 0.5);
        affinities.get("Fire").put("Grass", 2.);
        affinities.get("Fire").put("Ice", 2.);
        affinities.get("Fire").put("Bug", 2.);
        affinities.get("Fire").put("Rock", 0.5);
        affinities.get("Fire").put("Dragon", 0.5);

        //Water
        affinities.put("Water", affinity);
        affinities.get("Water").put("Fire", 2.);
        affinities.get("Water").put("Water", 0.5);
        affinities.get("Water").put("Grass", 2.);
        affinities.get("Water").put("Ground", 2.);
        affinities.get("Water").put("Rock", 2.);
        affinities.get("Water").put("Dragon", 0.5);

        //Grass
        affinities.put("Grass", affinity);
        affinities.get("Grass").put("Fire", 0.5);
        affinities.get("Grass").put("Grass", 0.5);
        affinities.get("Grass").put("Poison", 0.5);
        affinities.get("Grass").put("Flying", 0.5);
        affinities.get("Grass").put("Bug", 0.5);
        affinities.get("Grass").put("Dragon", 0.5);
        affinities.get("Grass").put("Water", 2.);
        affinities.get("Grass").put("Ground", 2.);

        //Electric
        affinities.put("Electric", affinity);
        affinities.get("Electric").put("Grass", 0.5);
        affinities.get("Electric").put("Electric", 0.5);
        affinities.get("Electric").put("Dragon", 0.5);
        affinities.get("Electric").put("Water", 2.);
        affinities.get("Electric").put("Flying", 2.);
        affinities.get("Electric").put("Ground", 0.);

        //Ice
        affinities.put("Ice", affinity);
        affinities.get("Ice").put("Water", 0.5);
        affinities.get("Ice").put("Ice", 0.5);
        affinities.get("Ice").put("Grass", 2.);
        affinities.get("Ice").put("Ground", 2.);
        affinities.get("Ice").put("Flying", 2.);
        affinities.get("Ice").put("Dragon", 2.);
    }
}
