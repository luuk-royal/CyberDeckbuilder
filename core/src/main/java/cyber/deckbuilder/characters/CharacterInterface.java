package cyber.deckbuilder.characters;

public interface CharacterInterface {
    String getCharacterName();

    int getBaseHealth();
    int getMaxHealth();
    int getCurrentHealth();

    /**
     * Base damage value
     *
     * @return characters base damage
     */
    int getBaseDamage();

    /**
     * Buffs/equipment can alter the totalDamage
     *
     * @return total calculated damage
     */
    int getTotalDamage();

    /**
     * attacks 1, 2, 3, etc. enemies in a row
     *
     * @return attack range as int
     */
    int getAttackRange();

    /**
     * Game mechanic?
     *
     * @return the amount of attacks
     */
    int getMultiAttack();
}
