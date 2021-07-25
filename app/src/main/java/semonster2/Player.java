package semonster2;

import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  String name;
  ArrayList<Monster> deck = new ArrayList<>();

  Player(String name) {
    this.name = name;
  }

  public void drawMonsters() {
    for (int i = 0; i < 5; i++) {
      this.deck.add(new Monster());
    }
  }

  public void showDeck() {
    for (Monster m : this.deck) {
      System.out.println(m);
    }
  }

  public String toString() {
    return "Deck:" + this.name;
  }

}
