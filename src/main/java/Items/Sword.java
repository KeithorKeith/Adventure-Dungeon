package Items;

import Interfaces.IWeapon;
import PlayerGroup.Player;

public class Sword implements IWeapon{

    public void attack(Player target) {
        int startingHealth = target.getHealth();
        target.setHealth(startingHealth - 30);
    }

}
