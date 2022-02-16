package fighter;

import behaviours.IChange;
import behaviours.IDefend;
import player.Player;
import weapons.IWeapon;

public abstract class Fighter extends Player implements IChange,IDefend,IWeapon {
    private IWeapon weapon;


    public Fighter(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

}
