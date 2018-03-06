import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    private String name;
    private Race race;
    private CharacterClass characterClass;
    private ArrayList<Weapon> weapons;
    private int capacity;
    private int hitPoints;
    private HashMap<String, Integer> stats;

    public Character(String name, Race race, CharacterClass characterClass, int capacity, int hitPoints) {
        this.name = name;
        this.race = race;
        this.characterClass = characterClass;
        this.weapons = new ArrayList<>();
        this.capacity = capacity;
        this.hitPoints = hitPoints;
        this.stats = new HashMap<>();
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

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void insertStats(String property, Integer value) {
        stats.put(property, value);
    }

    public int seeStats(String property) {
        return stats.get(property);
    }

}
