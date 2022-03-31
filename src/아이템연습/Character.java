package 아이템연습;

public class Character {
    // could be an orc, animal, human and what the imagination has to offer
    private String species;
    // not every char must have a name. E. g. pigs usually dont have names
    private String name;
    private int healthPoints;
    private int healthPointsMax;
    private int energyPoints;
    private int energyPointsMax;

    public Character(String species, String name, int healthPoints, int healthPointsMax ,int energyPoints, int energyPointsMax) {
        this.species = species;
        this.name = name;
        this.healthPoints = healthPoints;
        this.healthPointsMax = healthPointsMax;
        this.energyPoints = energyPoints;
        this.energyPointsMax = energyPointsMax;
    }

    public Character(String species, String name, int healthPoints, int energyPoints) {
        this(species, name, healthPoints, healthPoints, energyPoints, energyPoints);
    }

    public Character(String species, int healthPoints, int energyPoints) {
        this(species, null, healthPoints, energyPoints);
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getHealthPointsMax() {
        return healthPointsMax;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public int getEnergyPointsMax() {
        return energyPointsMax;
    }

    public void HealthUpPoints(int healthPoints) {
        if (this.healthPoints + healthPoints > this.healthPointsMax) {
            this.healthPoints = healthPointsMax;
        } else {
            this.healthPoints += healthPoints;
        }
    }

    public void EnergyUpPoints(int energyPoints) {
        if (this.energyPoints + energyPoints > energyPointsMax) {
            this.energyPoints = energyPointsMax;
        } else {
            this.energyPoints += energyPoints;
        }
    }
}
