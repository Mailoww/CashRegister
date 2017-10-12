import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CashRegisterTest {

    @Test
    public void should_calculate_total(){
        // GIVER
        CashRegister cashRegister = new CashRegister();
        Price price = Price.valueOf(1.20);
        Quantity quantity = Quantity.valueOf(1);
        // WHEN
        Price total = cashRegister.total(price, quantity);
        // THEN
        Assertions.assertThat(total).isEqualTo(Price.valueOf(1.20));
    }
}
