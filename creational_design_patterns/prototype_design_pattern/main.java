package creational_design_patterns.prototype_design_pattern;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        CharacterFactory factory = new CharacterFactory();
        Character newCharacter = factory.createCharacterWithNewAttackPower(100);
        Character newCharacter1=factory.createCharacterWithNewName("Rashid");// No new method needed, just cloning and changing power
        newCharacter1.showCharacterInfo();
    }
}
