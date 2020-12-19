import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.images.Eyes;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class home_test_image {
    public static void main(String[] args) throws IOException {

        Eyes eyes = new Eyes();

        // Initialize the eyes SDK and set your private API key.
        eyes.setApiKey("8D29upwCe8JaIFYCRjf4iQfNeqflep8tT2O102RwAWdbs110");
        eyes.getSaveNewTests();
        eyes.setMatchLevel(MatchLevel.CONTENT);
        // Define the OS and hosting application to identify the baseline.
        eyes.setHostOS("Android");
        eyes.setHostApp("Nex2me");

        BufferedImage img;

        try {

            // Start the test with a viewport size of 800x600.
            eyes.open("Nex2me", "Explore Test", new RectangleSize(412, 797));

            // Load page image and validate.
            img = ImageIO.read(new File("C:\\Pallavi\\Home.png"));

            // Visual validation.
            eyes.checkImage(img, "Test Explore");

            // End visual UI testing.
            eyes.close();

        } finally {

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();

        }
    }
}
