package 아이템연습;

public class Item {

        protected String name;
        protected String category;
        protected int price;

    public Item(String name, String category, int price) {
            this.name = name;
            this.category = category;
            this.price = price;
        }

    public Item(String name, String category) {
            this(name, category, 0);
        }

        public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public int getPrice() {
            return price;
        }
}

