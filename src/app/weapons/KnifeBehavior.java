package app.weapons;

import app.ItfWeaponBehavior;

public class KnifeBehavior implements ItfWeaponBehavior {

    @Override
    public void display() {
        System.out.println("a dull knife.");
    }

    @Override
    public void useWeapon() {
        System.out.println("You stab wildly with your knife.");
    }

}
