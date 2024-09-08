package JavGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class UIComponents {

    // Button class
    public static class Button {
        private int x, y, width, height;
        private String text;
        private Font font;
        private Color backgroundColor;
        private Color textColor;
        private boolean isHovered;
        private ButtonClickListener clickListener;

        public Button(int x, int y, int width, int height, String text, Font font) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.text = text;
            this.font = font;
            this.backgroundColor = Color.GRAY;
            this.textColor = Color.WHITE;
            this.isHovered = false;
        }

        public void setClickListener(ButtonClickListener clickListener) {
            this.clickListener = clickListener;
        }

        public void setHovered(boolean isHovered) {
            this.isHovered = isHovered;
        }

        public void draw(Graphics g) {
            g.setColor(isHovered ? backgroundColor.brighter() : backgroundColor);
            g.fillRect(x, y, width, height);
            g.setColor(textColor);
            g.setFont(font);
            g.drawString(text, x + (width - g.getFontMetrics().stringWidth(text)) / 2, 
                         y + (height + g.getFontMetrics().getAscent()) / 2 - 5);
        }

        public void handleMouseClick(int mouseX, int mouseY) {
            if (isMouseOver(mouseX, mouseY)) {
                if (clickListener != null) {
                    clickListener.onClick();
                }
            }
        }

        public boolean isMouseOver(int mouseX, int mouseY) {
            return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
        }

        public interface ButtonClickListener {
            void onClick();
        }
    }

    // Label class
    public static class Label {
        private int x, y;
        private String text;
        private Font font;
        private Color color;

        public Label(int x, int y, String text, Font font) {
            this.x = x;
            this.y = y;
            this.text = text;
            this.font = font;
            this.color = Color.BLACK;
        }

        public void draw(Graphics g) {
            g.setColor(color);
            g.setFont(font);
            g.drawString(text, x, y);
        }
    }
}
