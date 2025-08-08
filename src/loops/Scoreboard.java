
package loops;
import java.util.*;

public class Scoreboard {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Player");
            System.out.println("2. Update Score");
            System.out.println("3. Display Scoreboard");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter score: ");
                    int score = Integer.parseInt(sc.nextLine());
                    scores.put(name, score);
                    System.out.println("Player added!");
                    break;

                case 2:
                    System.out.print("Enter player name to update: ");
                    String player = sc.nextLine();
                    if (scores.containsKey(player)) {
                        System.out.print("Enter new score: ");
                        int newScore = Integer.parseInt(sc.nextLine());
                        scores.put(player, newScore);
                        System.out.println("Score updated!");
                    } else {
                        System.out.println("Player not found.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Scoreboard ---");
                    for (String p : scores.keySet()) {
                        System.out.println(p + " : " + scores.get(p));
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
