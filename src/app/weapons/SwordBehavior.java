package app.weapons;

import app.ItfWeaponBehavior;

public class SwordBehavior implements ItfWeaponBehavior {

    @Override
    public void display() {
        System.out.println("a long, sharp sword.");
    }

    @Override
    public void useWeapon() {
        System.out.println("You slash with your sword.");
    }

}
