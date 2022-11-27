package snakeandladder;

import java.util.Random;


/*This is a Snake and Ladder game simulation program where a single player is playing, starting from zero,
he is rolling the die to get a number and checks for an option i.e :- if it is a No Play, Ladder or Snake.*/

       public class CheckForAOptionNoPlay {

           CheckForAOptionNoPlay() {
               System.out.println("Welcome to Snake and Ladder Simulation \n");
           }

           public static void main(String[] args) {
               CheckForAOptionNoPlay a = new CheckForAOptionNoPlay();
               int startingPosition = 0;
               int playerPosition = 0;
               Random random = new Random();
               System.out.println("Starting Position of the Single Player is : " + startingPosition + "\n");

               //Rolling the die.
               int dieRolls1 = (random.nextInt(6) + 1);
               System.out.println("The Player rolls the die and gets a number : " + dieRolls1 + "\n");

               //Checking for option.
               int b = random.nextInt(3);
               playerPosition = playerPosition + dieRolls1;
               switch (b) {
                   case 0:
                       System.out.println("No play - Player stays in the same position \n");
                       System.out.println("Player current position is : " + playerPosition);
                       break;
                   case 1:
                       playerPosition = playerPosition + dieRolls1;
                       System.out.println("Player gets Ladder & Player moves ahead by number of position : " + dieRolls1 + "\n");
                       System.out.println("Player current position is : " + playerPosition);
                       break;
                   case 2:
                       playerPosition = playerPosition - dieRolls1;
                       System.out.println("Oops Snake bytes!! & Player moves behind by number of position : " + dieRolls1 + "\n");
                       System.out.println("Player current position is : " + playerPosition);
                       break;
               }
           }
       }