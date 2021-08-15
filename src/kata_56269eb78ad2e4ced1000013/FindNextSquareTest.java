package kata_56269eb78ad2e4ced1000013;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * You might know some pretty large perfect squares. But what about the NEXT one?
 * <p>
 * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
 * <p>
 * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
 * <p>
 * Examples:
 * <p>
 * findNextSquare(121) --> returns 144
 * <p>
 * findNextSquare(625) --> returns 676
 * <p>
 * findNextSquare(114) --> returns -1 since 114 is not a perfect square
 */
public class FindNextSquareTest {

    @Test
    public void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    public void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    public void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }

}