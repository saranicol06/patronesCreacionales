package com.balitechy.spacewar.main;

public abstract class GameFactory {
    public abstract Player createPlayer(Game game);
    public abstract Bullet createBullet(double x, double y, Game game);
    public abstract BackgroundRenderer createBackgroundRenderer();
}