package fighter;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight, knight1;
    Axe weapon;

    @Before
    public void before(){
        weapon = new Axe();
        knight = new Knight("Balor Bronzebeard", 100, weapon );
        knight1 = new Knight("Bob",100, weapon);
    }
    @Test
    public void hasName(){
        assertEquals("Balor Bronzebeard",knight.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }
    @Test
    public void hasWeapon(){
        assertEquals(weapon, knight.getWeapon());
    }
    @Test
    public void canDefend(){
        assertEquals("Balor Bronzebeard defending against Bob", knight.defend(knight1));
    }

    @Test
    public void canAttack(){
        assertEquals("Balor Bronzebeard attacking Bob with Axe", knight.attack(knight1));
    }

    @Test
    public void canChangeWeapons(){
        Club club = new Club();
        knight.changeItem(club);
        assertEquals(club, knight.getWeapon());
    }
}
