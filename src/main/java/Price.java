public class Price {

    private final double price;

    private Price(double price) {
        this.price = price;
    }

    public static Price of(double price) {
        return new Price(price);
    }

    public double getValue() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price price1 = (Price) o;

        return Double.compare(price1.price, price) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(price);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Price{" +
                "value=" + price +
                '}';
    }
}
