// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.box;

public class RectangleBox extends AbstractBox {
    private final double length;
    private final double width;

    public RectangleBox(double height, double length, double width) {
        super(height);

        if (length <= 0) {
            throw new IllegalArgumentException("length must be positive");
        }

        if (width <= 0) {
            throw new IllegalArgumentException("width must be positive");
        }

        this.length = length;
        this.width = width;
    }

    @Override
    public double getTopArea() {
        return length * width;
    }
}
