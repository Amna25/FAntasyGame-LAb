package fighter;


import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf, dwarf1;
    Axe weapon;


    @Before
    public void before(){
        weapon = new Axe();
        dwarf = new Dwarf("Balor Bronzebeard", 100, weapon );
        dwarf1 = new Dwarf("Bob",100, weapon);
    }
    @Test
    public void hasName(){
        assertEquals("Balor Bronzebeard",dwarf.getName());
    }
    @Test
    public void hasHealthPoints(){
        assertEquals(100, dwarf.getHealthPoints());
    }
    @Test
    public void hasWeapon(){
        assertEquals(weapon, dwarf.getWeapon());
    }
    @Test
    public void canDefend(){
        assertEquals("Balor Bronzebeard defending against Bob", dwarf.defend(dwarf1));
    }

    @Test
    public void canAttack(){
        assertEquals("Balor Bronzebeard attacking Bob with Axe", dwarf.attack(dwarf1));
        assertEquals(90, dwarf1.getHealthPoints());
    }

    @Test
    public void canChangeWeapons(){
        Club club = new Club();
        dwarf.changeItem(club);
        assertEquals(club, dwarf.getWeapon());
    }
}
