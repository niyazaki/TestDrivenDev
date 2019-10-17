package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        /*HashMap<String, HashMap<String, Double>> affinities = new HashMap<>();
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

        //Psychic
        affinities.put("Psychic", (HashMap)affinity.clone());
        affinities.get("Psychic").put("Poison", 2.);
        affinities.get("Psychic").put("Fighting", 2.);
        affinities.get("Psychic").put("Psychic", 0.5);

        //Bug
        affinities.put("Bug", (HashMap)affinity.clone());
        affinities.get("Bug").put("Grass", 2.);
        affinities.get("Bug").put("Poison", 2.);
        affinities.get("Bug").put("Psychic", 2.);
        affinities.get("Bug").put("Fire", 0.5);
        affinities.get("Bug").put("Fighting", 0.5);
        affinities.get("Bug").put("Flying", 0.5);
        affinities.get("Bug").put("Ghost", 0.5);

        //Dark
        HashMap<String, Double> offensiveDark = (HashMap)affinity.clone();
        offensiveDark.put("Ice", 0.5);
        offensiveDark.put("Psychic", 2.);
        offensiveDark.put("Ghost", 2.);

        HashMap<String, Double> defensiveDark = (HashMap)affinity.clone();
        defensiveDark.put("Dark", 0.5);
        defensiveDark.put("Fighting", 2.);
        defensiveDark.put("Psychic", 0.);
        defensiveDark.put("Bug", 2.);
        defensiveDark.put("Ghost", 0.5);

        Type dark = new Type("Dark", offensiveDark, defensiveDark);

        affinities.put(dark.name, dark.offensive);
        for (String defName : dark.defensive.keySet()){
            for (String nameType : affinities.keySet()){
                if(defName == nameType){
                    affinities.get(nameType).put(dark.name, dark.defensive.get(nameType));
                }
            }
        }

        System.out.print(affinities.get("Psychic"));
        System.out.print(affinities.get("Bug"));
        System.out.print(affinities.get("Dark"));*/

        Type

        // write your code here
    }
}
