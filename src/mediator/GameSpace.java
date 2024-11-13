package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Mediator class representing a game space containing cells.
 * Manages the addition of cells and their state changes.
 */
public class GameSpace implements GameSpaceInterface {

    private final List<CellInterface> cells = new ArrayList<>();

    /**
     * Adds a cell to the game space.
     *
     * @param cell the cell to be added.
     */
    @Override
    public void addCell(Cell cell) {
        cells.add(cell);
    }

    /**
     * Requests a state change for a specific cell.
     *
     * @param cell the cell for which the state change is requested.
     * @param newState the new state to set for the cell.
     */
    @Override
    public void requestStateChange(CellInterface cell, String newState) {
        cell.setState(newState);
        System.out.println("State of cell changed to: " + newState);
    }

    /**
     * Prints the current states of all cells in the game space.
     */
    @Override
    public void printCells() {
        for (CellInterface cell : cells) {
            System.out.println(cell.getState());
        }
    }
}
