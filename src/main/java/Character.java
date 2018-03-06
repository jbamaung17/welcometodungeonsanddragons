import java.util.ArrayList;

public class Character {
    private String name;
    private Race race;
    private CharacterClass characterClass;
    private ArrayList<Weapon> weapons;
    private int capacity;

    public Character(String name, Race race, CharacterClass characterClass, int capacity) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.weapons = new ArrayList<>();
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public int weaponCount() {
        return weapons.size();
    }

    public void addWeapon(Weapon weapon) {
        if (this.weaponCount() < this.capacity)
        weapons.add(weapon);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
