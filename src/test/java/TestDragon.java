import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDragon {
    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Puff", Species.DRAGON, 100);
    }

    @Test
    public void dragonHasName() {
        assertEquals("Puff", dragon.getName());
    }
}

