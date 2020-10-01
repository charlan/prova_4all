import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/", plugin = {"json", "html:target/cucumber-html-report", "json:target/cucumber-html-report.json"},
        tags = "@enabled")


public class Runner {
    protected static Robo robo;

    public Runner() {

    }

    @BeforeClass()
    public static void iniciarAutomacao() throws InterruptedException {
        robo = new Robo();
        //implementado somente o chrome, mas já tem suporte para multiplos navegadores
        robo.iniciar("chrome");
        robo.abrirSistema();

    }

    @AfterClass
    public static void fechaSistema() {
        // o relatorio com os prints ficam na pasta target/cucumber-html-report
        robo.fecharDriver();
    }


}




