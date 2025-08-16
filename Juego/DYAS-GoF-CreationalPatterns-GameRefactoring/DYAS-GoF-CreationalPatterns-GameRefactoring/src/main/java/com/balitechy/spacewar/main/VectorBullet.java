package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorBullet implements Bullet {
    private double x;
    private double y;

    public VectorBullet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getWidth() {
        return 11;
    }

    @Override
    public int getHeight() {
        return 21;
    }

    @Override
    public void tick() {
        y -= 5;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine((int) x, (int) y, (int) x, (int) y - 10);
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public double getX() {
        return x;
    }
}