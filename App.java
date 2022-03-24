
import java.util.Scanner;

import java.util.Random;


public class App{
    public static void main(String[] args){

        
           Scanner scan = new Scanner(System.in);
           System.out.println("what is your name ?");

           String name = scan.nextLine();

           System.out.println("Welcome "+ name);


            Random rand = new Random();
            int n = rand.nextInt(50); 
           
            Scanner intInput = new Scanner(System.in);
            System.out.println("guess a number between 0 and 50");
            int guessedInt = intInput.nextInt();

            int tried = 0;
            int limits = 5;

            

            
            
            while (guessedInt != n && limits!=0){

                
                if(guessedInt>n){
                    System.out.println("Your guess is higher than the actual number. Please try a little lower number ");
                    System.out.println("tries left: "+ limits);
                    int guessedInt2 = intInput.nextInt();
                    
                    tried +=1;
                    limits-=1;
                    
                    guessedInt = guessedInt2;
                }
                if(guessedInt<n){
                    
                    
                    
                    System.out.println("Your guess is less than the actual number. Please try a little higher number ");
                    System.out.println("tries left: "+ limits);
                    int guessedInt2 = intInput.nextInt();
                    
                    tried +=1;
                    limits-=1;
                    
                    guessedInt = guessedInt2;
                }
                else{
                    System.out.println("You lost all the tries");
                }
            }
            
            if(guessedInt == n){
                System.out.println("you guessed the correct number in "+ tried+" tries");
            }
    
            
    }
}