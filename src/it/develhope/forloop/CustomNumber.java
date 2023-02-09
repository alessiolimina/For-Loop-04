package it.develhope.forloop;

import java.util.Random;

public class CustomNumber {
    private int number;

    public CustomNumber(){
        Random random = new Random();
        this.number = random.nextInt(1,12);}

    public void getMultiplicationTable(){
        for (int i = 12; i >=1 ; i--) {
            System.out.println("The number " + number + " * " + i + " = " + (number * i));
        }
    }
}
