
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        // QUESTIONS ARRAY
        String[] questions = { "What is the very first phase of the classic Waterfall model?",
                "What term describes the degree of interdependence between software modules?",
                "Which of these is a 'Non-Functional' requirement?",
                "In Git, which command retrieves updates from a remote without merging them?" };

        String[][] choices = { { "1. Implementation", "2. Maintenance", "3. Requirements", "4. Design" },
                { "1. .Inheritance", "2. Cohesion", "3. Abstraction", "4. Coupling" },
                { "1. Data Export", "2. User Login", "3. Search Feature", "4. Scalability" },
                { "1. git fetch", "2. git checkout", "3. git pull", "4. git push" } };

        int[] answers = { 3, 4, 4, 1 };
        int score = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Quiz Game.");
        System.out.println();

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (String choice : choices[i]) {
                System.out.println(choice);
            }

            System.out.println();

            System.out.print("Enter your answer: ");
            int studentAnswer = scanner.nextInt();

            if (studentAnswer == answers[i]) {
                System.out.println("GOT IT!");
                System.out.println();
                score++;
            } else {
                System.out.println("WRONG!");
                System.out.println();
            }
        }

        System.out.println("Total score =" + " " + score + " " + "/" + " " + questions.length);

        scanner.close();
    }
}
