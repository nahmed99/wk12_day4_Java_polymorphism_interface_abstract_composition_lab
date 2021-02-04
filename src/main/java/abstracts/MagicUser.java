package abstracts;

import interfaces.IDefend;
import interfaces.ISpell;

public abstract class MagicUser extends Player implements ISpell, IDefend {

    ISpell currentSpell;
    IDefend currentMinion;

    public MagicUser(String name, int healthPoints, ISpell currentSpell, IDefend currentMinion) {
        super(name, healthPoints);
        this.currentSpell = currentSpell;
        this.currentMinion = currentMinion;
    }

    public ISpell getCurrentSpell() {
        return currentSpell;
    }

    public void setCurrentSpell(ISpell currentSpell) {
        this.currentSpell = currentSpell;
    }

    public IDefend getCurrentMinion() {
        return currentMinion;
    }

    public void setCurrentMinion(IDefend currentMinion) {
        this.currentMinion = currentMinion;
    }

}
