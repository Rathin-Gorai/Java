//package com.rathin.assignmentfirst;

import java.util.Scanner;

public class mainl {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your name:");
        String name = scan.nextLine();
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        System.out.println("Enter your blood group: ");
        String blood = scan.next();
       // int i =scan.nextInt();
        String group="";
        if (age >= 20)
        {
            group = "RED";
        }
        else if (age>=15 && age< 20)
        {
            group="BLUE";
        }
        else if (age>=10 && age<15)
        {
            group="YELLOW";
        }
        System.out.println("------------------------------");
        System.out.println("Name: "+name+"\nAge: "+age+"\nBlood Group: "+blood);
        System.out.println("------------------------------");
        System.out.println("Your group is "+group);
        System.out.println("------------------------------");
        scan.close();
    }
}