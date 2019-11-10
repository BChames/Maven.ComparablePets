package io.zipcoder;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.Comparator;

public class Dog extends Pet {


    public Dog() {
        this.name = "";
        this.type =  "";
    }

    public Dog(String name, String type){
        super(name,type);
    }
    @Override
    public String speak(){
        return "BARK BARK!!!";
    }
}
