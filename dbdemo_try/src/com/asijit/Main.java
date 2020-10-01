package com.asijit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DBHelper dbHelper =new DBHelper();
        Scanner input = new Scanner(System.in);
        System.out.println("Basic demonstration of CRUD");
        System.out.println("How would you like to proceed"+
                "\n1. Enter 1 to register"+
                "\n2. Enter 2 to login");
        int userInput = input.nextInt();

        if(userInput==1){
            input.nextLine();
            System.out.println("Enter your name");
            String name= input.nextLine();
            System.out.println("Enter your email");
            String email= input.nextLine();
            System.out.println("Enter your password");
            String password= input.nextLine();

            boolean result= dbHelper.register(name,email,password);

            if(result==true) {
                System.out.println("register successful");
            }
            else
            {
                System.out.println("register unsuccessful");
            }
        }else{
            input.nextLine();
            System.out.println("enter the  email");
            String email= input.nextLine();
            System.out.println("Enter your password");
            String password= input.nextLine();
            boolean result = dbHelper.login(email,password);
            if(result==true){
                System.out.println("login successful");
            }else{
                System.out.println("login unsuccessful");
            }
        }
    }
}
