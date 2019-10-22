package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class ConcreteType extends TypeBuilder {
    public String name;
    public HashSet<String> strenghts = new HashSet<String>();
    public HashSet<String> weaknesses = new HashSet<String>();;
    public HashSet<String> immunities = new HashSet<String>();;

    public ConcreteType(String name){
        this.name = name;
        for (String type : affinities.get(name).keySet()){
            if (affinities.get(name).get(type) == 2.){
                this.strenghts.add(type);
            }
            else if (affinities.get(name).get(type) == 0.5){
                this.weaknesses.add(type);
            }
            else if (affinities.get(name).get(type) == 0.){
                this.immunities.add(type);
            }
        }
    }
}
