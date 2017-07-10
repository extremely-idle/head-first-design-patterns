package state.impl;

import gumball.GumballMachine;
import state.State;

/**
 * Created by ross.moug on 10/07/2017.
 */
public class SoldOutState implements State {
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs!");
    }

    @Override
    public void despense() {
        System.out.println("No gumball dispensed");

    }

    @Override
    public String toString() {
        return "state.impl.SoldOutState";
    }
}
