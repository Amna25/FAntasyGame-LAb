package weapons;

import player.Player;

public class BreathingFire implements IWeapon{
    String name;

    public BreathingFire() {
        this.name = "BreathingFire";
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
