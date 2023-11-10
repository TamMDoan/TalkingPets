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
        ArrayList<Pet> pets = new ArrayList<>();

        scanner.nextLine();

        for(int i = 1; i <= numberOfPets; i++){
            System.out.println("What is the name of Pet "+i+"?: ");
            String name = scanner.nextLine();
            names.add(name);

            //scanner.nextLine();
            System.out.println("What is the type of Pet "+i+"?: ");
            String type = scanner.nextLine();

            if(type.toLowerCase().equals("dog")){
                Dog dog = new Dog(name);
                pets.add(dog);
            }
            else if(type.toLowerCase().equals("rabbit")){
                Rabbit rabbit = new Rabbit(name);
                pets.add(rabbit);
            }
            else if(type.toLowerCase().equals("cat")){
                Cat cat = new Cat(name);
                pets.add(cat);
            }

        }

        for(int i = 0; i < pets.size(); i++){
            System.out.println(pets.get(i).getName() + " says: " + pets.get(i).speak());
        }
    }


}
