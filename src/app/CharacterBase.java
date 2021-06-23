package app;

public abstract class CharacterBase {

    public CharacterBase(ItfWeaponBehavior _weapon) {
        weapon = _weapon;
    }

    private ItfWeaponBehavior weapon;

    // getter
    public ItfWeaponBehavior getWeapon() {
        return this.weapon;
    }

    // setter
    public void setWeapon(ItfWeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void display();

    public void fight() {
        weapon.useWeapon();
    }
}