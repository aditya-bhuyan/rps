package com.xp.rps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static  com.xp.rps.RPS.*;
import static com.xp.rps.Result.*;


public class RPSTest {

    @Test
    public void RvsPTest(){
        assertEquals(RPSApp.play(ROCK,PAPER),P1_WIN);

    }

    @Test
    public void PvsRTest(){
        assertEquals(RPSApp.play(PAPER,ROCK),P2_WIN);
    }
    @Test
    public void SvsRTest(){
        assertEquals(RPSApp.play(SCISSORS,ROCK),P2_WIN);
    }
    @Test
    public void RvsSTest(){
        assertEquals(RPSApp.play(ROCK,SCISSORS),P1_WIN);
    }
    @Test
    public void SvsPTest(){
        assertEquals(RPSApp.play(SCISSORS,PAPER),P1_WIN);

    }
    @Test
    public void PvsSTest(){
        assertEquals(RPSApp.play(PAPER,SCISSORS),P2_WIN);
    }
    @Test
    public void RvsRTest(){
        assertEquals(RPSApp.play(ROCK,ROCK),DRAW);

    }
    @Test
    public void PvsPTest(){
        assertEquals(RPSApp.play(PAPER,PAPER),DRAW);
    }
    @Test
    public void SvsSTest(){
        assertEquals(RPSApp.play(SCISSORS,SCISSORS),DRAW);
    }

}
