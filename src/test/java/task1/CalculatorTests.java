package task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTests {
    private static Calculator calculator;
    private static int[] array;

    @BeforeAll
    public void init() {
        calculator = new Calculator();
        array = new int[]{3, 5, 8, 9, 8};
    }

    @Test
    public void testCalcArrayLength() {
        int expected = 5;

        int actual = calculator.calcArrayLength(array);

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("source1")
    public void testFindFirstOccurrenceIndex(int[] array, int el, int expected) {
        int actual = calculator.findFirstOccurrenceIndex(array, el);

        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> source1() {
        return Stream.of(Arguments.of(array, 8, 2), Arguments.of(array, 4, -1));
    }

    @ParameterizedTest
    @MethodSource("source2")
    public void testElementExistsInArray(int[] array, int el, boolean expected) {
        boolean actual = calculator.elementExistsInArray(array, el);

        Assertions.assertEquals(expected, actual);
    }

    public static Stream<Arguments> source2() {
        return Stream.of(Arguments.of(array, 9, true), Arguments.of(array, 0, false));
    }
}
