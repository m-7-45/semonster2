package semonster2;

import java.util.ArrayList;

/**
 * プレイヤーはモンスターデッキを持つ
 *
 * Deck：MonsterのArrayList
 */
public class Player {
  String name; // player name
  int hp; // player HP
  int carry_mom; // 持ちモンスター数
  ArrayList<Monster> deck = new ArrayList<>();

  Player(String name, int hp, int carry) {
    this.name = name;
    this.hp = hp;
    if (carry < 0)
      this.carry_mom = 1;
    else if (carry > 8)
      this.carry_mom = 8;
    else
      this.carry_mom = carry;
  }

  public void drawMonsters() {
    for (int i = 0; i < this.carry_mom; i++) {
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

    info.append("プレイヤー名:" + this.name + " HP:" + this.hp + " 持ち数:" + carry_mom + "\n");
    info.append("持ちモンスター:\n");
    for (Monster m : this.deck) {
      info.append(m + "\n");
    }

    return info.toString();
  }

}
