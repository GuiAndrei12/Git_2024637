/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024637;

import java.util.Scanner;

/**
 *
 * @author guilh
 */
public class Git_2024637 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("Guilherme Pulquerio - 2024637");//output message    
    
        Scanner whatIsTyped = new Scanner(System.in);//declaring my Scanner
       
        String userName;//declaring my variable
        
        do{//Show these two messages while the condition is confirmed, in other words, ask the user to type their name if what they typed does NOT match with only letters and space
            System.out.println("Please, type your name here:");
            System.out.println("You must enter text only, no numbers allowed.");
            
            userName = whatIsTyped.nextLine().trim(); //Get input and remove the spaces
            
        }while (!userName.matches("[a-zA-Z ]+")); // Allow only letters and spaces
        
        System.out.println("Thanks, " + userName + "!");
        System.out.println("Did you know that your name has "+ userName.length() + " characters?");//output the name length
        System.out.println("And I guess your fauvorite letter is " + userName.charAt(0) + ", am I right?");//pick the first letter from the name
        System.out.println("Honestly, I really liked your name, but imagine your name without the first letter, can you imagine that?");
        System.out.println("It looks like this: " + userName.substring(1));//output the name without the first character
        System.out.println("I bet your parents made a good choice!");    
        
    }
    
}
