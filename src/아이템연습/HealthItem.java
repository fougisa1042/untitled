package 아이템연습;

public class HealthItem extends Item implements Consumable {
    private int healthPoints;

    public HealthItem(String name, String category, int price, int healthPoints) {
        super(name, category, price);
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void unfoldEffect(Character character) {
        character.HealthUpPoints(healthPoints);
    }
}
