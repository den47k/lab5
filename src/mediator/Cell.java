package mediator;

/**
 * Represents a cell within a game space.
 * Each cell has a state and interacts with the game space mediator.
 */
public class Cell implements CellInterface {

    private String state;
    private final GameSpaceInterface mediator;

    /**
     * Constructs a cell with an initial state and mediator.
     *
     * @param state    the initial state of the cell.
     * @param mediator the mediator responsible for managing cell interactions.
     */
    public Cell(String state, GameSpace mediator) {
        this.state = state;
        this.mediator = mediator;
    }

    /**
     * Gets the current state of the cell.
     *
     * @return the current state of the cell.
     */
    @Override
    public String getState() {
        return state;
    }

    /**
     * Sets a new state for the cell.
     *
     * @param state the new state to set for the cell.
     */
    @Override
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Requests a state change for the cell via the mediator.
     *
     * @param state the new state to change to.
     */
    @Override
    public void changeState(String state) {
        mediator.requestStateChange(this, state);
    }
}
