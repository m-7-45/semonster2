package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void testAppHasAGreeting() {
    Player PlayerTest = new Player("test player", 100, 5);
    PlayerTest.drawMonsters();
    assertNotNull("app should have a greeting", PlayerTest.toString());
  }
}
