package com.win.junit;

import java.util.Scanner;
import java.util.ArrayList;

public class AnimalMain {

    public static void main (String[] args){

    ArrayList<Animal> animals = new ArrayList <> ();
    Scanner scan = new Scanner(System.in);
    System.out.println("Animal Menu");
    System.out.println("Entering nothing will stop the loop");
    while (true){
    System.out.print("Please enter an name: ");
    String dogName = scan.nextLine();
    if (dogName.isBlank()) break;
    System.out.print("Is it a dog? Yes or no: ");
    String dogOrNot= scan.nextLine();
    if (dogOrNot.isBlank()) break;
            if( dogName.equals("") || dogOrNot.equals("" )){
            break;
            }else{
                animals.add(new Animal(dogName, dogOrNot));
            }
    }
    for (int i = 0; i < animals.size(); i ++){
        System.out.println(animals.get(i));
        
    }
scan.close();
}
}

public class Animal {
    private String name;
    private String dog;

    // Overload Contstructors
    public Animal(String name, String dog) {
        this.name = name;
        this.dog= dog;
    }

    public Animal(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }

    public String getDog(){
        return dog;
    }

    @Override
    public String toString (){ 
        if (this.dog.equals("no")){
            return this.name + " is a dog = " +  "false";
        } else{
            return this.name + " is a dog = " +  "true";
        }
}
}
