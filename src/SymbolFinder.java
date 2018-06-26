import java.util.InputMismatchException;
import java.util.Scanner;

public class SymbolFinder
{
    /*
     *  The goal of printOptionsAndCatchErrors is to find
     *  what the user would like to do next: list the symbols
     *  to print, print a symbol or exit the program.
     */
    public static int printOptionsAndCatchErrors()
    {
        int userChoice = 0;
        Boolean error = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1. List the Symbols to Print");
        System.out.println("2. Print a Symbol");
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

            System.out.println("\n1. List the Symbols to Print");
            System.out.println("2. Print a Symbol");
            System.out.println("3. Exit");
            System.out.print("\nWhat would you like to do? ");
        }
        return userChoice;
    }

    public static void main(String[] args)
    {
        SymbolList aList = new SymbolList();
        int userChoice;

        System.out.println("Hello.");
        System.out.println("Welcome to Symbol Finder.");

        userChoice = printOptionsAndCatchErrors();

        while(userChoice != 3)
        {
            if (userChoice == 1)
            {
                // List the symbols to print
                aList.printTheList();
            }
            else if (userChoice == 2)
            {
                // Print a symbol
                aList.printASymbol();
            }

            userChoice = printOptionsAndCatchErrors();
        }
    }
}
