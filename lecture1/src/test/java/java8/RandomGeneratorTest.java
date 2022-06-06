package java8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;



public class RandomGeneratorTest {
    RandomGenerator ranGen;
    int n;

    @BeforeEach
    public void setup() {
        ranGen = new RandomGenerator();
        n = 100;
    }

    @Test
    public void testIllegalArgumentException() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> ranGen.generate(-5));
    }

    @Test
    public void isValidRange() {
        int max = 10;
        int num = ranGen.generate(max);
        Assertions.assertTrue((num > 0) && (num < max));
    }

//    @Test
//    public void isRandom() {
//        Assertions.assertTrue(Arrays.stream(ranGen.numbers(ranGen)).allMatch(value -> (value > 900)&&(value<1100)));
//
//    }

}
