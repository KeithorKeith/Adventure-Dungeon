package Enemy_group;

import Player_group.Player;

public abstract class Enemy{
    private String name;
    private int hitPoints;

    public Enemy(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
