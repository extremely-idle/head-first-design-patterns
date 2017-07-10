package state.impl;

import gumball.GumballMachine;
import state.State;

import java.util.Random;

/**
 * Created by ross.moug on 10/07/2017.
 */
public class HasQuarterState implements State {
    private final GumballMachine gumballMachine;
    private final Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");

        final int winner = randomWinner.nextInt(10);

        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void despense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "state.impl.HasQuarterState";
    }
}
