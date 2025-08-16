package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class VectorBackgroundRenderer implements BackgroundRenderer {
    private int[] starsX, starsY;
    private java.awt.Canvas canvas;

    public VectorBackgroundRenderer() {
        canvas = null; // No necesita canvas para inicializar, solo para render.
        Random rand = new Random();
        starsX = new int[100];
        starsY = new int[100];
        for (int i = 0; i < 100; i++) {
            starsX[i] = rand.nextInt(Game.WIDTH * Game.SCALE);
            starsY[i] = rand.nextInt(Game.HEIGHT * Game.SCALE);
        }
    }

    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        g.setColor(Color.WHITE);
        for (int i = 0; i < 100; i++) {
            g.fillOval(starsX[i], starsY[i], 2, 2);
        }
    }
}