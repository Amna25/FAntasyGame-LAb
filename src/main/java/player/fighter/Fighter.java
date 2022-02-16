package player.fighter;

import player.Player;
import player.weapons.IWeapon;

public abstract class Fighter extends Player {
    private IWeapon weapon;
    private Protection protection;

    public Fighter(String name, int healthPoints, IWeapon weapon, Protection protection) {
        super(name, healthPoints);
        this.weapon = weapon;
        this.protection = protection;
    }
}
