import java.util.Scanner;

public class Gameplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerName;
        int playerLives = 9;
        int playerScore = 0;
        
        System.out.println("Welcome to Cat Adventure!");
        System.out.print("What's your name? ");
        playerName = input.nextLine();
        System.out.println("Hi " + playerName + ", you are a member of the colony of magical cats who live underground.");
        System.out.println("You've been chosen to explore the surface and start a new life. Are you ready?");

        // Game loop
        while (playerLives > 0) {
            System.out.println("You have " + playerLives + " lives left.");
            System.out.println("Your score is " + playerScore);

            // Prompt for player's next action
            System.out.print("What do you want to do next? ");
            String action = input.nextLine();
            
            // Process player's action
            if (action.equalsIgnoreCase("explore")) {
                // Player chooses to explore the ruins
                System.out.println("You venture out of the underground and explore the ruins of the post-apocalyptic world.");
                // TODO: add more code here to advance the game
            } else if (action.equalsIgnoreCase("rest")) {
                // Player chooses to rest and regain some lives
                playerLives += 1;
                System.out.println("You take a break and rest for a while. You feel refreshed and gain a life.");
            } else {
                // Player enters an invalid action
                System.out.println("I don't understand what you want to do. Please try again.");
            }
        }
        
        // Game over
        System.out.println("You have no lives left. Game over!");
        System.out.println("Your final score is " + playerScore);
    }
}
