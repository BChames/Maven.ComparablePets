package io.zipcoder;

import java.util.Comparator;
import java.lang.Comparable;

public class Cat extends Pet {

    public Cat(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "MEOOOOOOOOOOWWWW!!!!!!!!!";
    }

    public void sortByName(){
    }
}
