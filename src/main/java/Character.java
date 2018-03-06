public class Character {
    private String name;
    private Race race;

    public Character(String name, Race race) {
        this.name = name;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public Race getRace() {
        return race;
    }
}
