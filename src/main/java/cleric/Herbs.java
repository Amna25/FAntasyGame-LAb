package cleric;

import player.Player;

public class Herbs implements IHeal{

   private String name;
   private int healingPoint;

    public Herbs(String name, int healingPoint) {
        this.name = name;
        this.healingPoint = healingPoint;
    }

    public String getName() {
        return name;
    }

    public int getHealingPoint() {
        return healingPoint;
    }


    public void heal(Player player) {
        player.addHealthPoints(this.healingPoint);

    }


}
