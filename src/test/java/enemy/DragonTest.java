package enemy;

import org.junit.Before;
import org.junit.Test;
import weapons.BreathingFire;

import static org.junit.Assert.assertEquals;

public class DragonTest {
    Dragon dragon;
    BreathingFire weapon;
    @Before
    public void before(){
        dragon = new Dragon("Night Fairy", 1000, weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Night Fairy", dragon.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(1000, dragon.getHealthPoints());
    }
    @Test
    public void hasWeapon(){
        assertEquals(weapon, dragon.getWeapon());
    }
}
