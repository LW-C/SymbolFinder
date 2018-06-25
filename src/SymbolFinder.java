import java.util.InputMismatchException;
import java.util.Scanner;

public class SymbolFinder
{
    /*
     *  The goal of printOptionsAndCatchErrors is to find
     *  what the user would like to do next: print a figure
     *  or exit the program.
     */
    public static int printOptionsAndCatchErrors()
    {
        int userChoice = 0;
        Boolean error = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. Print a Figure");
        System.out.println("2. Exit");
        System.out.print("\nWhat would you like to do? ");


        while (error)
        {
            try
            {
                userChoice = scanner.nextInt();

                if (userChoice < 1)
                {
                    System.out.println("\nThat is not a valid choice. Try again.");
                }
                else if (userChoice > 2)
                {
                    System.out.println("\nThat is not a valid choice. Try again.");
                }
                else
                {
                    error = false;
                    return userChoice;
                }
            }
            catch (InputMismatchException notAnInt)
            {
                System.out.println("\nThat is not a valid choice. Try again.");
            }
            catch (Exception except)
            {
                System.out.println("\nThat is not a valid choice. Try again.");
            }

            scanner.nextLine();

            System.out.println("\n1. Print a Figure");
            System.out.println("2. Exit");
            System.out.print("\nWhat would you like to do? ");
        }
        return userChoice;
    }

    public static void main(String[] args)
    {
        int userChoice;
        String userFigure = "";

        System.out.println("Hello.");
        System.out.println("Welcome to Symbol Finder.");

        userChoice = printOptionsAndCatchErrors();

        while(userChoice != 2)
        {
            if (userChoice == 1)
            {
                // Find a figure
            }

            userChoice = printOptionsAndCatchErrors();
        }

        return;
    }
}
