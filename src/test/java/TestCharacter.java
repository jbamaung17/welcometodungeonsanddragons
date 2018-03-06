import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCharacter {
    Character character;

    @Before
    public void before() {
        character = new Character("Sing-song man");
    }

    @Test
    public void characterHasName() {
        assertEquals("Sing-song man", character.getName());
    }

    @Test
    public void characterHasRace() {
        assertEquals("Human", character.getRace());
    }
}
