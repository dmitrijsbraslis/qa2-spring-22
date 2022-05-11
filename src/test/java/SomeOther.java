import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SomeOther {
    @Test
    public void someOtherMethod() {
        BigDecimal d = new BigDecimal("10.73");
        BigDecimal f = d.setScale(1, RoundingMode.UP);

        System.out.println(f);
    }
}
