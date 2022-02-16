package weapons;

import player.Player;

public interface IWeapon {

    public String attack(Player defender, IWeapon weapon);
}
