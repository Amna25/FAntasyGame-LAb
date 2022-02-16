package fighter;

import behaviours.IDefend;
import player.Player;
import weapons.IWeapon;

public class Dwarf extends Fighter {
    public Dwarf(String name, int healthPoints, IWeapon weapon, Protection protection) {
        super(name, healthPoints, weapon, protection);
    }

    @Override
    public void changeItem() {

    }

    @Override
    public String defend(Player attacker) {
        return null;
    }

    @Override
    public String attack(Player defender, IWeapon weapon) {
        return null;
    }
}
