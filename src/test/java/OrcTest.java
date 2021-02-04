import main.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;


public class OrcTest {

    private Orc orc;

    @Before
    public void before() {
        orc = new Orc(10, 12);
    }

    @Test
    public void canCreateOrc() {
        assertNotNull(orc);
    }

}
