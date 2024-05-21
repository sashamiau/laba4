package com.sashamiau;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaseTest {

    @Test
    public void test() {
        String expected = "случайное имя проверять надо ээээээээээ страх кротов";
        TestCase testCase = new TestCase(expected);
        assertEquals(expected, testCase.getName());
    }

}
