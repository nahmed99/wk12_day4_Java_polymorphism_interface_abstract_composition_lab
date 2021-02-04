package main;

import abstracts.Enemy;
import interfaces.IWeapon;

public class Club implements IWeapon {

    private int damageAmount;

    public Club(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    public int getDamageAmount() {
        return damageAmount;
    }

    public void setDamageAmount(int damageAmount) {
        this.damageAmount = damageAmount;
    }

    public void attack(Enemy enemy) {
        int defence = enemy.getArmour();
        int hitStrength = (int) (Math.random() * 20) + 1;
        if (hitStrength >= defence)
            enemy.isHit(this.damageAmount);
    }

}
