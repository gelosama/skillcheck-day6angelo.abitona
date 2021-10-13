public class Item {
        private int index;
        private String name;
        private double price;
        private int Qty;

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public Item(int index, String name, double price) {
        this.index = index;
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return this.price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getIndex() {
            return this.index;
        }

        public void setIndex(int index)  {
            this.index = index;
        }

        public String toString() {
            return "[" + this.index + "]\t" + this.name + "\t\t" + this.price + "\n";
        }
    }


