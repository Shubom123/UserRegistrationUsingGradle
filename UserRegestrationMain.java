package com.bridgelab;
import java.util.Scanner;

public class UserRegestrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        System.out.println("Enter 1 to validate First Name");
        System.out.println("Enter 2 to validate Last Name");
        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                RegistrationDetails.validateFirstName();
                break;
            case 2:
                RegistrationDetails.validateLastName();
                break;
        }
    }
}
