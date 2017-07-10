package state.impl;

import gumball.GumballMachine;
import state.State;

/**
 * Created by ross.moug on 10/07/2017.
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    @Override
    public void despense() {
        System.out.println("You need to pay first");
    }

    @Override
    public String toString() {
        return "state.impl.NoQuarterState";
    }
}
