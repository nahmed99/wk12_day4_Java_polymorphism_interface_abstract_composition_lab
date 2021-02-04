import abstracts.Enemy;
import main.Barbarian;
import main.Club;
import main.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Club club;
    private Enemy orc;

    @Before
    public void before() {
        club = new Club(9);
        barbarian = new Barbarian("Conan", 25, club, 7);
        orc = new Orc(10, 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void canAttackEnemy() {
        barbarian.attack(orc);
        assertEquals(1, orc.getHealthPoints());
    }

    @Test
    public void canGoBeserkOnEnemy() {
        assertEquals(false, barbarian.getUsedSpecialAttack());

        barbarian.goBerserk(orc);
        assertEquals(3, orc.getHealthPoints());
        assertEquals(true, barbarian.getUsedSpecialAttack());
    }

}
