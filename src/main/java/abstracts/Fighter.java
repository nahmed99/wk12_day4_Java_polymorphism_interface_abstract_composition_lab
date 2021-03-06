package abstracts;

import interfaces.IWeapon;
import main.Club;

public abstract class Fighter extends Player { //implements IWeapon {

    private IWeapon weapon;

    public Fighter (String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
        this.weapon = weapon;
    }

    public void swapWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Enemy enemy) {
        weapon.attack(enemy);
    }

}
