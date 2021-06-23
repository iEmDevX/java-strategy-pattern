package app.characters;

import app.CharacterBase;
import app.ItfWeaponBehavior;

public class Barbarian extends CharacterBase {

    public Barbarian(ItfWeaponBehavior weapon) {
        super(weapon);
    }

    @Override
    public void display() {
        System.out.println("--> You are a King.");
    }
}