import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.appium.Eyes;
import com.applitools.eyes.appium.Target;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class login_test_app extends test{
    public static void main(String[] args) throws IOException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(serverAddress, test.getDesiredCapabilities("192.168.213.102:5555"));
        //driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
        Eyes eyes = new Eyes();
        eyes.setApiKey("8D29upwCe8JaIFYCRjf4iQfNeqflep8tT2O102RwAWdbs110");
        eyes.getSaveNewTests();
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        // Initialize the eyes SDK and set your private API key.
        eyes.setApiKey("8D29upwCe8JaIFYCRjf4iQfNeqflep8tT2O102RwAWdbs110");
        eyes.setHostOS("Android");
        eyes.setHostApp("Nex2me");

        // Define the OS and hosting application to identify the baseline.

        try {

            // Start the test with a viewport size of 800x600.
            eyes.open(driver, "Nex2me", "Login Test", new RectangleSize(412, 797));
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
            // Visual validation.
            eyes.check("Test Login", Target.window());

            // End visual UI testing.
            eyes.close();

        } finally {

            // If the test was aborted before eyes.close was called, ends the test as aborted.
            eyes.abortIfNotClosed();
            driver.quit();

        }
    }
}
