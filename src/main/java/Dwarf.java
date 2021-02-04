import abstracts.Fighter;
import interfaces.IWeapon;

public class Dwarf extends Fighter {

    private int shieldAttack;

    public Dwarf (String name, int healthPoints, IWeapon weapon, int shieldAttack) {
        super(name, healthPoints, weapon);
        this.shieldAttack = shieldAttack;
    }

    public void attack() {

    }

    public void shieldBash() {

    }

}
