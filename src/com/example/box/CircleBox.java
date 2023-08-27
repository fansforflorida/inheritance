// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.box;

public class CircleBox extends AbstractBox {
    private final double radius;

    public CircleBox(double height, double radius) {
        super(height);

        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive");
        }

        this.radius = radius;
    }

    @Override
    public double getTopArea() {
        return Math.PI * radius * radius;
    }
}
