package fighter;

import behaviours.IChange;
import behaviours.IDefend;
import player.Player;
import weapons.IWeapon;

public abstract class Fighter extends Player implements IChange,IDefend,IWeapon {
    private IWeapon weapon;
    private Protection protection;

    public Fighter(String name, int healthPoints, IWeapon weapon, Protection protection) {
        super(name, healthPoints);
        this.weapon = weapon;
        this.protection = protection;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public Protection getProtection() {
        return protection;
    }
}
