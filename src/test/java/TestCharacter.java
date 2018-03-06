import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestCharacter {
    Character character;
    Weapon weapon;
    Player player;

    @Before
    public void before() {
        character = new Character("Sing-song man", Race.HUMAN, CharacterClass.BARD, 5, 50);
        weapon = new Weapon("Excalibur", WeaponType.SWORD, 10);
        player = new Player("Scott");
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

    @Test
    public void characterHasHitPoints() {
        assertEquals(50, character.getHitPoints());
    }

    @Test
    public void characterCanAddStats() {
        character.insertStats("Strength", 10);
        character.insertStats("Dexterity", 7);
        character.insertStats("Constitution", 11);
        character.insertStats("Intelligence", 19);
        character.insertStats("Wisdom", 8);
        character.insertStats("Charisma", 15);
        character.insertStats("Passive Perception", 20);
        assertEquals( 10, character.seeStats("Strength"));
        assertEquals(7, character.seeStats("Dexterity"));
        assertEquals(11, character.seeStats("Constitution"));
        assertEquals(19, character.seeStats("Intelligence"));
        assertEquals(8, character.seeStats("Wisdom"));
        assertEquals(15, character.seeStats("Charisma"));
        assertEquals(20, character.seeStats("Passive Perception"));
    }

    @Test
    public void charactersCanWalk() {
        player.addCharacter(character);
        assertEquals("And so Sing-song man walked, and as he walked so Scott did describe him walking", character.walk(player));
    }

    @Test
    public void charactersCanFightMelee() {
        player.addCharacter(character);
        character.addWeapon(weapon);
        assertEquals("Sing-song man swings Excalibur and does 10 damage.", character.meleeAttack());
    }


}
