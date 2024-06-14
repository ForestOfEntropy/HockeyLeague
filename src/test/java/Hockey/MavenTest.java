package Hockey;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MavenTest
{
    int a = 7;
    int b = 8;
    Club hc1 = new Club("EC Höaey");

    @Test
    void checkNumberInRange()
    {
        Assertions.assertThat(a).isBetween(0, 10);
        Assertions.assertThat(b).isBetween(0, 10);
    }
    @Test
    void checkName()
    {
        Assertions.assertThat(hc1.getName()).startsWith("EC");
    }
    @Test
    void checkStrength()
    {
        Assertions.assertThat(hc1.getStrength()).isGreaterThan(0);
    }
    @Test
    void checkContent()
    {
    }
}
