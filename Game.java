import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] choice = { "rock", "paper", "scissors" };
		String playerChoice;
		String computerChoice;
		String playAgain = "yes";
		do {
			System.out.println("Enter your choice: rock,paper,scissors");
			playerChoice = scanner.nextLine().toLowerCase();

			if (!playerChoice.equals("rock") &&
					!playerChoice.equals("paper") &&
					!playerChoice.equals("scissors")) {
				System.out.println("Invalid choice. Try again!!");
				continue;
			}

			computerChoice = choice[random.nextInt(3)];
			System.out.println("Computer choice = " + " " + computerChoice);

			if (playerChoice.equals(computerChoice)) {
				System.out.println("It`s a Tie");
			} else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
					(playerChoice.equals("paper") && computerChoice.equals("rock")) ||
					playerChoice.equals("scissors") && computerChoice.equals("paper")) {
				System.out.println("You win!");

			} else {
				System.out.println("You lose!");
			}

			System.out.println("Do you wish to continue (yes/no) ");
			playAgain = scanner.nextLine().toLowerCase();
		} while (playAgain.equals("yes"));

		System.out.println("Thankyou!! Till next time");

		scanner.close();
	}
}
