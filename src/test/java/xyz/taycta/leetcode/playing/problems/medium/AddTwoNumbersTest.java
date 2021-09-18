package xyz.taycta.leetcode.playing.problems.medium;

import org.junit.jupiter.api.Test;
import xyz.taycta.leetcode.playing.definition.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    void should_add_two_numbers_case_1() {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        assertThat(addTwoNumbers.addTwoNumbers(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(new ListNode(7, new ListNode(0, new ListNode(8, null))));

        assertThat(addTwoNumbers.addTwoNumbersWithSolution(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(new ListNode(7, new ListNode(0, new ListNode(8, null))));
    }

    @Test
    void should_add_two_numbers_case_2() {
        ListNode list1 = new ListNode(0, null);
        ListNode list2 = new ListNode(0, null);
        assertThat(addTwoNumbers.addTwoNumbers(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(new ListNode(0, null));
        assertThat(addTwoNumbers.addTwoNumbersWithSolution(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(new ListNode(0, null));
    }

    @Test
    void should_add_two_numbers_case_3() {
        ListNode list1 =
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9, null)))))));
        ListNode list2 =
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9, null))));

        ListNode expectedNode = new ListNode(8,
                new ListNode(9,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(0,
                                                new ListNode(0,
                                                        new ListNode(0,
                                                                new ListNode(1, null))))))));
        assertThat(addTwoNumbers.addTwoNumbers(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(expectedNode);
        assertThat(addTwoNumbers.addTwoNumbersWithSolution(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(expectedNode);
    }

    @Test
    void should_add_two_numbers_case_4() {
        ListNode list1 = new ListNode(9, null);
        ListNode list2 =
                new ListNode(1,
                        new ListNode(9,
                                new ListNode(9,
                                        new ListNode(9,
                                                new ListNode(9,
                                                        new ListNode(9,
                                                                new ListNode(9,
                                                                        new ListNode(9,
                                                                                new ListNode(9,
                                                                                        new ListNode(9, null))))))))));
        ListNode expectedNode = new ListNode(0,
                new ListNode(0,
                        new ListNode(0,
                                new ListNode(0,
                                        new ListNode(0,
                                                new ListNode(0,
                                                        new ListNode(0,
                                                                new ListNode(0,
                                                                        new ListNode(0,
                                                                                new ListNode(0,
                                                                                        new ListNode(1, null)))))))))));
        assertThat(addTwoNumbers.addTwoNumbers(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(
                        expectedNode);
        assertThat(addTwoNumbers.addTwoNumbersWithSolution(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(expectedNode);
    }

    @Test
    void should_add_two_numbers_case_5() {
        ListNode list1 =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(1,
                                                new ListNode(1,
                                                        new ListNode(1,
                                                                new ListNode(1,
                                                                        new ListNode(1,
                                                                                new ListNode(1,
                                                                                        new ListNode(1,
                                                                                                new ListNode(1, null)))))))))));
        ListNode list2 =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(1,
                                        new ListNode(1,
                                                new ListNode(1,
                                                        new ListNode(1,
                                                                new ListNode(1,
                                                                        new ListNode(1,
                                                                                new ListNode(1,
                                                                                        new ListNode(1,
                                                                                                new ListNode(1, null)))))))))));
        ListNode expectedNode = new ListNode(2,
                new ListNode(2,
                        new ListNode(2,
                                new ListNode(2,
                                        new ListNode(2,
                                                new ListNode(2,
                                                        new ListNode(2,
                                                                new ListNode(2,
                                                                        new ListNode(2,
                                                                                new ListNode(2,
                                                                                        new ListNode(2, null)))))))))));
        assertThat(addTwoNumbers.addTwoNumbers(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(expectedNode);
        assertThat(addTwoNumbers.addTwoNumbersWithSolution(list1, list2))
                .usingRecursiveComparison()
                .isEqualTo(expectedNode);
    }
}
