// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.box;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CircleBoxTest {
    @Test
    public void CircleBox_ZeroHeight_ThrowsException() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            new CircleBox(0, 1);
        });

        assertEquals("height must be positive", exception.getMessage());
    }

    @Test
    public void CircleBox_ZeroRadius_ThrowsException() {
        final Exception exception = assertThrows(IllegalArgumentException.class, () ->
        {
            new CircleBox(1, 0);
        });

        assertEquals("radius must be positive", exception.getMessage());
    }

    @Test
    public void getHeight_ReturnsHeight() {
        final double height = 3;
        final double radius = 2;
        final CircleBox cylinder = new CircleBox(height, radius);

        final double actual = cylinder.getHeight();

        assertEquals(height, actual, 0.0001);
    }

    @Test
    public void getTopArea_ReturnsArea() {
        final double height = 3;
        final double radius = 2;
        final CircleBox box = new CircleBox(height, radius);

        final double actual = box.getTopArea();

        assertEquals(Math.PI * radius * radius, actual, 0.0001);
    }

    @Test
    public void getVolume_ReturnsVolume() {
        final double height = 3;
        final double radius = 2;
        final CircleBox box = new CircleBox(height, radius);

        final double actual = box.getVolume();

        assertEquals(Math.PI * radius * radius * height, actual, 0.0001);
    }
}
