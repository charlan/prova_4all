import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DecimalFormat;

public class RoboDriver extends Robo {
    public static RoboDriver builder() {
        return new RoboDriver();
    }

    public void abrirSistema() throws InterruptedException {
        String url = "https://shopcart-challenge.4all.com/";
        this.abrirSistema(url);
    }

    public void abrirSistema(String url) throws InterruptedException {
        getDriver().navigate().to(url);
    }

    public void fecharDriver() {
        getDriver().quit();
    }


    public void setDriver(String browser) {
        try {
            if (getDriver() == null) {
                String var2 = browser.trim().toUpperCase();

                byte var3 = -1;
                switch (var2.hashCode()) {
                    case -332435591:
                        if (var2.equals("HEADLESS")) {
                            var3 = 1;
                        }
                        break;
                    case -131469639:
                        if (var2.equals("FIREFOX")) {
                            var3 = 2;
                        }
                        break;
                    case 2332:
                        if (var2.equals("IE")) {
                            var3 = 3;
                        }
                        break;
                    case 109585133:
                        if (var2.equals("PHANTOM")) {
                            var3 = 4;
                        }
                        break;
                    case 1987167866:
                        if (var2.equals("CHROME")) {
                            var3 = 0;
                        }
                }

                switch (var3) {
                    case 0:
                        System.setProperty("webdriver.chrome.driver", SystemUtils.IS_OS_WINDOWS ? "src/test/resources/drivers/chromedriver.exe" : "drivers/chromedriver");
                        setDriver(new ChromeDriver());
                        break;
                    default:
                        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
                        setDriver(new ChromeDriver());
                }
                getDriver().manage().window().maximize();
            }
        } catch (Exception var15) {
            var15.printStackTrace();
        }

    }


}
