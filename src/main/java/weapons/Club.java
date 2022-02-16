package weapons;

import player.Player;

public class Club implements IWeapon{
    String name;

    public Club() {
        this.name = "club";
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
