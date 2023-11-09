package io.zipcoder.polymorphism;

import io.zipcoder.pets.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many pets you have: ");
        int numberOfPets = scanner.nextInt();

        ArrayList<Pet> pets = new ArrayList<>();

        for(int i = 1; i <= numberOfPets; i++){
            System.out.println("What is the name of Pet 1?: ");
            String name = scanner.nextLine();

        }
    }


}
