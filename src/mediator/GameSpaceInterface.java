package mediator;

/**
 * Interface for a game space that acts as a mediator for cells.
 * Defines methods for adding cells, handling state change requests, and printing cell states.
 */
public interface GameSpaceInterface {

    /**
     * Adds a cell to the game space.
     *
     * @param cell the cell to add.
     */
    void addCell(Cell cell);

    /**
     * Requests a state change for a specific cell.
     *
     * @param cell the cell for which the state change is requested.
     * @param newState the new state to set.
     */
    void requestStateChange(CellInterface cell, String newState);

    /**
     * Prints the current states of all cells in the game space.
     */
    void printCells();
}
