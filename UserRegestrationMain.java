package com.bridgelab;
import java.util.Scanner;

public class UserRegestrationMain {
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        System.out.println("Enter 1 to validate First Name");
        System.out.println("Enter 2 to validate Last Name");
        System.out.println("Enter 3 to validate Email id");
        System.out.println("Enter 4 to validate mobile number");
        System.out.println("Enter 5 to validate password");
        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                RegistrationDetails.validateFirstName();
                break;
            case 2:
                RegistrationDetails.validateLastName();
                break;
            case 3:
                RegistrationDetails.validateEmail();
                break;
            case 4:
                RegistrationDetails.validateMobileNumber();
                break;
            case 5:
                RegistrationDetails.validatePassword();
                break;
        }
    }
}
