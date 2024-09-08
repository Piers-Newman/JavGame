package JavGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import winston.RectHandler.Rect;
import winston.UIComponents.Button;
import winston.UIComponents.Label;

public class JavGame {

    //JavGame Version:1.0.0

    // =====================
    // Image Loading Methods
    // =====================
    public static BufferedImage loadImage(String path) {
        return ImageLoader.loadImage(path);
    }

    // =====================
    // Sound Handling Methods
    // =====================
    public static Clip loadSound(String path) {
        return SoundLoader.loadSound(path);
    }

    public static void playSound(Clip clip) {
        SoundPlayer.playSound(clip);
    }

    public static void playSoundLoop(Clip clip, int loopCount) {
        SoundPlayer.playSoundLoop(clip, loopCount);
    }

    public static void stopSound(Clip clip) {
        SoundPlayer.stopSound(clip);
    }

    public static void pauseSound(Clip clip) {
        SoundPlayer.pauseSound(clip);
    }

    public static void resumeSound(Clip clip) {
        SoundPlayer.resumeSound(clip);
    }

    // ===========================
    // Window Management Methods
    // ===========================
    public static JFrame createWindow(String title, int width, int height) {
        return WindowManager.createWindow(title, width, height);
    }

    public static void setWindowSize(JFrame frame, int width, int height) {
        WindowManager.setWindowSize(frame, width, height);
    }

    public static void setWindowTitle(JFrame frame, String title) {
        WindowManager.setWindowTitle(frame, title);
    }

    public static void setWindowVisibility(JFrame frame, boolean isVisible) {
        WindowManager.setWindowVisibility(frame, isVisible);
    }

    public static void setWindowResizable(JFrame frame, boolean isResizable) {
        WindowManager.setWindowResizable(frame, isResizable);
    }

    public static void setFullScreen(JFrame frame, boolean isFullScreen) {
        WindowManager.setFullScreen(frame, isFullScreen);
    }

    public static void centerWindow(JFrame frame) {
        WindowManager.centerWindow(frame);
    }

    // ===========================
    // Rect Handling Methods
    // ===========================
    public static Rect createRect(int x, int y, int width, int height) {
        return new Rect(x, y, width, height);
    }

    public static boolean areRectsColliding(Rect r1, Rect r2) {
        return RectHandler.areRectsColliding(r1, r2);
    }

    public static boolean isPointInRect(Rect rect, int px, int py) {
        return RectHandler.isPointInRect(rect, px, py);
    }

    // ===========================
    // Font Handling Methods
    // ===========================
    public static Font createFont(String filePath, float size) {
        return FontHandler.createFontFromFile(filePath, size);
    }

    public static Font resizeFont(Font font, float newSize) {
        return FontHandler.resizeFont(font, newSize);
    }

    public static Font changeFontStyle(Font font, int style) {
        return FontHandler.changeFontStyle(font, style);
    }

    public static String[] getAvailableFonts() {
        return FontHandler.getAvailableFonts();
    }

    // ===========================
    // UI Components Methods
    // ===========================
    public static Button createButton(int x, int y, int width, int height, String text, Font font) {
        return new Button(x, y, width, height, text, font);
    }

    public static Label createLabel(int x, int y, String text, Font font) {
        return new Label(x, y, text, font);
    }

    public static void drawButton(Graphics g, Button button) {
        button.draw(g);
    }

    public static void drawLabel(Graphics g, Label label) {
        label.draw(g);
    }

    // ===========================
    // Input Handling Methods
    // ===========================
    public static InputHandler initializeInputHandler(JFrame frame) {
        return new InputHandler(frame);
    }

    public static boolean isKeyPressed(InputHandler handler, int keyCode) {
        return handler.isKeyPressed(keyCode);
    }

    public static int getMouseX(InputHandler handler) {
        return handler.getMouseX();
    }

    public static int getMouseY(InputHandler handler) {
        return handler.getMouseY();
    }

    public static boolean isMousePressed(InputHandler handler) {
        return handler.isMousePressed();
    }
    
 // =====================
    // Drawing Methods
    // =====================
    public static void drawString(Graphics g, String text, int x, int y, Font font, Color color) {
        DrawHandler.drawString(g, text, x, y, font, color);
    }

    public static void drawLine(Graphics g, int x1, int y1, int x2, int y2, Color color) {
        DrawHandler.drawLine(g, x1, y1, x2, y2, color);
    }

    public static void drawOval(Graphics g, int x, int y, int width, int height, Color color) {
        DrawHandler.drawOval(g, x, y, width, height, color);
    }

    public static void drawRect(Graphics g, int x, int y, int width, int height, Color color) {
        DrawHandler.drawRect(g, x, y, width, height, color);
    }

    public static void fillRect(Graphics g, int x, int y, int width, int height, Color color) {
        DrawHandler.fillRect(g, x, y, width, height, color);
    }

    public static void drawImage(Graphics g, Image img, int x, int y) {
        DrawHandler.drawImage(g, img, x, y);
    }

    public static void drawImage(Graphics g, Image img, int x, int y, int width, int height) {
        DrawHandler.drawImage(g, img, x, y, width, height);
    }

    public static void drawRect(Graphics g, Rect rect, Color color) {
        DrawHandler.drawRect(g, rect, color);
    }

    public static void fillRect(Graphics g, Rect rect, Color color) {
        DrawHandler.fillRect(g, rect, color);
    }

    public static void drawCenteredString(Graphics g, String text, int x, int y, Font font, Color color) {
        DrawHandler.drawCenteredString(g, text, x, y, font, color);
    }

    public static void drawOutlinedRect(Graphics g, Rect rect, Color fillColor, Color outlineColor, int outlineThickness) {
        DrawHandler.drawOutlinedRect(g, rect, fillColor, outlineColor, outlineThickness);
    }

    public static void drawCircle(Graphics g, int centerX, int centerY, int radius, Color color) {
        DrawHandler.drawCircle(g, centerX, centerY, radius, color);
    }

    public static void fillCircle(Graphics g, int centerX, int centerY, int radius, Color color) {
        DrawHandler.fillCircle(g, centerX, centerY, radius, color);
    }
}
