import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Robo {
    public static WebDriver driver;

    public void abrirSistema() throws InterruptedException {
        RoboDriver.builder().abrirSistema();
    }
    public void fecharDriver() {
        RoboDriver.builder().fecharDriver();
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public By getById(String id) {
        return By.id(id);
    }


    public By getByCssSelector(String cssSelector) {
        return By.cssSelector(cssSelector);
    }

    public WebElement getElemento(By by) {
        return getDriver().findElement(by);
    }

    public void selecionarOpcaoCombo(By byMenu, By byCategoria) {
        this.getElemento(byMenu).click();
        this.getElemento(byCategoria).click();
    }

    public void clicarNoItem(By item) {
        this.getElemento(item).click();
    }

    public String pegarTexto(By item) {
        return this.getElemento(item).getText();
    }

    public void verificarConteudo(String esperado, String recebido) {
        Assert.assertTrue("Conteudo não encontrado", esperado.contains(recebido));
    }

    public void iniciar(String navegador) {
        this.iniciarDriver(navegador);
    }

    public void iniciarDriver(String navegador) {
        try {
            this.setDriver(navegador);
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public void setDriver(String browser) {
        RoboDriver.builder().setDriver(browser);
    }

    public static void setDriver(WebDriver driver) {
        Robo.driver = driver;
    }


    public void fecharNotificação(By toast) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".Toastify__close-button")));
        this.getElemento(toast).click();
    }

    public void acessarCarrinho(By carrinho) {
        this.getElemento(carrinho).click();
    }
}
