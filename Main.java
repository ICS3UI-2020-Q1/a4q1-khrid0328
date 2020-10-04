import java.util.Scanner;
/**
 * The  program will prompt the user to enter in an integer. The program will then start at 100 and count down by 5 until it gets as low as possible without going past the entered number.
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for the number they want to count down to
    System.out.println("Please enter an integer to count down to");

    // create a variable for user input
    int downTo = input.nextInt();

    // create a starting variable to count down from
    int startingNumber = 100;

    // usign a loop to count down from 100 to users input
    while(startingNumber >= downTo){

      // print the starting number
      System.out.println(startingNumber);

      // decrease value of starting number by 5
      startingNumber = startingNumber - 5;
    }
  }
}
