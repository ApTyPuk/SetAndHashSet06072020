package com.Artur;

public class DogMain {

    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover));   //true. Labrador is an instance of dog.
        System.out.println(rover.equals(rover2));   //false. If use Override in Labrador class. Dog isn't an instance of Labrador.

    }


}
