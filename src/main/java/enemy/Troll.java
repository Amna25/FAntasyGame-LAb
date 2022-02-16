package enemy;

import weapons.IWeapon;

public class Troll extends Enemy{
    public Troll(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }
}
