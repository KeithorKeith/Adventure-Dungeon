package Items;

import PlayerGroup.Player;

public class HealingPotion {

    public void heal(Player player) {
        int startingHealth = player.getHealth();
        player.sethealth(startingHealth + 25);
    }
}
