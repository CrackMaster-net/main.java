import java.util.Scanner;

public class TextAdventure {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int playerInput;
    int level;
    int choice;
    boolean enterToTheGame = false;

    System.out.println("Welcome to the game, Adventurer!");
    System.out.println("This game is called \"The Great Adventure\"!");
    System.out.println("In this game, you decision making will be tested!");
    System.out.println("One wrong decision, Will lead to the DEATH of you character!");
    System.out.print("You want to enter to the game? (1. Help? || 2. Maybe next time. || 3. Yes, Im all in!): ");
    playerInput = input.nextInt();

    if (playerInput == 1) {
      System.out.println("Instruction");
    }

    if (playerInput == 2) {
      System.out.println("Exiting to the game");
    }

    if (playerInput == 3) {
      System.out.print("Please select level (1. Level 1 || 2. Level 2): ");
      level = input.nextInt();

      if (level == 1) {
      System.out.println("Welcome to the game, Adventurer!");
      System.out.println("You are at level 1, greate start for new player!");
      enterToTheGame = true;
      
      do {
        System.out.println("You need to collect wood from the forest.");
        System.out.println("You go to the forest to collect woods");
        System.out.print("Its already dark when you arrived on the forest (1. Continue to collecting wood || 2. Comeback tommorow): ");
        choice = input.nextInt();

        if (choice == 1) {
          System.out.print("As you walk in the forest, you hear something (1. Ignore it || 2. Find where the noise came from): ");
          choice = input.nextInt();
          
          if (choice == 1) {
            System.out.println("You collect enough woods and you back to your village safely");
            break;
          } else if (choice == 2) {
            System.out.print("You keep finding the noise but you end up in the middle of the forest (1. Find way back to the village || 2. Rest for awhile since you dont know where should you go)");
            choice = input.nextInt();

            if (choice == 1) {
              System.out.println("You encountered someone that live in the same village and the two of you breaked home");
              break;
            } else if (choice == 2) {
              System.out.print("Someone whisper at you! (1. You panicked and run faster || 2. You stay Calm.)");
              choice = input.nextInt();

              if (choice == 1) {
                System.out.println("You stripped and your head hit the hard rock, and the you died");
                break;
              } else if (choice == 2) {
                System.out.print("You shouted out loud, and the someone hear you. (1. Stop Shounting because you might bothered creature living their || 2. You continuosly shouting): ");
                choice = input.nextInt();

                if (choice == 1) {
                  System.out.println("You hear horse leaving. Then you realize their human. And suddenly you got bitten by a snake, and you die");
                  break;
                } else if (choice == 2) {
                  System.out.println("You got rescued and the break to your village");
                  break;
                }
              }
            }
          }
        } else if (choice == 2) {
          System.out.println("You break safely in your village");
          enterToTheGame = false;
        }
      } while(enterToTheGame);
      }
    }
  }
}
