import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.images.Eyes;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;




public class BroadcastScreen extends test {
    public static void main(String args[]) throws MalformedURLException {
        URL serverAddress = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver driver = new AndroidDriver(serverAddress, getDesiredCapabilities("192.168.213.102:5555"));
        //driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
        Eyes eyes = new Eyes();
        eyes.setApiKey("8D29upwCe8JaIFYCRjf4iQfNeqflep8tT2O102RwAWdbs110");
        eyes.getSaveNewTests();
        eyes.setMatchLevel(MatchLevel.EXACT);
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            driver.findElement(By.id("co.introtuce.nex2me.android:id/accept")).click();
            driver.findElement(By.id("co.introtuce.nex2me.android:id/mobileno")).sendKeys("8425996444");
            driver.findElement(By.id("co.introtuce.nex2me.android:id/button3")).click();
            driver.findElement(By.className("android.widget.EditText")).sendKeys("Pass@1234");
            driver.findElement(By.id("co.introtuce.nex2me.android:id/button4")).click();
            /*WebDriverWait wait = new WebDriverWait(driver,5);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();
            driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button")).click();*/
            //WebDriverWait wait1 = new WebDriverWait(driver,5);
            //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Broadcast']")));
            System.out.println("1");
           // eyes.open(driver, "Nex2me","Home Screen");
            System.out.println("2");
            //eyes.checkWindow("Home Screen");
            //eyes.checkElement(By.id("co.introtuce.nex2me.android:id/notify"),3000,"Broadcast option click");
            //driver.findElement(By.xpath("*[text()='Broadcast']")).click();
            System.out.println("3");
            driver.findElement(By.id("co.introtuce.nex2me.android:id/notify")).click();
            System.out.println("Clicked on notification icon");
            //eyes.checkElement(By.id("co.introtuce.nex2me.android:id/imageView35"));
            System.out.println("4");
           /* eyes.checkElement(By.id("co.introtuce.nex2me.android:id/textView53"));
            eyes.checkElement(By.id("co.introtuce.nex2me.android:id/textView54"));
            eyes.checkElement(By.id("co.introtuce.nex2me.android:id/textView55"));
            eyes.checkElement(By.id("co.introtuce.nex2me.android:id/button6"));
            eyes.checkElement(By.id("co.introtuce.nex2me.android:id/textView50"));
            eyes.checkElement(By.linkText("Broadcast Later"));
            eyes.checkElement(By.linkText("Broadcast Now"));*/

            eyes.close();




        }catch (Exception e){

        }

    }

}


