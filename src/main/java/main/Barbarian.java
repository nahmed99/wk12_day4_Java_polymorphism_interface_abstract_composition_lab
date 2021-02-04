package main;

import abstracts.Enemy;
import abstracts.Fighter;
import interfaces.IWeapon;

public class Barbarian extends Fighter {

    private int roarAttack;
    private boolean usedSpecialAttack;

    public Barbarian (String name, int healthPoints, IWeapon weapon, int roarAttack) {
        super(name, healthPoints, weapon);
        this.roarAttack = roarAttack;
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

    public void goBerserk(Enemy enemy) {
        if (!getUsedSpecialAttack()) {
            enemy.isHit(roarAttack);
            setUsedSpecialAttack(true);
        }
    }

}
