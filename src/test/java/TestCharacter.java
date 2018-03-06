import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCharacter {
    Character character;
    Weapon weapon;

    @Before
    public void before() {
        character = new Character("Sing-song man", Race.HUMAN, CharacterClass.BARD, 5);
        weapon = new Weapon("Excalibur", WeaponType.SWORD, 10);
    }

    @Test
    public void characterHasName() {
        assertEquals("Sing-song man", character.getName());
    }

    @Test
    public void characterHasRace() {
        assertEquals(Race.HUMAN, character.getRace());
    }

    @Test
    public void characterHasClass() {
        assertEquals(CharacterClass.BARD, character.getCharacterClass());
    }

    @Test
    public void weaponsArrayStartsAtZero() {
        assertEquals(0, character.weaponCount() );
    }

    @Test
    public void characterCanAddWeapon() {
        character.addWeapon(weapon);
        assertEquals(1, character.weaponCount());
    }

    @Test
    public void characterHasMaxCapacityForWeapons() {
        assertEquals(5, character.getCapacity());
    }

    @Test
    public void characterCannotGoOverCapacity() {
        character.addWeapon(weapon);
        character.addWeapon(weapon);
        character.addWeapon(weapon);
        character.addWeapon(weapon);
        character.addWeapon(weapon);
        character.addWeapon(weapon);
        assertEquals(5, character.weaponCount());

    }

}
