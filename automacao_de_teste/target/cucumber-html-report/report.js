$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/resources/4allTest.feature");
formatter.feature({
  "line": 1,
  "name": "prova_4all",
  "description": "Eu sou um usuario\r\nQue pode adicionar itens no carrinho\r\nQue posso remover itens do carrinho\r\nE posso finalizar o pedido",
  "id": "prova-4all",
  "keyword": "Feature"
});
formatter.before({
  "duration": 66300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Adicionando itens",
  "description": "",
  "id": "prova-4all;adicionando-itens",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@enabled"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "selecionou a categoria \u0027doces\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Adicionou todos os itens da categoria \u0027doces\u0027 no carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "selecionou a categoria \u0027todos\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Acessou o carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Alterou a quantidade do item \u0027Brigadeiro\u0027 para 4",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Finalizar a compra",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "doces",
      "offset": 24
    }
  ],
  "location": "Steps.seleciou_a_categoria(String)"
});
formatter.result({
  "duration": 140497100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "doces",
      "offset": 39
    }
  ],
  "location": "Steps.adicionar_itens_no_carrinho(String)"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/");
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 1124227300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "todos",
      "offset": 24
    }
  ],
  "location": "Steps.seleciou_a_categoria(String)"
});
formatter.result({
  "duration": 74755200,
  "status": "passed"
});
formatter.match({
  "location": "Steps.acessou_o_carrinho()"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 343877200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Brigadeiro",
      "offset": 30
    },
    {
      "val": "4",
      "offset": 47
    }
  ],
  "location": "Steps.alterou_a_quantidade_do_item(String,int)"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded2.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded3.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 1015385600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.finalizar_a_compra()"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "duration": 417729700,
  "status": "passed"
});
formatter.before({
  "duration": 8900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Calculate cost with a wrong leaving date",
  "description": "",
  "id": "prova-4all;calculate-cost-with-a-wrong-leaving-date",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@enabled"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "selecionou a categoria \u0027bebidas\u0027",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Adicionou todos os itens da categoria \u0027bebidas\u0027 no carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "selecionou a categoria \u0027todos\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Adicionou o item \u0027Rissole Médio\u0027 da categoria \u0027salgados\u0027 no carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Acessou o carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Alterou a quantidade do item \u0027Rissole Médio\u0027 para 9",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Alterou a quantidade do item \u0027Rissole Médio\u0027 para 5",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Validar o valor total de produtos do carrinho",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Finalizar a compra",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "bebidas",
      "offset": 24
    }
  ],
  "location": "Steps.seleciou_a_categoria(String)"
});
formatter.result({
  "duration": 93884400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bebidas",
      "offset": 39
    }
  ],
  "location": "Steps.adicionar_itens_no_carrinho(String)"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/");
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "duration": 1781693300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "todos",
      "offset": 24
    }
  ],
  "location": "Steps.seleciou_a_categoria(String)"
});
formatter.result({
  "duration": 69870400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rissole Médio",
      "offset": 18
    },
    {
      "val": "salgados",
      "offset": 47
    }
  ],
  "location": "Steps.adicion_o_item_da_categoria(String,String)"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/");
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "duration": 580946900,
  "status": "passed"
});
formatter.match({
  "location": "Steps.acessou_o_carrinho()"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded8.png");
formatter.result({
  "duration": 332861000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rissole Médio",
      "offset": 30
    },
    {
      "val": "9",
      "offset": 50
    }
  ],
  "location": "Steps.alterou_a_quantidade_do_item(String,int)"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded9.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded10.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded11.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded12.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded13.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded14.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded15.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded16.png");
formatter.result({
  "duration": 2561083900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rissole Médio",
      "offset": 30
    },
    {
      "val": "5",
      "offset": 50
    }
  ],
  "location": "Steps.alterou_a_quantidade_do_item(String,int)"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded17.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded18.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded19.png");
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded20.png");
formatter.result({
  "duration": 1321317600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.validar_o_valor_total_de_produtos_do_carrinho()"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded21.png");
formatter.result({
  "duration": 340411800,
  "status": "passed"
});
formatter.match({
  "location": "Steps.finalizar_a_compra()"
});
formatter.write("URL ACESSADA https://shopcart-challenge.4all.com/checkout");
formatter.embedding("image/png", "embedded22.png");
formatter.result({
  "duration": 431037300,
  "status": "passed"
});
});