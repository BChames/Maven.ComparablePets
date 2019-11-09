package io.zipcoder;

import java.lang.Comparable;
import java.util.Comparator;

public class Dog extends Pet {

    public Dog(String name){
        super(name);
    }
    @Override
    public String speak(){
        return "BARK BARK!!!";
    }
}
