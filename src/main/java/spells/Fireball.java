package spells;

import abstracts.Enemy;
import interfaces.ISpell;

public class Fireball implements ISpell {

    private int damageAmount;

    public Fireball(int damageAmount) {
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
