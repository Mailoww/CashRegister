class CashRegister {

    public Price total(Price price, double quantity) {
        return Price.of(price.getValue() * quantity);
    }
}
