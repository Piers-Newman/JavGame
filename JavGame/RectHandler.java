package JavGame;

public class RectHandler {

    // A simple Rect class to represent a rectangle with x, y, width, and height
    public static class Rect {
        public int x, y, width, height;

        public Rect(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }
    }

    // Function to check if two rectangles are colliding
    public static boolean areRectsColliding(Rect r1, Rect r2) {
        return r1.x < r2.x + r2.width &&
               r1.x + r1.width > r2.x &&
               r1.y < r2.y + r2.height &&
               r1.y + r1.height > r2.y;
    }

    // Function to check if a point (px, py) is inside a rectangle
    public static boolean isPointInRect(Rect rect, int px, int py) {
        return px >= rect.x && px <= rect.x + rect.width &&
               py >= rect.y && py <= rect.y + rect.height;
    }
}
