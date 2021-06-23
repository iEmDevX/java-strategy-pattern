package app.characters;

import app.CharacterBase;
import app.ItfWeaponBehavior;

public class Paladin extends CharacterBase {

    public Paladin(ItfWeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void display() {
        System.out.println("--> You are a Paladin.");
    }
}