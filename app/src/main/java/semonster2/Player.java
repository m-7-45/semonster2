package semonster2;

import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  String name;
  int hp;
  ArrayList<Monster> deck = new ArrayList<>();

  Player(String name, int hp) {
    this.name = name;
    this.hp = hp;
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
    StringBuilder info = new StringBuilder();

    info.append("Deck:" + this.name + " HP:" + this.hp + "\n");
    for (Monster m : this.deck) {
      info.append(m + "\n");
    }

    return info.toString();
  }

}
