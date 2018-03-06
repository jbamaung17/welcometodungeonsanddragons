public class Monster {

    private String name;
    private Species species;
    private int hitPoints;

    public Monster(String name, Species species, int hitPoints) {
        this.name = name;
        this.species = species;
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return this.name;
    }

    public Species getSpecies() {
        return this.species;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }
}
