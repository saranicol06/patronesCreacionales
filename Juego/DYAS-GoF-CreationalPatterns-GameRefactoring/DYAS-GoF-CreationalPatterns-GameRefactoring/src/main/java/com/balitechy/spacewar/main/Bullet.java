package com.balitechy.spacewar.main;

import java.awt.Graphics;

public interface Bullet {
    void tick();
    void render(Graphics g);
    double getY();
    double getX();
    int getWidth();
    int getHeight();
}