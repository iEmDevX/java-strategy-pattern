package app;

import app.characters.Barbarian;
import app.characters.Paladin;
import app.weapons.KnifeBehavior;
import app.weapons.SwordBehavior;

public class App {
    public static void main(String[] args) throws Exception {
        CharacterBase character = new Barbarian(new KnifeBehavior());
        character.display();
        character.getWeapon().display();
        character.fight();

        character.setWeapon(new SwordBehavior());
        character.getWeapon().display();
        character.fight();

        character = new Paladin(new KnifeBehavior());
        character.display();
        character.getWeapon().display();
        character.fight();
    }
}
