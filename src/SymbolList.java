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

        Scanner scanner = new Scanner(System.in);
    }

    public SymbolList()
    {
        theList[0] = new Symbol("Hello", "(^ _ ^)/");
        theList[1] = new Symbol("Goodbye", "( ^_^)／");
    }
}
