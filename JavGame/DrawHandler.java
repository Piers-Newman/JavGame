package JavGame;

import JavGame.RectHandler.Rect;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class DrawHandler {

    // ======================
    // Basic Drawing Functions
    // ======================

    public static void drawString(Graphics g, String text, int x, int y, Font font, Color color) {
        g.setFont(font);
        g.setColor(color);
        g.drawString(text, x, y);
    }

    public static void drawLine(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
    }

    public static void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.drawOval(x, y, width, height);
    }

    public static void drawRect(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.drawRect(x, y, width, height);
    }

    public static void fillRect(Graphics g, int x, int y, int width, int height, Color color) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    public static void drawImage(Graphics g, Image img, int x, int y) {
        g.drawImage(img, x, y, null);
    }

    public static void drawImage(Graphics g, Image img, int x, int y, int width, int height) {
        g.drawImage(img, x, y, width, height, null);
    }

    // ======================
    // Specialized Drawing Functions
    // ======================

    public static void drawRect(Graphics g, Rect rect, Color color) {
        g.setColor(color);
        g.drawRect(rect.x, rect.y, rect.width, rect.height);
    }

    public static void fillRect(Graphics g, Rect rect, Color color) {
        g.setColor(color);
        g.fillRect(rect.x, rect.y, rect.width, rect.height);
    }

    public static void drawCenteredString(Graphics g, String text, int x, int y, Font font, Color color) {
        g.setFont(font);
        g.setColor(color);
        int textWidth = g.getFontMetrics().stringWidth(text);
        int textHeight = g.getFontMetrics().getHeight();
        g.drawString(text, x - textWidth / 2, y + textHeight / 4);
    }

    public static void drawOutlinedRect(Graphics g, Rect rect, Color fillColor, Color outlineColor, int outlineThickness) {
        g.setColor(fillColor);
        g.fillRect(rect.x, rect.y, rect.width, rect.height);
        g.setColor(outlineColor);
        for (int i = 0; i < outlineThickness; i++) {
            g.drawRect(rect.x + i, rect.y + i, rect.width - 2 * i, rect.height - 2 * i);
        }
    }

    public static void drawCircle(Graphics g, int centerX, int centerY, int radius, Color color) {
        g.setColor(color);
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }

    public static void fillCircle(Graphics g, int centerX, int centerY, int radius, Color color) {
        g.setColor(color);
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }
}
