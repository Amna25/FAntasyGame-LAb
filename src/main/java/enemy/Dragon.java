package enemy;

import weapons.IWeapon;

public class Dragon extends Enemy{
    public Dragon(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints, weapon);
    }
}
