public class Weapon {
    private String name;
    private WeaponType weaponType;
    private int damage;

    public Weapon(String name, WeaponType weaponType, int damage) {
        this.name = name;
        this.weaponType = weaponType;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getDamage() {
        return damage;
    }
}
