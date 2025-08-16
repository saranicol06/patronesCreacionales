package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorPlayer implements Player {
    private double x;
    private double y;
    private double velX;
    private double velY;
    private Game game;

    public ColorfulVectorPlayer(double x, double y, Game game) {
        this.x = x;
        this.y = y;
        this.game = game;
    }

    @Override
    public int getWidth() {
        return 56;
    }

    @Override
    public int getHeight() {
        return 28;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void setVelX(double velX) {
        this.velX = velX;
    }

    @Override
    public void setVelY(double velY) {
        this.velY = velY;
    }

    @Override
    public void shoot() {
        Bullet b = game.getFactory().createBullet(x + (getWidth() / 2) - 5, y - 18, game);
        game.getBullets().addBullet(b);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        if (x <= 0) x = 0;
        if (x >= (Game.WIDTH * Game.SCALE) - getWidth()) x = (Game.WIDTH * Game.SCALE) - getWidth();
        if (y <= 0) y = 0;
        if (y >= (Game.HEIGHT * Game.SCALE) - getHeight()) y = (Game.HEIGHT * Game.SCALE) - getHeight();
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        int[] xs = {(int) x + getWidth() / 2, (int) x, (int) x + getWidth()};
        int[] ys = {(int) y, (int) y + getHeight(), (int) y + getHeight()};
        g.fillPolygon(xs, ys, 3);
    }
}