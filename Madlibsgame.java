/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matlibsgame;

/**
 *
 * @author Nullroot 13
 */

// chapter 4 mat libs game 
import java.util.Scanner;

public class Matlibsgame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;
        
        System.out.println("Enter an adjective 9 description): ");
        adjective1 = scanner.nextLine();
       
        System.out.println("Enter a Noun (animal or person ):");
        noun1 = scanner.nextLine();
        
        System.out.println("Enter an adjective (description):");
        verb1 = scanner.nextLine();
        
        System.out.println("Enter a verb end with -ing (action):");
        adjective2 = scanner.nextLine();
        
        System.out.println("Enter an adjective (description):");
        adjective3 = scanner.nextLine();
        
        
        System.out.println("Today I went to a " + adjective1+ "zoo" );
        System.out.println("in an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + "was" + adjective2 + "and" + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");
        
        scanner.close();
    }
}
