package com.bridgelab;
import java.util.regex.*;
import java.util.Scanner;

public class RegistrationDetails {
    public static void validateFirstName(){
        System.out.println("Enter First Name");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String regex="^[A-Z][a-z]{3,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(firstName);
        boolean b = m.matches();
        System.out.println(b);

        if(b==true)
            System.out.println("First name is valid");

        else
            System.out.println("First name is invalid");

    }
}
