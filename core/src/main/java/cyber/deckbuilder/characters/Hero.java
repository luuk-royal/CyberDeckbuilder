package cyber.deckbuilder.characters;

public class Hero implements CharacterInterface {
    String characterName;
    int baseHealth;
    int maxHealth;
    int currentHealth;
    int baseDamage;
    int totalDamage;
    int attackRange;
    int multiAttack;

    public Hero(
        String characterName,
        int baseHealth,
        int maxHealth,
        int currentHealth,
        int baseDamage,
        int totalDamage,
        int attackRange,
        int multiAttack
    ) {
        this.characterName = characterName;
        this.baseHealth = baseHealth;
        this.maxHealth = maxHealth;
        this.currentHealth = currentHealth;
        this.baseDamage = baseDamage;
        this.totalDamage = totalDamage;
        this.attackRange = attackRange;
        this.multiAttack = multiAttack;
    }

    @Override
    public String getCharacterName() {
        return this.characterName;
    }

    @Override
    public int getBaseHealth() {
        return this.baseHealth;
    }

    @Override
    public int getMaxHealth() {
        return this.maxHealth;
    }

    @Override
    public int getCurrentHealth() {
        return this.currentHealth;
    }

    @Override
    public int getBaseDamage() {
        return this.baseDamage;
    }

    @Override
    public int getTotalDamage() {
        return this.totalDamage;
    }

    @Override
    public int getAttackRange() {
        return this.attackRange;
    }

    @Override
    public int getMultiAttack() {
        return this.multiAttack;
    }
}
