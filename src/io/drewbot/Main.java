package io.drewbot;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] answers = {
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            "Reply hazy try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            "Don't count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful"
        };

        int questionCounter = 0;

        while (true) {
            if (questionCounter == 0) {
                System.out.println("Do you have a question? [y/n]");
            } else {
                System.out.println("Do you have another question? [y/n]");
            }

            Scanner requestQuestion = new Scanner(System.in);
            String requestResponse = requestQuestion.nextLine();

            if ( requestResponse.equals("y") ) {
                System.out.println("What would you like to ask the magic 8-ball?");
                Scanner scanner = new Scanner(System.in);
                String userQuestion = scanner.nextLine();
                getRandomIndex(answers);
                questionCounter++;
            } else if ( requestResponse.equals("n") ) {
                System.out.println("We're done here");
                break;
            } else {
                System.out.println("The only acceptable answers are [y/n]");
            }
        }
    }

    public static void getRandomIndex (String[] answersArray) {
        Random rag = new Random();
        int randomIndex = rag.nextInt(answersArray.length) + 1;
        System.out.println(answersArray[randomIndex]);
    };
}
