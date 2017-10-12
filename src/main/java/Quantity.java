public class Quantity {

    private final double value;

    private Quantity(double quantity) {
        this.value = quantity;
    }

    public static Quantity valueOf(double quantity) {
        return new Quantity(quantity);
    }

    double multiplyBy(double price){
        return value * price;
    }
}
