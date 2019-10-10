package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, HashMap<String, Double>> affinities = new HashMap<>();
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

        affinities.put("Electric", affinity);
        affinities.get("Electric").put("Grass", 0.5);
        affinities.get("Electric").put("Electric", 0.5);
        affinities.get("Electric").put("Dragon", 0.5);
        affinities.get("Electric").put("Water", 2.);
        affinities.get("Electric").put("Flying", 2.);
        affinities.get("Electric").put("Ground", 0.);

        System.out.print(affinities.get("Normal"));
        //System.out.print(affinities.get("Electric"));
	// write your code here
    }
}
