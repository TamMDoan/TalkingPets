package io.zipcoder.polymorphism;

import io.zipcoder.pets.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter how many pets you have: ");
        int numberOfPets = scanner.nextInt();

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> types = new ArrayList<>();

        scanner.nextLine();

        for(int i = 1; i <= numberOfPets; i++){
            System.out.println("What is the name of Pet "+i+"?: ");
            String name = scanner.nextLine();
            names.add(name);

            //scanner.nextLine();
            System.out.println("What is the type of Pet "+i+"?: ");
            String type = scanner.nextLine();
            types.add(type);

        }

        System.out.println(names);
        System.out.println(types);
    }


}
