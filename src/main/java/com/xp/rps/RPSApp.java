package com.xp.rps;

import static  com.xp.rps.RPS.*;
import static  com.xp.rps.Result.*;
public class RPSApp {

    public static Result play(RPS obj1, RPS obj2) {

        if(obj1.equals(obj2))
            return DRAW;

        if(obj1.equals(ROCK) && obj2.equals(PAPER)  || obj1.equals(SCISSORS) && obj2.equals(PAPER) || obj1.equals(ROCK) && obj2.equals(SCISSORS)){
            return P1_WIN;
        }else {
            return P2_WIN;
        }

    }
}
