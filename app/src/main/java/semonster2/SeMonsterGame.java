package semonster2;

import java.util.HashMap;
import java.util.LinkedList;

public class SeMonsterGame {

  HashMap<String, Player> playerMap = new HashMap<>();
  int randomNumberList;

  /**
   * 0~7までの値がランダムに一定数格納されたLinkedLIst
   *
   * @param randomNumberList
   */
  SeMonsterGame(int randomNumberList) {
    this.randomNumberList = randomNumberList;
  }

  /**
   * プレイヤーを追加
   *
   * @param playerName
   */
  void addPlayer(String playerName, int hp, int carry) {
    this.playerMap.put(playerName, new Player(playerName, hp, carry));
  }

  void draw(String playerName) {
    Player player = this.playerMap.get(playerName);
    player.drawMonsters();
    System.out.println(player.toString());
  }

}
