package xyz.taycta.leetcode.playing.problems.medium;

import xyz.taycta.leetcode.playing.definition.ListNode;

/**
 * https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {

    /**
     * <ul>
     * <li>Runtime: 1ms <b>faster than 100.00% of Java online submissions for Add Two Numbers.</b></li>
     * <li>Memory usage: 39.2 MB</li>
     * </ul>
     *
     * @param l1 list node 1
     * @param l2 list node 2
     * @return list result
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return createFrom(l1, l2, false);
    }

    private ListNode createFrom(ListNode curr1, ListNode curr2, boolean hasCarry) {
        if (curr1 == null && curr2 == null) {
            return hasCarry ? new ListNode(1) : null;
        } else if (curr1 != null && curr2 != null) {
            int sum = curr1.getVal() + curr2.getVal() + (hasCarry ? 1 : 0);
            return sum >= 10 ? new ListNode(sum % 10, createFrom(curr1.getNext(), curr2.getNext(), true))
                    : new ListNode(sum, createFrom(curr1.getNext(), curr2.getNext(), false));
        } else if (curr1 == null) {
            int sum = curr2.getVal() + (hasCarry ? 1 : 0);
            return sum >= 10 ? new ListNode(sum % 10, createFrom(null, curr2.getNext(), true))
                    : new ListNode(sum, createFrom(null, curr2.getNext(), false));
        } else {
            int sum = curr1.getVal() + (hasCarry ? 1 : 0);
            return sum >= 10 ? new ListNode(sum % 10, createFrom(null, curr1.getNext(), true))
                    : new ListNode(sum, createFrom(null, curr1.getNext(), false));
        }
    }

    /**
     * SOLUTION
     * <p>
     * Keep track of the carry using a variable and simulate digits-by-digits sum starting from the head of list,
     * which contains the least-significant digit.
     *
     * @param l1 list node 1
     * @param l2 list node 2
     * @return list result
     */
    public ListNode addTwoNumbersWithSolution(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.getVal() : 0;
            int y = (q != null) ? q.getVal() : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.setNext(new ListNode(sum % 10));
            curr = curr.getNext();
            if (p != null) p = p.getNext();
            if (q != null) q = q.getNext();
        }
        if (carry > 0) {
            curr.setNext(new ListNode(carry));
        }
        return dummyHead.getNext();
    }
}
