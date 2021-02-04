package spells;

import abstracts.Enemy;

public class LightningBolt {

    private int damageAmount;

    public LightningBolt(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    public int getDamageAmount() {
        return damageAmount;
    }

    public void setDamageAmount(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    public void cast(Enemy enemy) {
        int defence = enemy.getArmour();
        int hitStrength = (int) (Math.random() * 20) + 1;
        if (hitStrength >= defence)
            enemy.isHit(this.damageAmount);
    }

}
