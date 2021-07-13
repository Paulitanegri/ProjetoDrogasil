package Steps;

import java.io.IOException;

import Metodos.Metodo;
import Pages.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisVisitados {
	
	Metodo metodo = new Metodo();
	Elementos elemento = new Elementos();
	
	@Given("que eu esteja  no site {string}")
	public void que_eu_esteja_no_site(String site) {
		metodo.abrirNavegador(site);
	    
	}

	@When("eu clicar no produto do menu <mais visitados no momento>")
	public void eu_clicar_no_produto_do_menu_mais_visitados_no_momento() throws InterruptedException, IOException {
		Thread.sleep(1000);
		metodo.esperarClicar(elemento.getAceitar(), "clicar");
		Thread.sleep(1000);
		metodo.clicar(elemento.getClickVisitados());
		Thread.sleep(1000);
		metodo.screenShot("MaisVisitados");
		
	    
	}

	@Then("acesso as informacoes do produto desejado")
	public void acesso_as_informacoes_do_produto_desejado() {
		
	   
	}

}
