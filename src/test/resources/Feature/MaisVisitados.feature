#Author: paulaitanegri@hotmail.com

Feature: Acessar produtos páginas com produtos mais visitados
Eu como usuario quero os produtos mais visitados

Scenario: Acessar produtos mais visitados no site
   Given que eu esteja  no site "https://m2-stage.drogasil.com.br" 
   When eu clicar no produto do menu <mais visitados no momento>
   Then acesso as informacoes do produto desejado
  