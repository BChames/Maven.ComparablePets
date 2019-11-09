package io.zipcoder;

import java.lang.Comparable;
import java.util.Comparator;

public class Pet {
    private String name;

    public Pet(String name){
        this.name = name;
    }
    public String speak(){
        return "blah";
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
