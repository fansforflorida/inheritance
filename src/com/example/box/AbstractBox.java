// Copyright 2023 John Hall
// SPDX-License-Identifier: MIT

package com.example.box;

public abstract class AbstractBox {
    private final double height;

    public AbstractBox(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("height must be positive");
        }

        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public abstract double getTopArea();

    public double getVolume() {
        return height * getTopArea();
    }
}
