package practice1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your new Balance");

        ArrayList<Double> currentBalance = new ArrayList<>();
        currentBalance.add(scanner.nextDouble());

        System.out.println("My current balance is " + currentBalance);
    }
}
