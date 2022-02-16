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

    public String defend(Player attacker) {
        return String.format("%s defending against %s", this.getName(), attacker.getName());
    }


    public String attack(Player defender) {
        defender.takeDamage();
        return String.format("%s attacking %s with %s", this.getName(),defender.getName(),this.getWeapon().getName());
    }

    public void changeItem(IWeapon weapon){
        this.weapon = weapon;
    }

}
