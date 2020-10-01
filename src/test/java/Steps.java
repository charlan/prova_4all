import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;


public class Steps extends Runner {

    private ConsultaProdutos consultaProdutos;
    private Scenario myScenario;

    public Steps() {
        consultaProdutos = new ConsultaProdutos();
    }


    @Before()
    public void embedScreenshotStep(Scenario scenario) {
        myScenario = scenario;

    }

    @Then("^Tirei um print$")
    public void tirei_um_print() throws Throwable {

        try {
            myScenario.write("URL ACESSADA " + robo.getCurrentUrl());
            byte[] screenshot = ((TakesScreenshot) robo.getDriver()).getScreenshotAs(OutputType.BYTES);
            myScenario.embed(screenshot, "image/png");
        } catch (WebDriverException cce) {
            cce.printStackTrace();
        } catch (ClassCastException cce) {
            cce.printStackTrace();
        }
    }


    @Given("^selecionou a categoria '([^\"]*)'$")
    public void seleciou_a_categoria(String categoria) {
        if (categoria.toUpperCase().equals("BEBIDAS")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getBedidas());
        } else if (categoria.toUpperCase().equals("DOCES")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getDoces());
        } else if (categoria.toUpperCase().equals("SALGADOS")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getSalgados());
        } else if (categoria.toUpperCase().equals("PRATOS QUENTES")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getPratosQuentes());
        } else if (categoria.toUpperCase().equals("TODOS")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getTodosPratos());
        }
    }

    @When("^Adicionou todos os itens da categoria '([^\"]*)' no carrinho$")
    public void adicionar_itens_no_carrinho(String categoria) throws Throwable {
        if (categoria.toUpperCase().equals("BEBIDAS")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getBedidas());
            robo.clicarNoItem(consultaProdutos.getItens("coca-cola lata"));
            robo.fecharNotificação(consultaProdutos.getToast());
            robo.clicarNoItem(consultaProdutos.getItens("fanta uva lata"));
            robo.fecharNotificação(consultaProdutos.getToast());
            robo.clicarNoItem(consultaProdutos.getItens("água mineral sem gás"));
        } else if (categoria.toUpperCase().equals("DOCES")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getDoces());
            robo.clicarNoItem(consultaProdutos.getItens("brigadeiro"));
            robo.fecharNotificação(consultaProdutos.getToast());
            robo.clicarNoItem(consultaProdutos.getItens("alfajor de chocolate"));
        } else if (categoria.toUpperCase().equals("SALGADOS")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getSalgados());
        } else if (categoria.toUpperCase().equals("PRATOS QUENTES")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getPratosQuentes());
        } else if (categoria.toUpperCase().equals("TODOS")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getTodosPratos());
        }
        tirei_um_print();

    }

    @When("^Adicionou o item '([^\"]*)' da categoria '([^\"]*)' no carrinho$")
    public void adicion_o_item_da_categoria(String item, String categoria) throws Throwable {
        seleciou_a_categoria(categoria);

        if (categoria.toUpperCase().equals("SALGADOS")) {
            robo.selecionarOpcaoCombo(consultaProdutos.getCampoOpcao(), consultaProdutos.getSalgados());
            robo.clicarNoItem(consultaProdutos.getItens("rissole médio"));
            robo.fecharNotificação(consultaProdutos.getToast());
        }
        tirei_um_print();

    }

    @When("^Acessou o carrinho$")
    public void acessou_o_carrinho() throws Throwable {
        robo.acessarCarrinho(consultaProdutos.getCarrinho());
        tirei_um_print();
    }


    @Then("^Finalizar a compra$")
    public void finalizar_a_compra() throws Throwable {
        robo.clicarNoItem(consultaProdutos.getBotaoFinalizarCompra());

        String mensagem = robo.pegarTexto(consultaProdutos.getMensagemFinal());
        tirei_um_print();
        robo.verificarConteudo("Pedido realizado com sucesso!", mensagem);
        robo.clicarNoItem(consultaProdutos.getFechar());
    }

    @When("^Alterou a quantidade do item '([^\"]*)' para (\\d+)$")
    public void alterou_a_quantidade_do_item(String produto, int qtde) throws Throwable {

        int qtdeIntProduto = 0;
        if (produto.toUpperCase().equals("RISSOLE MÉDIO")) {
            qtdeIntProduto = Integer.parseInt(robo.pegarTexto(consultaProdutos.getItensCarrinhoAcao("rissole médio", "contar")));
        } else if (produto.toUpperCase().equals("BRIGADEIRO")) {
            qtdeIntProduto = Integer.parseInt(robo.pegarTexto(consultaProdutos.getItensCarrinhoAcao("brigadeiro", "contar")));
        }

        if (qtdeIntProduto < qtde) {
            for (int i = 0; i < qtde - 1; i++) {
                robo.clicarNoItem(consultaProdutos.getItensCarrinhoAcao(produto.toUpperCase(), "adicionar"));
                tirei_um_print();
            }
        } else {
            for (int i = 0; i < qtde - 1; i++) {
                robo.clicarNoItem(consultaProdutos.getItensCarrinhoAcao(produto.toUpperCase(), "remover"));
                tirei_um_print();
            }
        }
    }

    @And("^Validar o valor total de produtos do carrinho$")
    public void validar_o_valor_total_de_produtos_do_carrinho() throws Throwable {
        String subTotal = robo.pegarTexto(consultaProdutos.getSubtotal());
        String total = robo.pegarTexto(consultaProdutos.getTotal());
        Assert.assertTrue("Valor não encontrado", subTotal.contains(total));
        tirei_um_print();

    }


}