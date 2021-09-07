package solution;

import textio.TextIO;

public class DiceRollNumGetter {
    public static void main(String[]args){
        //testing 4.3
        System.out.println("Please type a number between 2 and 12, and we will test to see how many times two dice had to be rolled to get that number.");
        int desiredTally = TextIO.getlnInt();
        System.out.println("Ok, the number of times the dice had to be rolled to get " + desiredTally+" was "+ countRollsToGetDiceTally(desiredTally)+".");

        //testing 4.4
        System.out.println("The average number of rolls it takes to get each die total (if you roll the dice 10,000 times) are listed below:");
        System.out.println("2 -> "+ aveDiceRollsNum(2));
        System.out.println("3 -> "+ aveDiceRollsNum(3));
        System.out.println("4 -> "+ aveDiceRollsNum(4));
        System.out.println("5 -> "+ aveDiceRollsNum(5));
        System.out.println("6 -> "+ aveDiceRollsNum(6));
        System.out.println("7 -> "+ aveDiceRollsNum(7));
        System.out.println("8 -> "+ aveDiceRollsNum(8));
        System.out.println("9 -> "+ aveDiceRollsNum(9));
        System.out.println("10 -> "+ aveDiceRollsNum(10));
        System.out.println("11 -> "+ aveDiceRollsNum(11));
        System.out.println("12 -> "+ aveDiceRollsNum(12));
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
