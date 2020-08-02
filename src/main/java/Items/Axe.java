package Items;

import Interfaces.IWeapon;
import PlayerGroup.Player;

public class Axe implements IWeapon {

    public void attack(Player target) {
        int startingHealth = target.getHealth();
        target.setHealth(startingHealth - 25);
    }

}
