import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.StdoutLogHandler;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import com.applitools.eyes.images.Eyes;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PasswordScreen extends test {
    public static void main(String args[]) throws MalformedURLException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver  driver = new AndroidDriver(serverAddress, test.getDesiredCapabilities("192.168.213.102:5555"));
        //driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
        Eyes eyes = new Eyes();
        eyes.setApiKey("8D29upwCe8JaIFYCRjf4iQfNeqflep8tT2O102RwAWdbs110");
        eyes.getSaveNewTests();
        eyes.setMatchLevel(MatchLevel.CONTENT);
        eyes.setLogHandler(new StdoutLogHandler(true));
        eyes.setHostOS("Android");
        eyes.setHostApp("Nex2me");

        BufferedImage img;

        try {
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
                driver.findElement(By.id("co.introtuce.nex2me.android:id/mobileno")).sendKeys("8425996444");
                driver.findElement(By.id("co.introtuce.nex2me.android:id/button3")).click();
                eyes.open("Nex2me","PasswordScreen");
                img = ImageIO.read(new File("C:\\Pallavi\\Zeplin_android\\WelcomeBack.png"));
                eyes.checkImage(img,"PasswordScreen");
                //driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
                eyes.close();
        }
        catch (Exception e){

        }

    }


}

