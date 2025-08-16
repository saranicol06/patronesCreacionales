package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpriteBullet implements Bullet {
    private double x;
    private double y;
    private BufferedImage image;

    public SpriteBullet(double x, double y, SpritesImageLoader sprites) {
        this.x = x;
        this.y = y;
        image = sprites.getImage(35, 52, getWidth(), getHeight());
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
        g.drawImage(image, (int) x, (int) y, null);
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