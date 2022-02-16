package fighter;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class BarberianTest {
    Barbarian barbarian, barbarian1;
    Axe weapon;


    @Before
    public void before(){
        weapon = new Axe();
        barbarian = new Barbarian("Stakr", 100, weapon );
        barbarian1 = new Barbarian("Bob",100, weapon);
    }
    @Test
    public void hasName(){
        assertEquals("Stakr",barbarian.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }
    @Test
    public void hasWeapon(){
        assertEquals(weapon, barbarian.getWeapon());
    }
    @Test
    public void canDefend(){
        assertEquals("Stakr defending against Bob", barbarian.defend(barbarian1));
    }

    @Test
    public void canAttack(){
        assertEquals("Stakr attacking Bob with Axe", barbarian.attack(barbarian1));
    }

}
