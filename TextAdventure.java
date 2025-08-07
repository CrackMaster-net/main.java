import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    String player;
    String playersChoice = "yes";
    boolean enterToTheGame = false;
    
    System.out.print("Do you want to enter to the game?");
    player = input.nextLine();

    if (player.equals(playersChoice)) {
      enterToTheGame = true;
    } else {
      System.out.println("Exiting to the game");
    }

    while (enterToTheGame) {
      System.out.println("Level 1");
      System.out.println("Level 2");
      System.out.print("Choose Level ");
      int choice = input.nextInt();

      if (choice == 1) {
        System.out.println("You are in level 1 \n Your Health is 100");
        break;
      }

      if (choice == 2) {
        System.out.println("You are in level 2 \n Your Health is 90");
        break;
      }
    }
  }
}
