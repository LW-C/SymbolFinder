import java.util.InputMismatchException;
import java.util.Scanner;

public class SymbolFinder
{
    /*
     *  The goal of printOptionsAndCatchErrors is to find
     *  what the user would like to do next: list the figures
     *  to print, print a figure or exit the program.
     */
    public static int printOptionsAndCatchErrors()
    {
        int userChoice = 0;
        Boolean error = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. List the Figures to Print");
        System.out.println("2. Print a Figure");
        System.out.println("3. Exit");
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
                else if (userChoice > 3)
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

            System.out.println("\n1. List the Figures to Print");
            System.out.println("2. Print a Figure");
            System.out.println("3. Exit");
            System.out.print("\nWhat would you like to do? ");
        }
        return userChoice;
    }

    public static void main(String[] args)
    {
        SymbolList aList = new SymbolList();
        int userChoice;
        String userFigure = "";

        System.out.println("Hello.");
        System.out.println("Welcome to Symbol Finder.");

        userChoice = printOptionsAndCatchErrors();

        while(userChoice != 3)
        {
            if (userChoice == 1)
            {
                // List the figures to print
                aList.printTheList();
            }
            else if (userChoice == 2)
            {
                // Print a figure
                aList.printAFigure();
            }

            userChoice = printOptionsAndCatchErrors();
        }
    }
}
