package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double regular_base_price_1 = 5.45;
        double large_base_price_2 = 8.95;
        double discount_regular = 0.10;
        double discount_large = 0.20;
        double discount;
        double discount_price = 0;
        double regular_price = 0;

        System.out.println("What sandwich size do you want - Large (2) or Regular(1)?");
        String sandwich_size = scanner.nextLine();

        System.out.println("What is your age?");
        int user_age = scanner.nextInt();

        if(user_age<=17 && sandwich_size.equals("1")){
            discount = regular_base_price_1 *discount_regular;
            discount_price = regular_base_price_1 - discount;
            System.out.println("Here is your discounted cost: " + discount_price);

        } else if(user_age<=17 && sandwich_size.equals("2")){
            discount = large_base_price_2 * discount_large;
            discount_price = large_base_price_2 - discount;
            System.out.println("Here is your discounted cost: " + discount_price);

        } else if (user_age >= 65 && sandwich_size.equals("1")){
            discount = regular_base_price_1 * discount_regular;
            discount_price = regular_base_price_1 - discount;
            System.out.println("Here is your discounted cost: " + discount_price);
        } else if (user_age >= 65 && sandwich_size.equals("2")) {
            discount = large_base_price_2 * discount_large;
            discount_price = large_base_price_2 - discount;
            System.out.println("Here is your discounted cost: " + discount_price);
        }
        else {
            if (sandwich_size.equals("1")){
                regular_price = regular_base_price_1;

            }
            else if (sandwich_size.equals("2")){
                regular_price = large_base_price_2;
            }
            System.out.println("Here is your regular cost: " + regular_price);
        }
    }
}