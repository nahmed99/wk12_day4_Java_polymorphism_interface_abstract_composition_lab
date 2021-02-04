import abstracts.Enemy;
import main.Club;
import main.Dwarf;
import main.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Club club;
    private Enemy orc;

    @Before
    public void before() {
        club = new Club(9);
        dwarf = new Dwarf("Happy", 15, club, 4);
        orc = new Orc(10, 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Happy", dwarf.getName());
    }

    @Test
    public void canAttackEnemy() {
        dwarf.attack(orc);
        assertEquals(1, orc.getHealthPoints());
    }

}
