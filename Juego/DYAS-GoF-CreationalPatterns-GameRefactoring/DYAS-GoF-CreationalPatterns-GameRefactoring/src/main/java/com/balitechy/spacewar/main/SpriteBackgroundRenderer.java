package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteBackgroundRenderer implements BackgroundRenderer {
    private BufferedImage background;

    public SpriteBackgroundRenderer() {
        SpritesImageLoader bgLoader = new SpritesImageLoader("/bg.png");
        try {
            bgLoader.loadImage();
            background = bgLoader.getImage(0, 0, 640, 480);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, Canvas c) {
        if (background != null) {
            g.drawImage(background, 0, 0, c.getWidth(), c.getHeight(), c);
        }
    }
}