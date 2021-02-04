package main;

import abstracts.Enemy;
import abstracts.MagicUser;
import interfaces.IDefend;
import interfaces.ISpell;
import interfaces.IWeapon;

public class Warlock extends MagicUser implements ISpell, IDefend {

//    private ISpell currentSpell;
//    private IDefend currentMinion;

    public Warlock (String name, int healthPoints, ISpell currentSpell, IDefend currentMinion) {
        super(name, healthPoints, currentSpell, currentMinion);
    }


    public void protect(Enemy enemy) {

    }

    public void cast(Enemy enemy) {

    }
}
