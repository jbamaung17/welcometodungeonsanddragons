import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {
    Player player;
    Character character;

    @Before
    public void before() {
        player = new Player("Scott");
        character = new Character("Sing-song man");
    }

    @Test
    public void playerHasName() {
        assertEquals("Scott", player.getName());
    }

    @Test
    public void playerCanAddCharacter() {
        player.addCharacter(character);
        assertEquals(1, player.characterCount());
    }
}
