public class ItemReference {

    private final Price price;
    private final Quantity quantity;
    private final String code;

    private ItemReference(Price price, Quantity quantity, String code) {
        this.price = price;
        this.quantity = quantity;
        this.code = code;
    }

    public static ItemReferenceBuilder anItemReference() {
        return new ItemReferenceBuilder();
    }

    public boolean hasItemCode(String itemCode) {
        return this.code.equals(itemCode);
    }

    public Price getPrice() {
        return price;
    }

    @Override
    public String
    toString() {
        return "ItemReference{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", code='" + code + '\'' +
                '}';
    }

    public static final class ItemReferenceBuilder {

        private Price unitPrice;
        private Quantity quantity;
        private String code;

        private ItemReferenceBuilder() {
        }

        public ItemReferenceBuilder withUnitPrice(Price price) {
            this.unitPrice = price;
            return this;
        }

        public ItemReferenceBuilder withQuantity(Quantity quantity) {
            this.quantity = quantity;
            return this;
        }

        public ItemReferenceBuilder withItemCode(String code) {
            this.code = code;
            return this;
        }

        public ItemReference build() {
            return new ItemReference(unitPrice, quantity, code);
        }
    }
}
