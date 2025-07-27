import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String myPassword = "password123";
    String usersPassword;
    int attempts = 0;

    while (attempts < 3) {
      System.out.print("Enter your password: ");
      usersPassword = input.nextLine();

      if (usersPassword.equals(myPassword)) {
        System.out.println("Access Granted.");
        break;
      } else {
        attempts++;
        System.out.println("Access Denied.");
      }
    }
  }
}
