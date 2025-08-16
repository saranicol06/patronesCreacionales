package com.balitechy.spacewar.main;

import java.io.IOException;

public class SpriteGameFactory extends GameFactory {
    private SpritesImageLoader sprites;
    private SpritesImageLoader bgLoader;

    public SpriteGameFactory() {
        sprites = new SpritesImageLoader("/sprites.png");
        bgLoader= new SpritesImageLoader("/bg.png");
        try {
            sprites.loadImage();
            bgLoader.loadImage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
// En SpriteGameFactory.createPlayer(...)
    public Player createPlayer(Game game) {
        double initialX = (Game.WIDTH * Game.SCALE - 56) / 2;  // Usa 56 en lugar de SpritePlayer.WIDTH
        double initialY = Game.HEIGHT * Game.SCALE - 50;
        return new SpritePlayer(initialX, initialY, game, sprites);
    }
    @Override
    public Bullet createBullet(double x, double y, Game game) {
        return new SpriteBullet(x, y, sprites);
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new SpriteBackgroundRenderer();
    }
}