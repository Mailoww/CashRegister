import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class PriceQuery {

    private Collection<ItemReference> itemReferences;

    public PriceQuery(ItemReference... itemReferences) {
        this.itemReferences = Arrays.asList(itemReferences);
    }

    public Price findPrice(String itemCode) {
        final ItemReference itemReferenceResult = itemReferences.stream()
                .filter(itemReference -> itemReference.hasItemCode(itemCode))
                .reduce((a, b) -> {
                    throw new IllegalStateException("Multiple elements: " + a + ", " + b);
                })
                .get();
        return itemReferenceResult.getPrice();
    }
}
