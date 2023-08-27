// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.box;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class RectangleBoxTest {
    @Test
    public void getTopArea_ReturnsArea() {
        final double height = 3;
        final double length = 4;
        final double width = 5;
        RectangleBox box = new RectangleBox(height, length, width);

        double actual = box.getTopArea();

        assertEquals(length * width, actual, 0.0001);
    }

    @Test
    public void getVolume_ReturnsVolume() {
        final double height = 3;
        final double length = 4;
        final double width = 5;
        RectangleBox box = new RectangleBox(height, length, width);

        double actual = box.getVolume();

        assertEquals(height * length * width, actual, 0.0001);
    }

    @Test
    public void RectangleBox_ZeroHeight_ThrowsException() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            new RectangleBox(0, 1, 1);
        });

        assertEquals("height must be positive", exception.getMessage());
    }

    @Test
    public void RectangleBox_ZeroLength_ThrowsException() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            new RectangleBox(1, 0, 1);
        });

        assertEquals("length must be positive", exception.getMessage());
    }

    @Test
    public void RectangleBox_ZeroWidth_ThrowsException() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            new RectangleBox(1, 1, 0);
        });

        assertEquals("width must be positive", exception.getMessage());
    }
}
