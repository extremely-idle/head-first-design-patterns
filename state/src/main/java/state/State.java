package state;

/**
 * Created by ross.moug on 10/07/2017.
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void despense();
}
