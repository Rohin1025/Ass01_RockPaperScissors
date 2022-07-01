import java.util.Scanner;

public class

Main
{

    public static void main(String[] args)
    {
        String playerA = "";
        String playerB = "";
        String playAgain = "Y";

        Scanner in = new Scanner(System.in);

        while(playAgain.equalsIgnoreCase("Y"))
        {

            System.out.print("Player A, Make your move (R/P/S): ");
            playerA = in.nextLine();

            System.out.print("Player B, Make your move (R/P/S): ");
            playerB = in.nextLine();

            if(playerA.equalsIgnoreCase("R"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock vs Rock, It's a tie.");
                }
                else if(playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Rock breaks Scissors, Player A Wins!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock, Player B Wins!");
                }
                else
                {
                    System.out.println("Invalid input by player B: " + playerB);
                }
            }
            else if(playerA.equalsIgnoreCase("P"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock, Player A Wins!");
                }
                else if(playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors cut Paper, Player B Wins!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper vs Paper, It's a tie.");
                }
                else
                {
                    System.out.println("Invalid input by player B: " + playerB);
                }
            }
            else if(playerA.equalsIgnoreCase("S"))
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors, Player B Wins!");
                }
                else if(playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Scissors vs Scissors, It's a tie.");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cut Paper, Player A Wins!");
                }
                else
                {
                    System.out.println("Invalid input by player B: " + playerB);
                }
            }
            else
            {
                System.out.println("Invalid input by player A: " + playerA);
            }

            System.out.print("Would you like to play again? (Y/N): ");
            playAgain = in.nextLine();
        }

        if(playAgain.equalsIgnoreCase("N"))
        {
            System.out.println("Thanks for Playing!");
        }
        else
        {
            System.out.println("Invalid Input: " + playAgain);
            System.out.println("Thanks for Playing!");
        }
    }
}