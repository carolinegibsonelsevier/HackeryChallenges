import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Colours to be used
        final String greenBackGround = "\u001b[42m";
        final String yellowBackGround = "\u001b[43m";
        final String reset = "\u001b[0m";

        //Start game
        System.out.println("LET'S PLAY WORDLE!");

        //I've created the array of possible words(strings) and used Random to randomly generate an
        //index of that array then it prints back out the actual word(string) that matches that integer.
        String[] wordList = {"SHAKE", "SHAPE", "SHOOK", "PLACE", "HAIRY", "LOOPS", "WHILE", "WORDS", "UNTIL", "GEESE", "SWING", "SCALA"};
        Random random = new Random();
        int randomIndex = random.nextInt(wordList.length);
        //System.out.println(wordList[randomIndex]);
        String correct = (wordList[randomIndex]);

        //This bit unkindly takes the user guess(input) using Scanner and prints it back.
        Scanner userInput = new Scanner(System.in);
        String guess = "";
        //System.out.println("YOUR GUESS IS " + guess);

        //This is going to loop until 5 attempts have been given
        // and then go to the loser section (if the user hasn't guessed correctly already)
        for(int attempt = 1; attempt <= 5; attempt++) {
            System.out.println("GUESS A WORD YA SCUM - ");
            guess = userInput.nextLine().toUpperCase();

            //This loop is iterating/checking through each letter
            for(int letter = 0; letter < 5; letter++) {
                if(guess.substring(letter, letter+1).equals(correct.substring(letter, letter+1))) {
                    System.out.print(greenBackGround + guess.substring(letter, letter+1) + reset);
                }
                else if(correct.indexOf(guess.substring(letter, letter+1)) > -1) {
                    System.out.print(yellowBackGround + guess.substring(letter, letter+1) + reset);
               }
                else {
                    //Letter not in the word at all
                    System.out.print(guess.substring(letter, letter +1));
                }
            }

            System.out.println("");
            //if user is correct
            if(guess.equals(correct)) {
                System.out.println("YOU'RE THE BEST!");
                break;
            }
            System.out.println((5 - attempt) + " attempts remaining");
        }

            //if no more attempts
            if(!guess.equals(correct)) {
            System.out.println("YOU'RE OUTTA LUCK, THE CORRECT WORD WAS " + correct + " YOU LOSER.");
            }
    }
}


