package fighter;

import behaviours.IDefend;
import player.Player;
import weapons.IWeapon;

public class Dwarf extends Fighter {
    public Dwarf(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }

    @Override
    public void changeItem() {

    }

    @Override
    public String defend(Player attacker) {
        return String.format("%s defending against %s", this.getName(), attacker.getName());
    }

    @Override
    public String attack(Player defender) {
        return String.format("%s attacking %s with %s", this.getName(),defender.getName(),this.getWeapon().getName());
    }
}
