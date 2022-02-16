package weapons;

import player.Player;

public class Sword implements IWeapon{
    String name;

    public Sword() {
        this.name = "sword";
    }

    @Override
    public String attack(Player defender) {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
