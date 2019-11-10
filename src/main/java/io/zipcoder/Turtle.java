package io.zipcoder;

import java.lang.Comparable;
import java.util.Comparator;

public class Turtle extends Pet {

    public Turtle() {
        this.name = "";
        this.type =  "";
    }

    public Turtle(String name, String type){
        super(name, type);
    }

    //"Roar" because turtles are my favorite animal lol
    public String speak(){
        return "ROOAAAAARR!!!";
    }
}