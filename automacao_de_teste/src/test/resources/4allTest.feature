Feature: prova_4all
  Eu sou um usuario
  Que pode adicionar itens no carrinho
  Que posso remover itens do carrinho
  E posso finalizar o pedido

  @enabled
  Scenario: Adicionar todos itens de doces e alterar brigadeiro
    Given selecionou a categoria 'doces'
    And Adicionou todos os itens da categoria 'doces' no carrinho
    And selecionou a categoria 'todos'
    And Acessou o carrinho
    And Alterou a quantidade do item 'Brigadeiro' para 4
    Then Finalizar a compra

  @enabled
  Scenario: Adicionar todos os itens de bebidas adicionar rissole e alterar
    Given selecionou a categoria 'bebidas'
    And Adicionou todos os itens da categoria 'bebidas' no carrinho
    And selecionou a categoria 'todos'
    And Adicionou o item 'Rissole Médio' da categoria 'salgados' no carrinho
    And Acessou o carrinho
    And Alterou a quantidade do item 'Rissole Médio' para 9
    And Alterou a quantidade do item 'Rissole Médio' para 5
    And Validar o valor total de produtos do carrinho
    Then Finalizar a compra