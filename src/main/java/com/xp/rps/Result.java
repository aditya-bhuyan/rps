package com.xp.rps;

public enum Result {
    P1_WIN("Player 1 Wins"),P2_WIN("Player 2 Wins"), DRAW("Game Drawn");
    private String result;
    private Result(String result){
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}
