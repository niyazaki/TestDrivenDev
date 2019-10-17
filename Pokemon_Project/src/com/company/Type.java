package com.company;

import java.util.HashMap;

public class Type {
    public String name;
    public HashMap<String, Double> offensive;
    public HashMap<String, Double> defensive;

    Type(String nameType, HashMap<String, Double> offensive, HashMap<String, Double> defensive){
        this.name = nameType;
        this.offensive = offensive;
        this.defensive = defensive;
    }
}
