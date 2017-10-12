import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CashRegisterTest {

    @Test
    public void should_calculate_total(){
        // GIVER
        CashRegister cashRegister = new CashRegister();
        double quantity = 1;
        // WHEN
        Price price = Price.of(1.20);
        Price total = cashRegister.total(price, quantity);
        // THEN
        Assertions.assertThat(total).isEqualTo(Price.of(1.20));
    }
}
