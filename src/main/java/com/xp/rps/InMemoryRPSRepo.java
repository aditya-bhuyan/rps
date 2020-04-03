package com.xp.rps;

public class InMemoryRPSRepo implements  RPSRepo {
    private int round = 0;
    @Override
    public int getRound() {
        return round;
    }

    @Override
    public void addRound() {
        ++round;
    }

    @Override
    public void reset(int i) {
         round = i;
    }


}
