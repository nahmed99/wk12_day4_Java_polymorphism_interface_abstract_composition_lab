package main;

import abstracts.Enemy;
import abstracts.Fighter;
import interfaces.IWeapon;

public class Dwarf extends Fighter {

    private int shieldAttack;
    private boolean usedSpecialAttack;

    public Dwarf (String name, int healthPoints, IWeapon weapon, int shieldAttack) {
        super(name, healthPoints, weapon);
        this.shieldAttack = shieldAttack;
        this.usedSpecialAttack= false;
    }

    public boolean getUsedSpecialAttack() {
        return usedSpecialAttack;
    }

    public void setUsedSpecialAttack(boolean usedSpecialAttack) {
        this.usedSpecialAttack = usedSpecialAttack;
    }

    public void attack() {

    }

    public void shieldBash(Enemy enemy) {
        if (!getUsedSpecialAttack()) {
            enemy.setArmour(enemy.getArmour() - shieldAttack);
            setUsedSpecialAttack(true);
        }
    }

}
