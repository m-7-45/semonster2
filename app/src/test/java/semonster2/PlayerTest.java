package semonster2;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlayerTest {
  @Test
  public void testAppHasAGreeting() {
    Player PlayerTest = new Player("test player");
    assertNotNull("app should have a greeting", PlayerTest.toString());
  }
}
