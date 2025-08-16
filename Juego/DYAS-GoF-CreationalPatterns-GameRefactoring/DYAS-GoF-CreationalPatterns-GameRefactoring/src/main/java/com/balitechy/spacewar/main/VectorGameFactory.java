package com.balitechy.spacewar.main;

public class VectorGameFactory extends GameFactory {
    @Override
    public Player createPlayer(Game game) {
        double initialX = (Game.WIDTH * Game.SCALE - 56) / 2;
        double initialY = Game.HEIGHT * Game.SCALE - 50;
        return new VectorPlayer(initialX, initialY, game);
    }

    @Override
    public Bullet createBullet(double x, double y, Game game) {
        return new VectorBullet(x, y);
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new VectorBackgroundRenderer();
    }
}