// Sajid Ahmed
// Challenge Lab - Rock Paper Scissors Game
// Play Rock, Paper, Scissors with the user

package rpsgame;

import java.util.Random;
import java.util.Scanner;

public class RPSGame 
{
    public static void main(String[] args) 
    {
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay = null; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to determine computer's play
        int wins = 0, losses = 0, ties = 0;

        String answer;
        do 
        {
            Random generator = new Random();
            Scanner scan = new Scanner (System.in);
            Scanner scan1 = new Scanner (System.in);
            //Get player's play -- note that this is stored as a string
            //Make player's play uppercase for ease of comparison
            System.out.print("Enter your play: R, P, or S: ");
            personPlay = scan.next().toUpperCase();
            //Generate computer's play (0,1,2)
            computerInt = generator.nextInt(3);
            //Translate computer's randomly generated play to string
            switch (computerInt)
            {
                case 0: computerPlay = "R";
                break;
                case 1: computerPlay = "P";
                break;
                case 2: computerPlay = "S";
                break;
            }
            //Print computer's play
            System.out.println("Computer play is " + computerPlay);
            //See who won. Use nested ifs instead of &&.
            //track the number of wins, losses, and ties of the user
            if (personPlay.equals(computerPlay))
            {
                System.out.println("It's a tie!");
                ties++;
            }
            else if (personPlay.equals("R"))
                if (computerPlay.equals("S"))
                {
                    System.out.println("Rock crushes scissors. You win!!");
                    wins++;
                }
                else
                {
                    System.out.println("Paper covers rock. You lose!!");
                    losses++;
                }
            else if (personPlay.equals("P"))
                if (computerPlay.equals("S"))
                {
                    System.out.println("Scissors cuts paper. You lose!!");
                    losses++;
                }
                else
                {
                    System.out.println("Paper covers rock. You win!!");
                    wins++;
                }
            else if (personPlay.equals("S"))
                if (computerPlay.equals("R"))
                {
                    System.out.println("Rock crushes scissors. You lose!!");
                    losses++;
                }
                else
                {
                    System.out.println("Scissors cuts paper. You win!!");
                    wins++;
                }
            else
                System.out.println("Illegal person play: " + personPlay);
        
            //Play again (y/n)?
            System.out.println();
            System.out.print("Play again (y/n)? ");
            answer = scan1.next().toLowerCase();
        }
        while (answer.equals("y"));

        // Print final results
        System.out.println();
        System.out.println("You won " + wins + " times.");
        System.out.println("You lost " + losses + " times.");
        System.out.println("We tied " + ties + " times.");
    }
}
