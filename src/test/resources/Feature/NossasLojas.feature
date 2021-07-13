#Author: paulitanegri@hotmail.com

@NossasLojas
Feature: Acessar Nossas Lojas
  Eu como usuario quero acessar o campo Nossas Lojas
  
  Background: Acessar Nossas Lojas
  Given que eu tenha acessado o site "https://www.drogasil.com.br"
  When eu clicar <nossas lojas> 
  

  @tag1
  Scenario: Endereco valido na Busca de Lojas
    And digitar um endereco valido
    Then eu acesso as lojas correspondentes
    
      
    @tag2
  Scenario: Endereco invalido na Busca de Lojas
    And eu digitar um endereco invalido
    Then acesso a mensagem "Sua busca nao retornou resultados"
    
    @tag3
  Scenario: Dados em branco na Busca de Lojas
    And eu nao digitar nenhum endereco 
    Then acesso a  mensagem de "Sua busca nao retornou resultados"
    
  
   
   

 


