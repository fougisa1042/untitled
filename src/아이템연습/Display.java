package 아이템연습;

public class Display {
    public static void healthState(Character character) {
        System.out.println("health points: " + character.getHealthPoints() + " / " + character.getHealthPointsMax());
    }

    public static void energyState(Character character) {
        System.out.println("energy points: " + character.getEnergyPoints() + " / " + character.getEnergyPointsMax());
    }

    public static void healthEnergyState(Character character) {
        healthState(character);
        energyState(character);
    }

    public static void ItemInfor(Item item) {
        System.out.println("name: " + item.getName());
        System.out.println("category: " + item.getCategory());
        System.out.println("price: " + item.getPrice());
    }

    public static void details(HealthItem item) {
        ItemInfor(item);
        System.out.println("health bonus: " + item.getHealthPoints());
    }

    public static void details(EnergyItem item) {
        ItemInfor(item);
        System.out.println("energy bonus: " + item.getEnergyPoints());
    }
}
