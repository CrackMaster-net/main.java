import java.util.Scanner;

public class TextAdventure {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String game = "yes";
    String playerInput;
    boolean enterToTheGame= false;
    int level;

    System.out.print("Welcome to the game, Warrior!: ");
    playerInput = input.nextLine();

    if (playerInput.equals(game)) {
      System.out.println("You are now at the game!");
      enterToTheGame = true;
    } else {
      System.out.println("Exeting to the game.");
    }

    do {
      System.out.println("Level 1");
      System.out.println("Level 2");
      System.out.print("Choose: ");
      level = input.nextInt();
      input.nextLine();

      if (level == 1) {
        System.out.println("You are now at level 1");
        System.out.println("Proceeding to the Forest");
        System.out.print("You encountered a 3 monster! Will you run or hide?: ");
        playerInput = input.nextLine();


        
        if (playerInput.equalsIgnoreCase("run")) {
          System.out.println("The monster catch you easily!");
        } else if (playerInput.equalsIgnoreCase("hide")) {
          System.out.println("someone saw you and then they rescued you");
        }
        enterToTheGame = false;
      }
    } while (enterToTheGame);
  }
}
