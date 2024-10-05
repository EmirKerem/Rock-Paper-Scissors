import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int pc_score = 0;
    public static int player_score = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to our Rock Paper Scissors Game");

        System.out.println("The Game is Starting\n" +
                "**********************************************");
        game();
    }

    public static void game() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Choose Rock(1), Paper(2), or Scissors(3). Press 9 to exit the game.");
        int player_input = scanner.nextInt();
        scanner.nextLine();

        int pc_input = random.nextInt(3 - 1 + 1) + 1;

        if (player_input == 1) {
            if (pc_input == 1) {
                System.out.println("It's a tie!!!");
                System.out.println("No score change");
                game();
            } else if (pc_input == 2) {
                System.out.println("Paper beats Rock");
                System.out.println("Computer wins");
                pc_score++;
                System.out.println("New Score: " + player_score + ":" + pc_score);
                game();
            } else if (pc_input == 3) {
                System.out.println("Rock beats Scissors");
                System.out.println("Player wins");
                player_score++;
                System.out.println("New Score: " + player_score + ":" + pc_score);
                game();

            } else {
                System.out.println("Invalid Input");
                game();
            }
        } else if (player_input == 2) {
            if (pc_input == 1) {
                System.out.println("Paper beats Rock");
                System.out.println("Player wins");
                player_score++;
                System.out.println("New Score: " + player_score + ":" + pc_score);
                game();
            } else if (pc_input == 2) {
                System.out.println("It's a tie!!!");
                System.out.println("No score change");
                game();
            } else if (pc_input == 3) {
                System.out.println("Scissors beat Paper");
                System.out.println("Computer wins");
                pc_score++;
                System.out.println("New Score: " + player_score + ":" + pc_score);
                game();

            } else {
                System.out.println("Invalid Input");
                game();
            }
        } else if (player_input == 3) {
            if (pc_input == 1) {
                System.out.println("Rock beats Scissors");
                System.out.println("Computer wins");
                pc_score++;
                System.out.println("New Score: " + player_score + ":" + pc_score);
                game();
            } else if (pc_input == 2) {
                System.out.println("Scissors beat Paper");
                System.out.println("Player wins");
                player_score++;
                System.out.println("New Score: " + player_score + ":" + pc_score);
                game();
            } else if (pc_input == 3) {
                System.out.println("It's a tie!!!");
                System.out.println("No score change");
                game();

            } else {
                System.out.println("Invalid Input");
                game();
            }
        } else if (player_input == 9) {
            System.out.println("Exiting the game...");
            System.out.println("Final Score: " + player_score + ":" + pc_score);
        } else {

            System.out.println("Invalid Input");
            game();
        }

    }

}
