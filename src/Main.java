import mediator.*;

/**
 * Main class to demonstrate the mediator pattern with cells in a game space.
 *
 * @author Herasymchuk Danyil
 */
public class Main {
    /**
     * Main method to set up and demonstrate cell state transitions within a game space.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a mediator (GameSpace)
        GameSpace gameSpace = new GameSpace();

        // Create cells with specific initial states and add them to the GameSpace
        Cell cell1 = new Cell("Empty", gameSpace);
        Cell cell2 = new Cell("Obstacle", gameSpace);
        Cell cell3 = new Cell("Mob", gameSpace);

        // Add cells to the mediator (GameSpace)
        gameSpace.addCell(cell1);
        gameSpace.addCell(cell2);
        gameSpace.addCell(cell3);

        // Print the initial states of all cells
        System.out.println("Initial states of cells:");
        gameSpace.printCells();

        // Change the state of the cells to demonstrate transitions
        System.out.println("\nChanging states of cells...");
        cell1.changeState("Mob");        // Changing from Empty to Mob
        cell2.changeState("Empty");      // Changing from Obstacle to Empty
        cell3.changeState("Obstacle");   // Changing from Mob to Obstacle

        // Print the updated states of all cells
        System.out.println("\nUpdated states of cells:");
        gameSpace.printCells();
    }
}
