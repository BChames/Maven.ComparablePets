package io.zipcoder;

import java.util.Comparator;
import java.lang.Comparable;

public class Cat extends Pet {

    public Cat() {
        this.name = "";
        this.type =  "";
    }

    public Cat(String name, String type){
        super(name, type);
    }



    @Override
    public String speak(){
        return "MEOOOOOOOOOOWWWW!!!!!!!!!";
    }

}
