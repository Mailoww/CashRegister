import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CashRegisterTest {

    private static final String APPLE_CODE = "APPLE";
    private static final String BANANA_CODE = "BANANA";

    @Test
    public void should_calculate_total(){
        // GIVER
        CashRegister cashRegister = new CashRegister();
        Price price = Price.valueOf(1.20);
        Quantity quantity = Quantity.valueOf();
        // WHEN
        Price total = cashRegister.total(price, quantity);
        // THEN
        assertThat(total).isEqualTo(Price.valueOf(1.20));
    }

    private final PriceQuery priceQuery = new PriceQuery(
            ItemReference.anItemReference().withItemCode(APPLE_CODE)
                    .withUnitPrice(Price.valueOf(1.20)).build(),
            ItemReference.anItemReference().withItemCode(BANANA_CODE)
                    .withUnitPrice(Price.valueOf(1.90)).build());

    @Parameters({"APPLE, 1.20", "BANANA, 1.90"})
    @Test
    public void should_find_the_price_given_an_item_code(String itemCode, double unitPrice){
        assertThat(priceQuery.findPrice(itemCode)).isEqualTo(Price.valueOf(unitPrice));
    }
}
