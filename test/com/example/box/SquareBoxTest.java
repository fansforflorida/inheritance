// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.box;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class SquareBoxTest {
    @Test
    public void getTopArea_ReturnsArea() {
        final double height = 3;
        final double side = 4;
        SquareBox box = new SquareBox(height, side);

        double actual = box.getTopArea();

        assertEquals(side * side, actual, 0.0001);
    }

    @Test
    public void getVolume_ReturnsVolume() {
        final double height = 3;
        final double side = 4;
        SquareBox box = new SquareBox(height, side);

        double actual = box.getVolume();

        assertEquals(height * side * side, actual, 0.0001);
    }

    @Test
    public void SquareBox_ZeroHeight_ThrowsException() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            new SquareBox(0, 1);
        });

        assertEquals("height must be positive", exception.getMessage());
    }

    @Test
    public void SquareBox_ZeroSide_ThrowsException() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            new SquareBox(1, 0);
        });

        assertEquals("length must be positive", exception.getMessage());
    }
}
