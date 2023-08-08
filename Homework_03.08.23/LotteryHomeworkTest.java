package lotteryPavel;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryHomeworkTest {
    int[] testArr;

    @Test
    void initializeWinningNumbers_test() {
        testArr = LotteryHomework.initializeWinningNumbers();
        assertEquals(5, testArr.length);
    }

    @Test
    public void testIsThisNumberPresentInArray_NumberPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int targetNumber = 3;

        boolean result = LotteryHomework.isThisNumberPresentInArray(targetNumber, array);

        assertTrue(result);
    }

    @Test
    public void testIsThisNumberPresentInArray_NumberNotPresent() {
        int[] array = {1, 2, 3, 4, 5};
        int targetNumber = 6;

        boolean result = LotteryHomework.isThisNumberPresentInArray(targetNumber, array);

        assertFalse(result);
    }

    @Test
    public void testIsThisNumberPresentInArray_EmptyArray() {
        int[] array = {};
        int targetNumber = 3;

        boolean result = LotteryHomework.isThisNumberPresentInArray(targetNumber, array);

        assertFalse(result);
    }
}

