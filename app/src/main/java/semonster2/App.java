package semonster2;

import java.util.Random;

public class App {
  public String getGreeting() {
    return "SEMonster";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    Monster monster = new Monster();
<<<<<<< HEAD
    // Player player = new Player("test player", 100, 7);
    SeMonsterGame SeMonsterGame = new SeMonsterGame(createRandomList(5));
    // player.drawMonsters();

    SeMonsterGame.addPlayer("test player", 100, 7);
    SeMonsterGame.draw("test player");

    System.out.println(monster.toString());
    // System.out.println(player.toString());
  }

  public static int createRandomList(int count) {
    Random random = new Random();
    return (int) random.nextInt(count + 1);
=======
    Player player = new Player("test player", 100, 7);
    // player.drawMonsters();

    System.out.println(monster.toString());
    System.out.println(player.toString());
>>>>>>> main
  }
}