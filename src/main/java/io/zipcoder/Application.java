package io.zipcoder;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.*;
import java.lang.Comparable;

public class Application {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Pet> userPets = new ArrayList<Pet>();

    public static void main(String[] args) {
        Integer amountOfPets = amountOfPets();
        ArrayList<Pet> userPets = petList(amountOfPets);
        System.out.println(userPets);
    }

    public static ArrayList<Pet> petList(Integer amountOfPets){
        Pet pet = new Pet(null);

        for(int i = 0; i < amountOfPets; i++){
            pet.setName(getPetNameInput("What is your pets name? Enter it now!!"));
            pet.setType(getPetTypeInput("What is your pets type? Enter it now!!"));
            userPets.add(pet);

            System.out.println(userPets.get(i).getName());
            System.out.println(userPets.get(i).speak());
        }

        return userPets;
    }

    public static Integer amountOfPets(){
        System.out.println("How many pets do you have?");
        return scanner.nextInt();
    }
    public static String getPetName(){
        System.out.println("What is your pets name? Enter it now!!");
        return scanner.nextLine();
    }

    public static String getPetType(){
        System.out.println("What is your pets type? Enter it now!!");
        return scanner.nextLine();
    }

    public static String getPetNameInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static String getPetTypeInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

}