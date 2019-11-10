package io.zipcoder;

import java.util.Comparator;

public class TypeSorter implements Comparator<Pet> {

    @Override
    public int compare(Pet pet1, Pet pet2) {
        int typeCompare = pet1.getType().compareTo(pet2.getType());
        if (typeCompare != 0){
            return typeCompare;
        }
        return pet1.getName().compareTo(pet2.getName());
    }
}