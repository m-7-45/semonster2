package semonster2

import org.junit.Test;

import jdk.jfr.Timestamp;

import static org.junit.Assert;

public class SeMonsterGame {
  @Test
  public void testAppHasAGreeting() {
    SeMonsterGame SeMonsterGameTest = new SeMonsterGame();
    assertNotNull("app should hava a greeting", SeMonsterGame.tostring());
  }
}
