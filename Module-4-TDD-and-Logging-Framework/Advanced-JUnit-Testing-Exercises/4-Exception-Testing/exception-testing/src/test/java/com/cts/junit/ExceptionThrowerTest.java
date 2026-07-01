package com.cts.junit;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionThrowerTest {

    ExceptionThrower exceptionThrower = new ExceptionThrower();

    @Test
    void testThrowException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> exceptionThrower.throwException()
        );
    }
}