package com.company;
import java.util.Scanner;

public class Main {

    //Only works for single words with one "e"

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Word: ");
        String str = scan.nextLine();

        // String[] v = {{"A"},{"a"},{"E"},{"e"},{"I"},{"i"},{"O"},{"o"},{"U"},{"u"}};
        //String[] v = {"a","e","i","o","u"};
        //for(int i=0; i<v.length; i++) {

        if (str.contains("e")) {

            String first = str.substring(0, str.indexOf("e"));
            int index = str.indexOf("e");
            str = str.substring(str.indexOf("e"));
            System.out.println("--------------------");
            System.out.println("Translated Word: " + first + "egg" + str);
        }
        else {

            System.out.println("--------------------");
            System.out.println("Word Cannot be Translated");

        }
    }
}
