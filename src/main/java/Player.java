import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Character> characters;

    public Player(String name) {
        this.name = name;
        this.characters = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public int characterCount() {
        return characters.size();
    }
}
