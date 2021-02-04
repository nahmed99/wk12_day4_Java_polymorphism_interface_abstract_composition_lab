import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    private Dwarf dwarf;
    private Club club;

    @Before
    public void before() {
        club = new Club(5);
        dwarf = new Dwarf("Happy", 15, club, 4);
    }

    @Test
    public void canGetName() {
        assertEquals("Happy", dwarf.getName());
    }

}
