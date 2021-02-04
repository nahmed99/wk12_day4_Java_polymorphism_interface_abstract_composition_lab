package abstracts;

public abstract class Enemy {

    private int healthPoints;
    private int armour;

    public Enemy(int healthPoints, int armour) {
        this.healthPoints = healthPoints;
        this.armour = armour;
    }

    public void isHit(int damage) {
        healthPoints -= damage;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int armour) {
        this.healthPoints = healthPoints;
    }

}
