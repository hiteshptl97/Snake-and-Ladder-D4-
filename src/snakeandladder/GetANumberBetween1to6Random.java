package snakeandladder;

import java.util.Random;


/*This is a Snake and Ladder game simulation program where a single player is playing, starting from zero,
and he is rolling the die to get a number.*/

       public class GetANumberBetween1to6Random {

           GetANumberBetween1to6Random() {System.out.println("Welcome to Snake and Ladder Simulation \n");}

        public static void main(String[] args) {
            GetANumberBetween1to6Random a = new  GetANumberBetween1to6Random();
            Random random = new Random();
            int startingPosition = 0;
            System.out.println("Starting Position of the Single Player is : "+startingPosition+"\n");

            //Rolling the die.
            int dieRolls = (random.nextInt(6)+1);
            System.out.println("The Player rolls the die and gets a number : "+dieRolls);
        }

    }



