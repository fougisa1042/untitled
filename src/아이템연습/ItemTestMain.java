package 아이템연습;

public class ItemTestMain {
    public static void main(String[] args) {
        // Create Items
        HealthItem bred = new HealthItem("빵", "음식", 0, 20);
        EnergyItem manaPotion = new EnergyItem("마나 포션", "포션", 0, 50);

        // create character
        Character klaus = new Character("인간", "정명수", 5, 100, 20, 50);
        System.out.println("[" + klaus.getName() + "]의 상태 창");
        Display.healthEnergyState(klaus);
        System.out.println();

        // Let the character consume items
        System.out.println("The Character consumes: ");
        Display.details(bred);
        bred.unfoldEffect(klaus);
        Display.healthEnergyState(klaus);
        System.out.println();

        System.out.println("The Character consumes: ");
        Display.details(manaPotion);
        manaPotion.unfoldEffect(klaus);
        Display.healthEnergyState(klaus);
    }
}
