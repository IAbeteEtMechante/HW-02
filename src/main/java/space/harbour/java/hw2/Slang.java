package space.harbour.java.hw2;

import java.util.Scanner;

public class Slang {

    public static String fixAbbreviations(String myString) {

        String replaceString = myString.replaceAll("PLZ", "please");
        return replaceString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your text:");
        String myString = sc.nextLine();
        System.out.println("Here is the modified text:");
        System.out.println(fixAbbreviations(myString));

    }
}
