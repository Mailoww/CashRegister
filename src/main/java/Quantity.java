public class Quantity {

    private final double value;

    private Quantity(double quantity) {
        this.value = quantity;
    }

    public static Quantity valueOf() {
        return new Quantity((double) 1);
    }

    double multiplyBy(double price){
        return value * price;
    }
}
