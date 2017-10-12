public class Price {

    private final double value;

    private Price(double price) {
        this.value = price;
    }

    public static Price valueOf(double price) {
        return new Price(price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price1 = (Price) o;

        return Double.compare(price1.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + value +
                '}';
    }

    public Price multiplyBy(double quantity) {
        return Price.valueOf(value * quantity);
    }
}
