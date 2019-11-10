package io.zipcoder;

import java.lang.Comparable;
import java.util.Collections;
import java.util.Comparator;

public class Pet implements Comparable<Pet>{
     String name;
     String type;


    public Pet() {
        this.name = "";
        this.type = "";
    }

    public Pet(String name, String type) {
        this.name = "";
        this.type = "";
    }

    public Pet(String name){
        this.name = name;
    }
    public String speak(){
        return "blah";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int compareTo(Pet pet) {

            int compareName = (this.getName()).compareTo(pet.getName());
            if (compareName != 0){
                return compareName;
            }
            return (this.getType().compareTo(pet.getType()));
        }
    }
