package JavGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class ImageLoader {

    // Logger for logging image loading errors
    private static final Logger LOGGER = Logger.getLogger(ImageLoader.class.getName());

    // Load an image from a file
    public static BufferedImage loadImage(String filePath) {
        try {
            return ImageIO.read(new File(filePath));
        } catch (IOException | IllegalArgumentException e) {
            LOGGER.log(Level.SEVERE, "Failed to load image: " + filePath, e);
            return null; // Return null if loading fails
        }
    }

    // Save an image to a file
    public static boolean saveImage(BufferedImage image, String format, String filePath) {
        try {
            return ImageIO.write(image, format, new File(filePath));
        } catch (IOException | IllegalArgumentException e) {
            LOGGER.log(Level.SEVERE, "Failed to save image: " + filePath, e);
            return false; // Return false if saving fails
        }
    }
}
