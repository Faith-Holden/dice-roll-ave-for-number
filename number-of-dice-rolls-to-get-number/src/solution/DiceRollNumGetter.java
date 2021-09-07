package solution;

import textio.TextIO;

public class DiceRollNumGetter {
    public static void main(String[]args){
        System.out.println("Please type a number between 2 and 12, and we will test to see how many times two dice had to be rolled to get that number.");
        int desiredTally = TextIO.getlnInt();
        System.out.println("Ok, the number of times the dice had to be rolled to get " + desiredTally+" was "+ countRollsToGetDiceTally(desiredTally)+".");
    }

    //Solution for 4.3
    static int countRollsToGetDiceTally(int desiredTally){
        if (desiredTally<2|| desiredTally>12){
            throw new IllegalArgumentException(desiredTally+ " is not a possible roll with two dice!");
        }

        int counter = 0;

        int diceTally=0;

        while (diceTally!=desiredTally){
            int die1 = (int) ((6*Math.random())+1);
            int die2 = (int) ((6*Math.random())+1);
            diceTally = die1+die2;
            counter++;
        }
        return counter;
    }

    //Solution for 4.4
    static double aveDiceRollsNum(int desiredTally){
        int counter = 0;
        int totalTally = 0;

        while (counter<=10000){
            totalTally+=countRollsToGetDiceTally(desiredTally);
            counter++;
        }
        return totalTally/10000.0;
    }
}
