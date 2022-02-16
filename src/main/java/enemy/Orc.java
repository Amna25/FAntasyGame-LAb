package enemy;

import weapons.IWeapon;

public class Orc extends Enemy{
    public Orc(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }
}
