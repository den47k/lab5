package mediator;

/**
 * Interface for a cell within a game space.
 * Defines methods for state management and change requests.
 */
public interface CellInterface {

    /**
     * Gets the current state of the cell.
     *
     * @return the current state of the cell.
     */
    String getState();

    /**
     * Sets a new state for the cell.
     *
     * @param state the new state to set.
     */
    void setState(String state);

    /**
     * Requests a change of state for the cell.
     *
     * @param state the new state to change to.
     */
    void changeState(String state);
}
