package com.xp.rps;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RPSRepoTest {

    @Test
    public void testInMemoryRepo(){
          RPSRepo repo = new InMemoryRPSRepo();
          assertNotNull(repo);
          assertTrue(repo instanceof RPSRepo);
          assertEquals(repo.getRound(),0);
          repo.addRound();
          repo.addRound();
          assertEquals(repo.getRound(),2);

    }

        }

