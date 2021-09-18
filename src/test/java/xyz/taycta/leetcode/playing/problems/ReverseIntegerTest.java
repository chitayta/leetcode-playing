package xyz.taycta.leetcode.playing.problems;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ReverseIntegerTest {

    ReverseInteger reverseInteger = new ReverseInteger();

    @ParameterizedTest
    @MethodSource("getReverseIntegerSources")
    void should_revert_integer(int input, int output) {
        assertThat(reverseInteger.reverse(input)).isEqualTo(output);
        assertThat(reverseInteger.reverseWithJavaStringBuilder(input)).isEqualTo(output);
        assertThat(reverseInteger.reverseWithSolution(input)).isEqualTo(output);
    }

    public static Stream<Arguments> getReverseIntegerSources() {
        return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(0, 0),
                Arguments.of(1534236469, 0),
                Arguments.of(-2147483648, 0)
        );
    }
}
