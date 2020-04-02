package com.xp.rps;

import java.io.Serializable;

public class PlayRequest implements Serializable {
    RPS p1;
    RPS p2;
    public PlayRequest(String rps1, String rps2) {
        p1 = getRPSFromString(rps1);
        p2 = getRPSFromString(rps2);
    }

    private RPS getRPSFromString(String rps){
        RPS rp = null;
        System.out.println("Value of RPS ==============="+rps);
        if(rps != null) {
            if (rps.equalsIgnoreCase("rock")) {
                rp = RPS.ROCK;
            }
            if (rps.equalsIgnoreCase("paper")) {
                rp = RPS.PAPER;
            }
            if (rps.equalsIgnoreCase("scissors")) {
                rp = RPS.SCISSORS;
            }
        }
        return rp;
    }

    public RPS getP1() {
        return p1;
    }

    public void setP1(RPS p1) {
        this.p1 = p1;
    }

    public RPS getP2() {
        return p2;
    }

    public void setP2(RPS p2) {
        this.p2 = p2;
    }
}
