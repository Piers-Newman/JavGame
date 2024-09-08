package JavGame;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class WindowManager {

    // Method to create a game window
    public static JFrame createWindow(String title, int width, int height) {
        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);  // Center the window
        frame.setVisible(true);
        return frame;
    }

    // Method to change the window size
    public static void setWindowSize(JFrame frame, int width, int height) {
        if (frame != null) {
            frame.setSize(width, height);
            frame.setLocationRelativeTo(null);  // Re-center the window
        }
    }

    // Method to change the window title
    public static void setWindowTitle(JFrame frame, String title) {
        if (frame != null) {
            frame.setTitle(title);
        }
    }

    // Method to toggle window visibility
    public static void setWindowVisibility(JFrame frame, boolean isVisible) {
        if (frame != null) {
            frame.setVisible(isVisible);
        }
    }

    // Method to set whether the window is resizable
    public static void setWindowResizable(JFrame frame, boolean isResizable) {
        if (frame != null) {
            frame.setResizable(isResizable);
        }
    }

    // Method to toggle fullscreen mode
    public static void setFullScreen(JFrame frame, boolean isFullScreen) {
        if (frame != null) {
            if (isFullScreen) {
                frame.dispose();  // Dispose of the frame to make changes
                frame.setUndecorated(true);  // Remove window borders
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);  // Maximize to full screen
                frame.setVisible(true);  // Show the frame again
            } else {
                frame.dispose();
                frame.setUndecorated(false);  // Restore window borders
                frame.setExtendedState(JFrame.NORMAL);  // Restore normal state
                frame.setVisible(true);
            }
        }
    }

    // Method to center the window on the screen
    public static void centerWindow(JFrame frame) {
        if (frame != null) {
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            int x = (screenSize.width - frame.getWidth()) / 2;
            int y = (screenSize.height - frame.getHeight()) / 2;
            frame.setLocation(x, y);
        }
    }
}
