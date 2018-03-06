import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {
    Player player;

    @Before
    public void before() {
        player = new Player("Scott");
    }

    @Test
    public void playerHasName() {
        assertEquals("Scott", player.getName());
    }
}
