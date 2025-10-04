import java.util.Scanner;

public class MiniQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] questions = {
            "What is the capital of India?",
            "Which language is primarily used for Android development?",
            "What is 5 + 7?"
        };

        String[][] options = {
            {"1. Mumbai", "2. New Delhi", "3. Kolkata", "4. Chennai"},
            {"1. Python", "2. Java", "3. C++", "4. HTML"},
            {"1. 10", "2. 11", "3. 12", "4. 13"}
        };

        int[] answers = {2, 2, 3}; // correct options
        int score = 0;

        System.out.println("Welcome to Mini Quiz App!\n");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for(String option : options[i]) {
                System.out.println(option);
            }

            int userAnswer = 0;
            while(true) { // Input validation
                System.out.print("Enter your answer (1-4): ");
                if(sc.hasNextInt()) {
                    userAnswer = sc.nextInt();
                    if(userAnswer >= 1 && userAnswer <= 4) break;
                    else System.out.println("Invalid choice. Enter 1-4 only.");
                } else {
                    System.out.println("Invalid input. Enter a number 1-4.");
                    sc.next(); // clear invalid input
                }
            }

            if(userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is option " + answers[i] + "\n");
            }
        }

        System.out.println("Quiz Over! Your score: " + score + "/" + questions.length);
        sc.close();
    }
}