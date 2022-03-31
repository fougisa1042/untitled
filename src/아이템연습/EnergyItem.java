package 아이템연습;

public class EnergyItem extends Item implements Consumable{
    private int energyPoints;

    public EnergyItem(String name, String category, int price, int energyPoints) {
        super(name, category, price);
        this.energyPoints = energyPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void unfoldEffect(Character character) {
        character.EnergyUpPoints(energyPoints);
    }
}
