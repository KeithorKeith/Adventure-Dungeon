package Player_group;

public abstract class Player {
    private String name;
    private int hitPoints;

    public Player(String name, int hitPoints) {
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
