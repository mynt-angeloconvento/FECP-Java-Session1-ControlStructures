package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String status = myObj.nextLine();
        System.out.print("Enter age: ");
        int age = myObj.nextInt();
        double price = 0;

        switch (status.toLowerCase()) {
            case "regular":
                price = age < 18 ? 50 : age >= 18 && age <= 64 ? 100 : 75;
                break;
            case "vip":
                price = age < 18 ? 75 : age >= 18 && age <= 64  ? 150 : 112.5;
                break;
            case "premium":
                price = age < 18 ? 100 : age >= 18 && age <= 64  ? 200 : 150;
                break;
            default:
                System.out.printf("Invalid membership status entered.");
                break;
        }
        if (price != 0) System.out.printf("Price: $%.2f", price);
    }
}