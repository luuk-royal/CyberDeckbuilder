package cyber.deckbuilder.characters;

/**
 * NOTE this is just for easy testing with a base character, will be removed in the future
 */
public class Character {
    String characterName;
    int maxHealth;
    int currentHealth;
    int totalDamage;
    int attackRange;
    int multiAttack;
    boolean hasAttacked = false;

    public Character(
        String characterName,
        int maxHealth,
        int currentHealth,
        int totalDamage,
        int attackRange,
        int multiAttack
    ) {
        this.characterName = characterName;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.totalDamage = totalDamage;
        this.attackRange = attackRange;
        this.multiAttack = multiAttack;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public int getTotalDamage() {
        return this.totalDamage;
    }

    public int getAttackRange() {
        return this.attackRange;
    }

    public int getMultiAttack() {
        return this.multiAttack;
    }

    public void setHasAttacked(boolean hasAttacked) {
        this.hasAttacked = hasAttacked;
    }

    public boolean getHasAttacked(boolean hasAttacked) {
        return this.hasAttacked = hasAttacked;
    }
}
