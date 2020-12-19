import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.images.Eyes;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Login extends test {
    public static void main(String args[]) throws MalformedURLException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver  driver = new AndroidDriver(serverAddress, test.getDesiredCapabilities("192.168.213.102:5555"));
        //driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
        Eyes eyes = new Eyes();
        eyes.setApiKey("8D29upwCe8JaIFYCRjf4iQfNeqflep8tT2O102RwAWdbs110");
        eyes.getSaveNewTests();
        eyes.setMatchLevel(MatchLevel.CONTENT);


        try {
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
                //eyes.open(driver, "Nex2me","Login Screen");
                //driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
                //eyes.checkWindow("Login Screen");
               // eyes.close();
        }
        catch (Exception e){

        }

    }


}

