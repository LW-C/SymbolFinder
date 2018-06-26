import java.util.Scanner;

public class SymbolList
{
    private Symbol[] theList = new Symbol[100];

    /*
     *  The goal of printTheList is to print the name
     *  of every figure in the list.
     */
    public void printTheList()
    {
        System.out.println("\nSymbols to print: ");
        for(int j = 0; j < theList.length; j++)
        {
            if(theList[j] == null)
                return;
            else
                System.out.println("* " + theList[j].getSymbolName());
        }
    }

    /*
     *  The goal of printAFigure is to print the figure
     *  specified by the user. If the user inputs "X"
     *  or "x" it exits the method. If the user inputs
     *  a name not found in the list, then the method
     *  gives an error and asks the user to input a
     *  valid figure name.
     */
    public void printAFigure()
    {
        boolean exit = false;
        boolean validName = false;
        String userInput = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter the name of the figure you would like to");
        System.out.print("print, or X to return to the main menu: ");

        while(!validName)
        {
            // Debugging
            System.out.println("J");

            userInput = scanner.nextLine();

            if(userInput.equalsIgnoreCase("X"))
                return;

            for (int j = 0; j < theList.length; j++)
            {
                if(theList[j] == null)
                {

                    // Debugging
                    System.out.println("K");

                    break;
                }

                else if (userInput.equalsIgnoreCase(theList[j].getSymbolName()))
                {
                    validName = true;
                    System.out.println("\nSymbol:");
                    System.out.println(theList[j].getSymbolImage());
                    return;
                }

                // Debugging
                System.out.println("I");
            }

            scanner.nextLine();

            System.out.println("\nInvalid name.");
            System.out.println("Enter the name of the figure you would like to");
            System.out.print("print, or X to return to the main menu: ");
        }
    }

    public SymbolList()
    {
        theList[0] = new Symbol("Hello", "(^ _ ^)/");
        theList[1] = new Symbol("Goodbye", "( ^_^)／");
    }
}
