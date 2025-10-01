import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            String moveA = getMove(sc, "Player A");
            String moveB = getMove(sc, "Player B");

            String fullA = moveFull(moveA);
            String fullB = moveFull(moveB);

            if (fullA.equals(fullB)) {
                System.out.println(fullA + " vs " + fullB + " it's a Tie!");
            } else {

                if (moveA.equalsIgnoreCase("R") && moveB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors.");
                    System.out.println("Player A wins!");
                } else if (moveA.equalsIgnoreCase("S") && moveB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors.");
                    System.out.println("Player B wins!");
                } else if (moveA.equalsIgnoreCase("P") && moveB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock.");
                    System.out.println("Player A wins!");
                } else if (moveA.equalsIgnoreCase("R") && moveB.equalsIgnoreCase("P")) {
                    System.out.println("Paper cover Rock.");
                    System.out.println("Player B wins!");
                } else if (moveA.equalsIgnoreCase("S") && moveB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts paper.");
                    System.out.println("Player A wins!");
                } else if (moveA.equalsIgnoreCase("P") && moveB.equalsIgnoreCase("S")) {
                    System.out.println("Scissors cuts Paper.");
                    System.out.println("Player B wins!");
                } else {

                    System.out.println("Unexpected input combination.");
                }
            }

            while (true) {
                System.out.println("Play again? [Y/N]: ");
                String response = sc.nextLine().trim();
                if (response.equalsIgnoreCase("Y")) {
                    break;
                } else if (response.equalsIgnoreCase("N")) {
                    playAgain = false;
                    break;
                } else {
                    System.out.println("Invalid entry. Please enter Y or N.");
                }
            }
        }

        System.out.println("Thanks for playing!");
        sc.close();
    }

    private static String getMove(Scanner sc, String player) {
        while (true) {
            System.out.print(player + " - enter your move (R/P/S): ");
            String input = sc.nextLine().trim();
            if (input.equalsIgnoreCase("R") ||
                input.equalsIgnoreCase("P") ||
                input.equalsIgnoreCase("S")) {
                return input;
            } else {
                System.out.println("Invalid move. Please enter R, P, or S.");
            }
        }
    }

        private static String moveFull(String s) {
            if (s.equalsIgnoreCase("R")) return "Rock";
            if (s.equalsIgnoreCase("P")) return "Paper";
            return "Scissors";
        }
}

