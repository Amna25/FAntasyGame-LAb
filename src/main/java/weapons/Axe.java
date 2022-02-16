package weapons;

import player.Player;

public class Axe implements IWeapon{
    String name;

    public Axe() {
        this.name = "Axe";
    }

    public String getName() {
        return name;
    }

    @Override
    public String attack(Player defender) {
        return null;
    }
}
