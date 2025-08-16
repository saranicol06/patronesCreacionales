package com.balitechy.spacewar.main;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class ColorfulVectorBackgroundRenderer implements BackgroundRenderer {
    private int[] starsX, starsY;
    private Color[] starColors;

    public ColorfulVectorBackgroundRenderer() {
        Random rand = new Random();
        starsX = new int[100];
        starsY = new int[100];
        starColors = new Color[100];
        Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.MAGENTA};
        for (int i = 0; i < 100; i++) {
            starsX[i] = rand.nextInt(Game.WIDTH * Game.SCALE);
            starsY[i] = rand.nextInt(Game.HEIGHT * Game.SCALE);
            starColors[i] = colors[rand.nextInt(colors.length)];
        }
    }

    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, c.getWidth(), c.getHeight());
        for (int i = 0; i < 100; i++) {
            g.setColor(starColors[i]);
            g.fillOval(starsX[i], starsY[i], 2, 2);
        }
    }
}