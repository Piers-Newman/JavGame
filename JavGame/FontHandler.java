package JavGame;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FontHandler {

    // Logger for logging any issues with font loading
    private static final Logger LOGGER = Logger.getLogger(FontHandler.class.getName());

    // Load a font from a file and return it with the specified size
    public static Font createFontFromFile(String filePath, float size) {
        try {
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filePath)).deriveFont(size);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(font);
            return font;
        } catch (FontFormatException | IOException e) {
            LOGGER.log(Level.SEVERE, "Failed to load font: " + filePath, e);
            return new Font("SansSerif", Font.PLAIN, (int) size); // Default fallback font
        }
    }

    // Resize an existing font to a new size
    public static Font resizeFont(Font font, float newSize) {
        return font.deriveFont(newSize);
    }

    // Change the style of a font (e.g., plain, bold, italic)
    public static Font changeFontStyle(Font font, int style) {
        return font.deriveFont(style, font.getSize2D());
    }

    // Get the list of all available fonts in the system
    public static String[] getAvailableFonts() {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        return ge.getAvailableFontFamilyNames();
    }
}
