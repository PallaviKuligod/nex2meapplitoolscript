import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.images.Eyes;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;


public class HomeScreen extends test {
    public static void main(String args[]) throws MalformedURLException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver  driver = new AndroidDriver(serverAddress, test.getDesiredCapabilities("192.168.213.102:5555"));
        //driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
        Eyes eyes = new Eyes();
        eyes.setApiKey("8D29upwCe8JaIFYCRjf4iQfNeqflep8tT2O102RwAWdbs110");
        eyes.getSaveNewTests();
        eyes.setMatchLevel(MatchLevel.EXACT);


        try {
                /*driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
                driver.findElement(By.id("co.introtuce.nex2me.android:id/mobileno")).sendKeys("8425996444");
                driver.findElement(By.id("co.introtuce.nex2me.android:id/button3")).click();
                driver.findElement(By.id("co.introtuce.nex2me.android:id/editText7")).sendKeys("Pass@1234");
                driver.findElement(By.id("co.introtuce.nex2me.android:id/button4")).click();*/
                driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));


                //eyes.open(driver, "Nex2me","Home Screen");


               // eyes.checkWindow("Home Screen");

               /* eyes.checkElement(By.id("co.introtuce.nex2me.android:id/imageView19"));
                eyes.checkElement(By.id("co.introtuce.nex2me.android:id/notify"));
                eyes.checkElement(By.id("co.introtuce.nex2me.android:id/invite_btn"));
                eyes.checkElement(By.id("co.introtuce.nex2me.android:id/refprg"));*/
                eyes.close();


        }
            catch (Exception e){

        }

    }


}

