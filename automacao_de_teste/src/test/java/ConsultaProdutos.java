import org.openqa.selenium.By;

public class ConsultaProdutos extends Runner {

    public By getCampoOpcao() {
        return robo.getById("open-categories-btn");
    }

    public By getBotaoFinalizarCompra() {
        return robo.getById("finish-checkout-button");
    }
    public By getBedidas() {
        return robo.getById("category-0");
    }

    public By getDoces() {
        return robo.getById("category-1");
    }

    public By getSalgados() {
        return robo.getById("category-2");
    }

    public By getPratosQuentes() {
        return robo.getById("category-3");
    }

    public By getTodosPratos() {
        return robo.getById("category-all");
    }

    public By getCarrinho() {
        return robo.getById("cart-products-qtd");
    }
    public By getSubtotal() {
        return robo.getById("subtotal-price");
    }
    public By getTotal() {
        return robo.getById("price-total-checkout");
    }

    public By getItens(String itens) {
        if (itens.toUpperCase().equals("BRIGADEIRO")) {
            return robo.getById("add-product-4-btn");
        }
        if (itens.toUpperCase().equals("ALFAJOR DE CHOCOLATE")) {
            return robo.getById("add-product-5-btn");
        }
        if (itens.toUpperCase().equals("COCA-COLA LATA")) {
            return robo.getById("add-product-0-btn");
        }
        if (itens.toUpperCase().equals("FANTA UVA LATA")) {
            return robo.getById("add-product-1-btn");
        }
        if (itens.toUpperCase().equals("ÁGUA MINERAL SEM GÁS")) {
            return robo.getById("add-product-2-btn");
        }
        if (itens.toUpperCase().equals("RISSOLE MÉDIO")) {
            return robo.getById("add-product-3-btn");
        }
        return robo.getById("category-all");
    }

    public By getItensCarrinhoAcao(String itens, String acao) {
        if (itens.toUpperCase().equals("RISSOLE MÉDIO")) {
            if (acao.toUpperCase().equals("ADICIONAR")) {
                return robo.getById("add-product-3-qtd");
            } else if (acao.toUpperCase().equals("REMOVER")) {
                return robo.getById("remove-product-3-qtd");
            }else if (acao.toUpperCase().equals("CONTAR")) {
                return robo.getById("product-3-qtd");
            }
        }
        if (itens.toUpperCase().equals("BRIGADEIRO")) {
            if (acao.toUpperCase().equals("ADICIONAR")) {
                return robo.getById("add-product-4-qtd");
            } else if (acao.toUpperCase().equals("REMOVER")) {
                return robo.getById("remove-product-4-qtd");
            }else if (acao.toUpperCase().equals("CONTAR")) {
                return robo.getById("product-4-qtd");
            }
        }
        return robo.getById("category-all");
    }

    public By getToast() {
        return robo.getByCssSelector(".Toastify__close-button");
    }

    public By getMensagemFinal() {
        return robo.getByCssSelector(".sc-dNLxif");
    }

    public By getFechar() {
        return robo.getByCssSelector(".close-modal");
    }


}