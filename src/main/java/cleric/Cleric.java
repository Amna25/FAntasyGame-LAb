package cleric;

import behaviours.IChange;
import player.Player;


public class Cleric extends Player  {

    private IHeal heal;
    public Cleric(String name, int healthPoints, IHeal heal) {
        super(name, healthPoints);
        this.heal = heal;
    }

   public void changeHeal(IHeal heal){
        this.heal = heal;
   }



}
